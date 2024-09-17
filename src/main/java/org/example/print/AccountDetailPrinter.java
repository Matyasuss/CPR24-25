package org.example.print;

import org.example.accounts.BankAccount;

public class AccountDetailPrinter {
    public void printDetail(BankAccount bankAccount) {
        System.out.printf("Account owned by '%s %s', has currently balance of %.2f.\n", bankAccount.getOwner().getFirstname(), bankAccount.getOwner().getLastname(), bankAccount.getBalance());
    }
}