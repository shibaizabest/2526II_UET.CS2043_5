package com.week9.bank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Represents a bank account with simple deposit and withdraw operations. */
public class BankAccount {

  private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);

  private final String accountNumber;
  private double balance;

  public BankAccount(String accountNumber, double openingBalance) {
    if (accountNumber == null || accountNumber.isBlank()) {
      throw new IllegalArgumentException("Account number is required");
    }
    if (openingBalance < 0) {
      throw new IllegalArgumentException("Opening balance must not be negative");
    }
    this.accountNumber = accountNumber;
    this.balance = openingBalance;
    LOGGER.info(
        "Account created accountNumber={} openingBalance={}", accountNumber, openingBalance);
  }

  public void deposit(double amount) {
    validatePositiveAmount(amount);
    balance += amount;
    LOGGER.info(
        "Deposit completed accountNumber={} amount={} balance={}",
        accountNumber,
        amount,
        balance);
  }

  public void withdraw(double amount) {
    validatePositiveAmount(amount);
    if (amount > balance) {
      LOGGER.error(
          "Withdraw rejected accountNumber={} amount={} balance={}",
          accountNumber,
          amount,
          balance);
      throw new IllegalArgumentException("Insufficient balance");
    }
    balance -= amount;
    LOGGER.info(
        "Withdraw completed accountNumber={} amount={} balance={}",
        accountNumber,
        amount,
        balance);
  }

  public double getBalance() {
    return balance;
  }

  private static void validatePositiveAmount(double amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("Amount must be positive");
    }
  }
}
