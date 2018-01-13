package banking;

public class account {
	int acc_no;
	String name;
	float amount;
	static String bank_name="bank of america";
	
void insert(int ac, String n , float amt) {
	acc_no = ac;
	name= n;
	amount = amt;
}
void bank_name(String bank) {
	bank_name =bank;
}
void deposit (float amt ) {//this deposit method will deposit into acc
	amount = amount+amt;
	System.out.println("deposited amount " +amt);
}
void withraw(float amt) {//this method will withraw from acount
if (amount <amt) {
	System.out.println("there is insficient balance avaliable");
}else {
	amount = amount-amt;
	System.out.println("amount widthrwan :" +amt);
}
}
void checkBalance() {
	System.out.println("check balance "  +amount);
}
void display() {
	System.out.println("Welcome to " + bank_name);
	System.out.println(bank_name+ "  custumer acc_nno is : "  +  acc_no +  "  costumer name is: "  + name + "  acc_balance is :"  +amount);
}
}