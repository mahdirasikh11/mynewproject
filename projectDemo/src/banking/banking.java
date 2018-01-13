package banking;

public class banking {

	public static void main(String[] args) {
	
		account mahdi = new account();
		mahdi.insert(100, "mahdi rasikh", 1);
		mahdi.display();
		mahdi.deposit(40000);
		mahdi.withraw(4000);
		mahdi.checkBalance();

	}

}
