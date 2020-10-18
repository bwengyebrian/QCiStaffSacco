package com.qualitychemicals.qciss.transaction.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankPayment {
    private String sender;
    private String receiver;
    private double amount;
}