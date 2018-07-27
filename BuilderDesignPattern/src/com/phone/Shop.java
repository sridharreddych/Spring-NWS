package com.phone;

public class Shop {

	public static void main(String args[]){ 
		
		//Phone p = new Phone("Android",4,"Qualcom",5.5,3100);
		Phone p = new PhoneBuilder().setOs("Andriod").setRam(4).getPhone();
		System.out.println(p);
	}
}
