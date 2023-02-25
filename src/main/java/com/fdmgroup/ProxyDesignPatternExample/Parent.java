package com.fdmgroup.ProxyDesignPatternExample;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Han & Yew Seng
 * @version 23 Feb 2023
 * @since 23 Feb 2023
 */

/**
 * Parent is the proxy of the Toddler class. Parent class causes the Toddler class to call the buyToy method only when a permissable toy name is input. 
 */

public class Parent implements Person{
	
	/**
	 * A list of inappropriate toys.
	 */
	private static final ArrayList<String> inappropriateToys;
	
	/**
	 * The parent's son.
	 */
	private final Toddler mySon = new Toddler();
	
	Logger logger = LogManager.getLogger(Parent.class);
	
	static {
		inappropriateToys = new ArrayList<String>();
		inappropriateToys.add("Pocket knife");
		inappropriateToys.add("Breaking bad meth kitchen set");
		inappropriateToys.add("My little Babi");
		inappropriateToys.add("Plastic Smith & Wesson gat");
	}

	/**
	 * Takes in the toyName and compares it to the list of inappropriate toys. Will allow son to buy toy if permissible. 
	 * {@inheritDoc}
	 * @param toyName
	 * @throws BuyToyException if any of the inappropriate toys are provided. 
	 */
	@Override
	public void buyToy(String toyName) throws BuyToyException {
		// TODO Auto-generated method stub
		if (inappropriateToys.contains(toyName)) {
			logger.fatal("You should not be buying your kid " + toyName);
			throw new BuyToyException("You should not be buying your kid " + toyName);
		} else {
			logger.trace("Parents bought " + toyName);
			mySon.buyToy(toyName);
		}
		
	}
	
	/**
	 * gets the Parent's Toddler object.
	 * @return Toddler.
	 */
	public Toddler getToddler() {
		return this.mySon;
	}
}
