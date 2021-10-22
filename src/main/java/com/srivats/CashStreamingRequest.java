package com.srivats;

import com.srivats.models.Balance;
import com.srivats.models.DepositRequest;
import io.grpc.stub.StreamObserver;

public class CashStreamingRequest implements StreamObserver<DepositRequest> {

    private int accountBalance;
    private StreamObserver<Balance> responseObserver;

    public CashStreamingRequest(StreamObserver<Balance> responseObserver) {

        this.responseObserver = responseObserver;
    }


    @Override
    public void onNext(DepositRequest depositRequest) {
        int accNum = depositRequest.getAccountNumber();
        int amount = depositRequest.getAmount();

        this.accountBalance = AccountDatabase.addBalance(accNum, amount);

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {

        Balance balance = Balance.newBuilder().setAmount(this.accountBalance).build();

        this.responseObserver.onNext(balance);
        this.responseObserver.onCompleted();
    }
}
