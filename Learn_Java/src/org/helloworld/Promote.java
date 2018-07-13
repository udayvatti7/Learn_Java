package org.helloworld;

public class Promote {

	public static void main(String[] args) {
		
		byte b = 10;
		short s = 12;
		int i = 600;
		char c = 'a';
		float f = 2.3f;
		double d = 3.14;
		
		double result = (f*b)+(d/c)-(i*s);
		
		System.out.println((f*b)+ " + " +(d/c)+" - "+(d*s));
		System.out.println("result = "+ result);

		//System.out.println("Integer of char: "+ (int)c);
	}

}
