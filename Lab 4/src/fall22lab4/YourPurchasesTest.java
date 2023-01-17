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

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

public class YourPurchasesTest
{
   private static final double EPSILON = 1E-12;

   @Test public void twoPurchases()
   {
      YourPurchases register = new YourPurchases();
      register.recordPurchase(0.75);
      register.recordPurchase(1.50);
      register.receivePayment(2, 0, 5, 0, 0);
      double expected = 0.25;
      Assert.assertEquals(expected, register.giveChange(), EPSILON);
    }
   
// YOUR TASKS ARE STATED HERE: 
   // RUN THE CODE YOU RECEIVED AND DEMO THAT THERE IS NO ERROR in YourPurchasesTest.java 

  
     
   }

