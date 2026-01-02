package com.business.blc.elc;

public class BankingSystem {
	long accountNumber;
	String accountHolderName;
    double balance;
	 
	 public long getaccountNumber() {
		 return accountNumber;
	 }
	 public String getaccountHolderName() {
		 return accountHolderName;
	 }
	 public double getbalance() {
		 return balance;
	 }
	 public void setaccountNumber(long l) {
		 accountNumber=l;
	 }
	 public void setaccountHolderName(String name) {
		 accountHolderName=name;
	 }
	 public void setbalance(double d) {
		 balance=d;
	 }
	 public String getBankApplication() {
		 return "AccountNumber:"+accountNumber+"\nAccountHolderName:"+accountHolderName+"\nBalance:"+balance;
	 }
	}

