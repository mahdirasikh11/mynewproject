package Computer_Demo;

public class Allcomputer {

	
	
	static Mycomputer_demo c1;
	public static void main(String[] args) {
		
		
	  c1 = new Mycomputer_demo("macbook pro", 4521, "selver", 8, 4,200);
	  String info = c1.computerInormation();  
	  System.out.println(info);
	  c1.powerOf();
	  c1.powerOn();
	  c1.setmodel();
	  c1.getmodel();
	  
	}

}
