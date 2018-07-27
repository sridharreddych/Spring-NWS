package com.sree.prototype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		BookShop bs = new BookShop();
		bs.setShopName("Novelty");
		bs.loadData();
		

		
		//BookShop bs1 = new BookShop();
		BookShop bs1 = (BookShop)bs.clone();
		bs.getBooks().remove(2);
		
		bs1.setShopName("A1");
		System.out.println(bs);
		System.out.println(bs1);
	}
}
