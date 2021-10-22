package com.srivats.client;

import com.srivats.models.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.concurrent.CountDownLatch;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankClientTest {
   private BankServiceGrpc.BankServiceBlockingStub blockingStub;

    private BankServiceGrpc.BankServiceStub asyncStub;
    @BeforeAll
    public void setup(){
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

         blockingStub = BankServiceGrpc.newBlockingStub(managedChannel);
        asyncStub = BankServiceGrpc.newStub(managedChannel);
    }

    @Test
    public void balanceTest(){
        BalanceCheckRequest balanceCheckRequest = BalanceCheckRequest.newBuilder()
                .setAccountNumber(30).build();
        Balance balance = this.blockingStub.getBalance(balanceCheckRequest);
        System.out.println("Received Balance :"+balance.getAmount());

    }

    @Test
    public void withdraw(){

        WithDrawRequest request = WithDrawRequest.newBuilder()
                .setAccountNumber(7).setAmount(40).build();

        this.blockingStub.withdraw(request)
                .forEachRemaining(money -> System.out.println("Received Amount :"+money.getValue()));
    }

    @Test
    public void withdrawAsync() throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(1);
        WithDrawRequest request = WithDrawRequest.newBuilder()
                .setAccountNumber(10).setAmount(50).build();

        this.asyncStub.withdraw(request, new MoneyStreamResponse(latch));
        latch.await();

    }

    @Test

    public void cashStreamingRequest() throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<DepositRequest> streamObserver = this.asyncStub.cashDeposit(new BalanceStreamObserver(latch));

        for (int i = 0; i < 10; i++) {
            DepositRequest depositRequest = DepositRequest.newBuilder().setAccountNumber(8).setAmount(10).build();
            streamObserver.onNext(depositRequest);
        }

        streamObserver.onCompleted();
        latch.await();
    }
}
