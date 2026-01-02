package com.business.blc.elc;

public class BankingApplication {

	public static void main(String[] args) {
		BankingSystem obj=new BankingSystem();
		obj.setaccountNumber(0234567);
		obj.setaccountHolderName("Umamaheswari");
		obj.setbalance(11500);
		
	 System.out.println(obj.getBankApplication());

	}

}
