package com.icici;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
//Scanner
//abstraction -> Bank = BankImpl -> upcasting
//while(true) -> infinte loop ->System.exit(0);
		//Menu Driven Program 1: Deposit Amount 2: wi 3:GB 4:exit
		//switch
		System.out.println("Welcome to ICICI Bank");
		System.out.println("-----------------------");
		Scanner scan=new Scanner(System.in);
		Bank bank=new BankImpl(5000);
		while(true) {
			System.out.println("1:Deposit Amount\n2:Withdraw Amount");
			System.out.println("3:Check Balance\n4:Exit");
			System.out.println("Enter choice:");
			int choice=scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Amount to Deposited:");
				int amountToDeposit=scan.nextInt();
				bank.deposit(amountToDeposit);//bank.deposit(scan.nextInt());
				break;
				
			case 2:
				System.out.println("Enter Amount to Withdrawn:");
				int amountToWithdraw=scan.nextInt();
				bank.withdraw(amountToWithdraw);//bank.withdraw(scan.nextInt());
				break;
			case 3:
				System.out.println("Available Balance: Rs."+bank.getbalance());
				break;
			case 4:
				System.out.println("Thank You, Visite Again");
				System.exit(0);
			default:
				try {
					throw new InvalidChoiceException("Invalid Choice, Kindly Enter Valid Choice ");
				}
				catch(Exception e){
					System.out.println(e.getMessage());
					
				}
			}
			System.out.println("======================");
		}
	}

}






