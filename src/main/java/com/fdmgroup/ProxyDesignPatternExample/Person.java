package com.fdmgroup.ProxyDesignPatternExample;

/**
 * Person interface is implemented by both the Toddler class and the Parent class, which is the proxy of the Toddler class.  
 * 
 * @author Han
 * @version 22 Feb 2023
 * @since 22 Feb 2023
 */

public interface Person {
	void buyToy(String toyName) throws BuyToyException;
}
