package arrayDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_demo {
	
	
	public static void main (String []args) {
		
		
	 Student st = new Student(100, "sharif khan");
	 
     Student st1 = new Student(101, "mahdi khan");
	
     Student st2 = new Student(102, "moner khan");
   
     ArrayList <Student> al = new ArrayList <Student>();
   
   
   al.add(st1);
   al.add(st2);
   al.add(st);
   al.remove(1);
   
  for (Student s:al) {
	   System.out.println("student id : "+s.id+ "  student name " +s.name + "  student collige is "+ s.colligeName );
	   
}   
}
}
