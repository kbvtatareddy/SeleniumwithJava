package com.hdfc.loans.homeloans;

public class DataTypes 
{

	byte b1 = -128; // 1 byte
	byte b2 = 127;
	
	short s1 = 32767; // 2 byte
	short s2 = -32768;
	
	int x = 100; // 4 bytes
	
	long l1 = 65645; // 8 bytes
	
	float f1 = 12.38f; // 4 bytes
	double d1 = 12.6565465; // 8 bytes
	
	boolean bb = true; // no size and just only true or false
	
	char c1 = 'c'; // 2 bytes
	
	String s3 = "This is B V TATA REDDY KARRI"; //
	
	static String cname;
	
	public static void main(String[] args) 
	{
		int y = 100;
		DataTypes D = new DataTypes();
		System.out.println("Byte " + D.b1);
		System.out.println("Byte " + D.b2);
		System.out.println("Short " + D.s1);
		System.out.println("Short " + D.s2);
		System.out.println("Int " + D.x);
		System.out.println("Long " + D.l1);
		System.out.println("Float " + D.f1);
		System.out.println("Double " + D.d1);
		System.out.println("Boolean " + D.bb);
		System.out.println("Char " + D.c1);
		System.out.println("String " + D.s3);
		
		System.out.println("Static Variable: String " + cname);
		
		System.out.println("Local Variable: Integer " + y);
	}

}
