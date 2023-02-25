package com.fdmgroup.ProxyDesignPatternExample;

/**
 * The BuyToyException is thrown when an inappropriate toy is attempted to be bought. 
 * 
 * @author Han
 * @version 22 Feb 2023
 * @since 22 Feb 2023
 */

public class BuyToyException extends Exception{
	
	public BuyToyException(String message) {
		super(message);
	}

}
