package com.fdmgroup.ProxyDesignPatternExample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Han & Yew Seng
 * @version 23 Feb 2023
 * @since 23 Feb 2023
 */

/**
 * Toddler object is created within the Parent class and can only buy toys that are permissible. 
 */
public class Toddler implements Person{
	/**
	 * The toy name.
	 */
	private String toyName;
	Logger logger = LogManager.getLogger(Toddler.class);

	@Override
	/**
	 * Takes in the toyName after Parent class calls this and stores it in the toyName attribute.
	 * {@inheritDoc}
	 * @param toyName
	 */
	public void buyToy(String toyName) {
		// TODO Auto-generated method stub
		logger.trace(toyName + " has been given to child");
		this.toyName = (toyName);
	}

	/**
	 * Checks the present toy given.
	 * @return toyName
	 */
	public String getToyName() {
		logger.trace(toyName + " is shown to you by child");
		return this.toyName;
	}	
}
