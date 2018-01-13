package banking_project;

public class banking_test {

	public static void main(String[] args) {
		
		Account mahdi = new Account(100, "mahdi rasikh", "mah.rasikh@gmail.com", 1);
		System.out.println("Acount_no :  "+mahdi.getAcc_no());
		System.out.println("name : "+mahdi.getCustomer_name());
	    
		mahdi.deposti(40000);
		mahdi.widthraw(2000);
		System.out.println("===================================================");
		
		Account sharif = new Account(1002, "sharif khan sahel", "sharif@yahoo.com",1000);
		System.out.println("Name  :"  +sharif.Customer_name);

		System.out.println(" avalailbe balance :"  + mahdi.getBalance());
	    System.out.println("Acc_no :"  +sharif.getAcc_no());
	    sharif.deposti(1);
	    sharif.widthraw(1000);
	}

}
