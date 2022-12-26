package org.research;

public class JavaPractice {
	
	
	public static void main(String[] args) {
		
		
			

		
	}
	
	
}


class Vehicles {
	
	void m1() {
		System.out.println("Vehicle");
	}

	public void printName(String string) {
		// TODO Auto-generated method stub
		
	}

}

class Cars extends Vehicles{
	
	void m1() {
		System.out.println("Car");
	}
	
	public void printName(String name) {
		System.out.println("Name is "+name);
	}
//	void printName(Object obj) {
//		System.out.println("Obj is "+obj);
//	}
}
class Honda extends Cars {
	
	void m1() {
		System.out.println("Honda");
	}
}
