package org.example.accounts;

import org.example.accounts.cards.BankCardFactory;
import org.example.people.Owner;

public class StudentBankAccount extends BankAccount {

    private String studentStudiesConfirmationExpiresAt = null;

    public StudentBankAccount(double balance, Owner owner, String accountNumber) {
        super(balance, owner, accountNumber, BankCardFactory.createBankCard());
    }

    public StudentBankAccount(double balance, Owner owner, String accountNumber, String studentStudiesConfirmationExpiresAt) {
        super(balance, owner, accountNumber, BankCardFactory.createBankCard());

        this.studentStudiesConfirmationExpiresAt = studentStudiesConfirmationExpiresAt;
    }

    public String getStudentStudiesConfirmationExpiresAt() {
        return studentStudiesConfirmationExpiresAt;
    }

    public void setStudentStudiesConfirmationExpiresAt(String studentStudiesConfirmationExpiresAt) {
        this.studentStudiesConfirmationExpiresAt = studentStudiesConfirmationExpiresAt;
    }
}