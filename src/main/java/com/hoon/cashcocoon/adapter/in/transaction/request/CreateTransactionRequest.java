package com.hoon.cashcocoon.adapter.in.transaction.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateTransactionRequest {

    private long categoryIdx;

    private LocalDate date;

    private long amount;

    private String memo;
}
