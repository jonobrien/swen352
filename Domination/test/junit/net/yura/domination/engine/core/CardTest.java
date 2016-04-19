/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.yura.domination.engine.core;

import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Jon_2
 */
public class CardTest extends TestCase {
    
    public CardTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    

    @Test
    public void testPrint() {
       System.out.println("Card test");
    }

    @Test
    public void testGetName() {
        Continent testContinent = new Continent("continentString1", "continentString2",1234,4321);
        Country testCountry = new Country(1,"1","2",testContinent, 1,1);
        Card testCard = new Card("Cavalry", testCountry);
        assertEquals("Cavalry", testCard.getName());
    }


    // test for setName exception
    @Test
    public void testSetNameThrow() {
        Continent testContinent = new Continent("continentString1", "continentString2",1234,4321);
        Country testCountry = new Country(1,"1","2",testContinent, 1,1);
        try {
            Card testCard = new Card("errorType", testCountry);
            org.junit.Assert.fail("IllegalArgumentException should be thrown");
        }
        catch (IllegalArgumentException e) {
            // success if thrown
        }
    }


    @Test
    public void testGetCountry() {
        Continent testContinent = new Continent("continentString1", "continentString2",1234,4321);
        Country testCountry = new Country(1,"1","2",testContinent, 1,1);
        Card testCard = new Card("Cavalry", testCountry);
        assertEquals(testCountry,testCard.getCountry());
    }


    @Test
    public void testSetContry() {
        Continent testContinent = new Continent("continentString1", "continentString2",1234,4321);
        Country testCountry = new Country(1,"1","2",testContinent, 1,1);
        Country testCountryTwo = new Country(2,"3","4",testContinent, 2,2);
        Card testCard = new Card("Cavalry", testCountry);
        testCard.setCountry(testCountryTwo);
        assertEquals(testCountryTwo,testCard.getCountry());
    }


    /**
     * Test of getCountry method, of class Card.
     */
    public void testGetCountryOld() {
        System.out.println("getCountry");
        Card instance = null;
        Country expResult = null;
        Country result = instance.getCountry();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCountry method, of class Card.
     */
    public void testSetCountry() {
        System.out.println("setCountry");
        Country a = null;
        Card instance = null;
        instance.setCountry(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Card.
     */
    public void testToString() {
        System.out.println("toString");
        Card instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
