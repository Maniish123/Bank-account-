package com.example.Bank_management_system.utils;

import java.time.Year;

public class AccountUtils {
    public static final String ACCOUNT_EXITS_CODE = "001";
    public static final String ACCOUNT_EXITS_MESSAGE = "The user already has an account created!";
    public static final String ACCOUNT_CREATION_CODE = "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "The account created successfully!";
    public static final String ACCOUNT_NOT_EXISTS_CODE = "003";
    public static final String ACCOUNT_NOT_EXISTS_MESSAGE = "User with the provided Account Number does not exists";
    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_FOUND_SUCCESS = "User Account Found";
    public static final String ACCOUNT_SECCESS_CREDIT_CODE = "005";
    public static final String ACCOUNT_SECCESS_CREDIT_MESSAGE = "account seccessfully credited";
    public static final String INSUFFICIENT_BALANCE_CODE = "006";
    public static final String INSUFFICIENT_BALANCE_MESSAGE = "Insufficient Balance";
    public static final String ACCOUNT_DEBITED_SUCCESS = "007";
    public static final String ACCOUNT_DEBIT_MESSAGE = "Account has been successfully debited";
    public static final String TRANSFER_SECCESSFUL_CODE = "008";
    public static final String TRANSFER_SECCESSFUL_MESSAGE = "Transfer seccessfull";

    public static String generateAccountNumner() {
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;
        int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();
        return accountNumber.append(year).append(randomNumber).toString();
    }
}
