package com.srivats.client;

import com.srivats.models.TransferRequest;
import com.srivats.models.TransferServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TransferClientTest {
    private TransferServiceGrpc.TransferServiceStub transferServiceStub;

    @BeforeAll
    public void setup() {

        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext().build();

        transferServiceStub = TransferServiceGrpc.newStub(managedChannel);
    }

    @Test
    public void transferTest() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<TransferRequest> transferStreamObs = transferServiceStub.transfer(new TranserStreamObserver(latch));
        for (int i = 0; i < 100; i++) {
            TransferRequest transferRequest = TransferRequest.newBuilder()
                    .setFromAccount(ThreadLocalRandom.current().nextInt(1, 11))
                    .setToAccount(ThreadLocalRandom.current().nextInt(1, 11))
                    .setAmount(ThreadLocalRandom.current().nextInt(1, 21))
                    .build();

            transferStreamObs.onNext(transferRequest);
        }
        transferStreamObs.onCompleted();
        latch.await();
    }
}
