package test0614;

import javax.naming.InsufficientResourcesException;

public class BankAccount {
  private int balance;

  public void withdraw(int amount) throws InsufficeintBalanceException {
    // 잔액부족인 경우의 예외처리 (커스텀 예외처리)
    if (balance < amount) {
      throw new InsufficeintBalanceException("잔액이 부족합니다.");
    }
    balance-=amount;
  }
}
