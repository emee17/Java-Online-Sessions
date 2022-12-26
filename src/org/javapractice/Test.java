package org.javapractice;

public class Test {
	
	
	
	int a = 4;
	
	int b = 5;
	
	int c =0;
	
	
	public int calculate() {
		
		
		c = a+b;
		
		//System.out.println(c);
		
		return c;
		
	}
	
	
	public static void main(String[] args) {
		
		
		Test t = new Test();
		
		System.out.println(t.c);
		
		int x = t.calculate();
		System.out.println(t.c);
		
		
		
		
	}
	
	
	

	
}


