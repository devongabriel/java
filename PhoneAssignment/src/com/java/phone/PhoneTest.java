package com.java.phone;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IPhone iX = new IPhone("X", 100, "MetroPC", " Zing");
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", " Ring, Ring");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		
		iX.displayInfo();
		System.out.println(iX.ring());
		System.out.println(iX.unlock());
	}

}
