package fall22lab4;
/**
 * File name: Kong.java
 * Author: Jesse Kong, 041056077
 * Course: CST8284-300 – OOP
 * Lab: 4
 * Date: Oct 17, 2022
 * Professor: Hesham Saadawi
 * Purpose: to demonstrate understanding of Junit
 */
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class YourPurchasesTest2 {

	private static final double EPSILON = 1E-12;
	
	//THIS TEST WOULD FAIL. 
	// TODO: WRITE ONE OR MORE TESTS TO SYSTEMATICALLY FIND THE SOURCE OF THE TEST FAILURE 
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50;
	    Assert.assertEquals(expected, changeResult, EPSILON);
		assertTrue(true);
		
	}
	
	 // YOUR TASKS ARE STATED HERE: 
	   // RUN THE TEST CASE IN YourPurchasesTest2.java, TO SHOW AN EXAMPLE OF AN UNSUCCESSFUL EXECUTION
	   // IMPROVE THIS CODE BY SYSTEMATICALLY ADDING MORE TEST CASES (NOT ALREADY STATED IN THIS CODE)
	   // TO LOCATE THE METHOD THAT IS CAUSING THE TEST FAILURE
	   
	   // ADD NEW TEST CASES HERE!!!
	/**
	 * This test case tests the GetPayment() method, works successfully
	 */
	@Test
	public void testGetPayment() {
			YourPurchases purchase = new YourPurchases();
			purchase.receivePayment(1, 0, 0, 0, 0);
			purchase.getPayment();
			double expected = 1;
			Assert.assertEquals(expected, purchase.getPayment(), EPSILON);
			assertTrue(true);
		   }
	
	/**
	 * This test case tests three recordPurchase methods with the expected result matching actual result
	 */
	@Test
	public void testThreeRecordPurchases() {
		YourPurchases purchase = new YourPurchases();
		purchase.recordPurchase(1.25);
		purchase.recordPurchase(5.50);
		purchase.recordPurchase(3.75);
		purchase.receivePayment(20, 0, 0, 0, 0);
		double expected = 9.50;
		Assert.assertEquals(expected, purchase.giveChange(), EPSILON);
		assertFalse(false);
	}
	
	
	
}
