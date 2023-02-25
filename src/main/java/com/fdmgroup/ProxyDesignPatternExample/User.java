package com.fdmgroup.ProxyDesignPatternExample;



public class User {

	public static void main(String[] args) throws BuyToyException {
		// TODO Auto-generated method stub
		Parent yourMom = new Parent();
		
		yourMom.buyToy("Pocket knife");
		
		System.out.println();
		System.out.println();
		
		System.out.println(yourMom.getToddler().getToyName());
	}
}
