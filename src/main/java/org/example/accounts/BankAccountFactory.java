package org.example.accounts;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.people.Owner;

@Singleton
public class BankAccountFactory {
    @Inject
    public AccountNumberGenerator bankAccountNumberGenerator;

    @Inject
    public GlobalAccountStorage globalAccountStorage;

    public BankAccount createBankAccount(double balance, Owner owner) {
        BankAccount bankAccount = new BankAccount(balance, owner, bankAccountNumberGenerator.generate());

        this.globalAccountStorage.put(bankAccount);

        return bankAccount;
    }

    public BankAccount createStudentBankAccount(double balance, Owner owner, String accountNumber) {
        return new BankAccount(balance, owner, accountNumber);
    }

    public BankAccount createStudentBankAccount(double balance, Owner owner) {
        return new BankAccount(balance, owner, bankAccountNumberGenerator.generate());
    }

    public SavingsAccount createSavingBankAccount(double balance, Owner owner, String accountNumber, double interestRate) {
        SavingsAccount account = new SavingsAccount(balance, owner, accountNumber, interestRate);

        this.globalAccountStorage.put(account);

        return account;
    }
}