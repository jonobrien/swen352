/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.yura.domination.engine.core;

import java.util.Vector;
import junit.framework.TestCase;

/**
 *
 * @author Jim Craveiro
 */
public class ContinentTest extends TestCase {
    
    public ContinentTest(String testName) {
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

    /**
     * Test of toString method, of class Continent.
     */
    public void testToString() {
        System.out.println("toString");
        Continent instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdString method, of class Continent.
     */
    public void testGetIdString() {
        System.out.println("getIdString");
        Continent instance = null;
        String expResult = "";
        String result = instance.getIdString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdString method, of class Continent.
     */
    public void testSetIdString() {
        System.out.println("setIdString");
        String a = "";
        Continent instance = null;
        instance.setIdString(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Continent.
     */
    public void testGetName() {
        System.out.println("getName");
        Continent instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Continent.
     */
    public void testSetName() {
        System.out.println("setName");
        String a = "";
        Continent instance = null;
        instance.setName(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Continent.
     */
    public void testGetColor() {
        System.out.println("getColor");
        Continent instance = null;
        int expResult = 0;
        int result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Continent.
     */
    public void testSetColor() {
        System.out.println("setColor");
        int a = 0;
        Continent instance = null;
        instance.setColor(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArmyValue method, of class Continent.
     */
    public void testGetArmyValue() {
        System.out.println("getArmyValue");
        Continent instance = null;
        int expResult = 0;
        int result = instance.getArmyValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArmyValue method, of class Continent.
     */
    public void testSetArmyValue() {
        System.out.println("setArmyValue");
        int a = 0;
        Continent instance = null;
        instance.setArmyValue(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOwned method, of class Continent.
     */
    public void testIsOwned() {
        System.out.println("isOwned");
        Player p = null;
        Continent instance = null;
        boolean expResult = false;
        boolean result = instance.isOwned(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOwned method, of class Continent.
     */
    public void testGetNumberOwned() {
        System.out.println("getNumberOwned");
        Player p = null;
        Continent instance = null;
        int expResult = 0;
        int result = instance.getNumberOwned(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOwner method, of class Continent.
     */
    public void testGetOwner() {
        System.out.println("getOwner");
        Continent instance = null;
        Player expResult = null;
        Player result = instance.getOwner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBorderCountries method, of class Continent.
     */
    public void testGetBorderCountries() {
        System.out.println("getBorderCountries");
        Continent instance = null;
        Vector expResult = null;
        Vector result = instance.getBorderCountries();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTerritoriesContained method, of class Continent.
     */
    public void testGetTerritoriesContained() {
        System.out.println("getTerritoriesContained");
        Continent instance = null;
        Vector expResult = null;
        Vector result = instance.getTerritoriesContained();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTerritoriesContained method, of class Continent.
     */
    public void testAddTerritoriesContained() {
        System.out.println("addTerritoriesContained");
        Country t = null;
        Continent instance = null;
        instance.addTerritoriesContained(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Continent.
     */
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Continent instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
