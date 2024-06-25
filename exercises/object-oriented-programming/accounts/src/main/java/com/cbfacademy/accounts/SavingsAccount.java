package com.cbfacademy.accounts;


public class SavingsAccount extends Account {

    protected double interestRate;

    public SavingsAccount (int accountNumber, double balance, double interestRate){
        super(accountNumber, balance); // calling the constructor from parent class
        this.interestRate = interestRate;
    }


    public void applyInterest() {
        deposit(getBalance() * interestRate);
    }

   
    public double getInterestRate() {
        return this.interestRate;
    }

    
    public void setInterestRate( double interestRate) {
        if (interestRate >= 0) {
        this.interestRate = interestRate;
        }
    }

}

