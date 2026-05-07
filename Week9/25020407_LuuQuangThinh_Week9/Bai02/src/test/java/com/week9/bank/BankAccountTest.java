package com.week9.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class BankAccountTest {

  @Test
  void depositIncreasesBalance() {
    BankAccount account = new BankAccount("ACC-001", 100_000);

    account.deposit(50_000);

    assertEquals(150_000, account.getBalance());
  }

  @Test
  void withdrawDecreasesBalance() {
    BankAccount account = new BankAccount("ACC-002", 100_000);

    account.withdraw(25_000);

    assertEquals(75_000, account.getBalance());
  }

  @Test
  void withdrawMoreThanBalanceFails() {
    BankAccount account = new BankAccount("ACC-003", 100_000);

    assertThrows(IllegalArgumentException.class, () -> account.withdraw(200_000));
  }
}
