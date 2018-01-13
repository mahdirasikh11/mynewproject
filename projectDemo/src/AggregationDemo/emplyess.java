package AggregationDemo;

public class emplyess {
	
	int id;
	String name;
	float salary;
	Address address;

	public emplyess(int id, String name, float salary, Address address) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		
	}
	void display() {
		System.out.println("employee id :  "+id+ " employee name :" +name+" employee salar: "+salary);
		System.out.println("employee address : "+address.city+ "  "  +address.state+  " " +address.country);
	}

	public static void main(String[] args) {
	Address add= new Address("dallas", "texas", "usa");
	
	emplyess emp =new emplyess(100, "mahdi rasikh", 10000, add);
		emp.display();
	}

}
