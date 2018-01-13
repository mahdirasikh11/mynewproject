package banking_project;

public class Account {
	
	
	int Acc_no;
	String Customer_name;
	String Email_Add;
	double balance;
	
	public Account(int acc_no, String customer_name, String email_Add, double balance) {
		
		Acc_no = acc_no;
		Customer_name = customer_name;
		Email_Add = email_Add;
		this.balance = balance;
	}
	public void balance (double avalible_balance) {
	this.balance =avalible_balance;
	}
		public void deposti(double deposit_amount) {
	     this.balance += deposit_amount;
	     System.out.println("new amount deposit "+deposit_amount+ " made. new balance is "+ balance);
		}
		public void widthraw (double widthraw_amount) {
			if (this.balance - widthraw_amount<=0 ) {
				
				System.out.println("only"  + balance + " not proccessed");
				
			}else {
				this.balance -= widthraw_amount;
				System.out.println("withrawal: " +widthraw_amount+"amount is processed. new balance is :"+balance);
			}
			
		}
		public int getAcc_no() {
			return Acc_no;
		}
		public void setAcc_no(int acc_no) {
			Acc_no = acc_no;
		}
		public String getCustomer_name() {
			return Customer_name;
		}
		public void setCustomer_name(String customer_name) {
			Customer_name = customer_name;
		}
		public String getEmail_Add() {
			return Email_Add;
		}
		public void setEmail_Add(String email_Add) {
			Email_Add = email_Add;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
}