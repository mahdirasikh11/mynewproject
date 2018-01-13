package classDemo;

public class student1 {
	
	
	public static void main (String []args) {
		
		studenDemo stud1 = new studenDemo();
        studenDemo stud2 = new studenDemo();
        stud1.inserData(100, "sharif sahel", 10000);
		stud2.inserData(1002, "mahdi rasikh", 100000);
		stud1.display();
		stud2.display();
	}

}
