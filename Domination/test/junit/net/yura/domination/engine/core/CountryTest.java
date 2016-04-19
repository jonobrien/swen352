/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.yura.domination.engine.core;

import java.util.List;
import java.util.Vector;
import junit.framework.TestCase;

/**
 *
 * @author Jon_2
 */
public class CountryTest extends TestCase {
    
    public CountryTest(String testName) {
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
     * Test of getIdString method, of class Country.
     */
    public void testGetIdString() {
        System.out.println("getIdString");
        Country instance = new Country();
        String expResult = "";
        String result = instance.getIdString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdString method, of class Country.
     */
    public void testSetIdString() {
        System.out.println("setIdString");
        String a = "";
        Country instance = new Country();
        instance.setIdString(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Country.
     */
    public void testToString() {
        System.out.println("toString");
        Country instance = new Country();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNeighbours method, of class Country.
     */
    public void testIsNeighbours() {
        System.out.println("isNeighbours");
        Country t = null;
        Country instance = new Country();
        boolean expResult = false;
        boolean result = instance.isNeighbours(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNeighbours method, of class Country.
     */
    public void testGetNeighbours() {
        System.out.println("getNeighbours");
        Country instance = new Country();
        Vector expResult = null;
        Vector result = instance.getNeighbours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCrossContinentNeighbours method, of class Country.
     */
    public void testGetCrossContinentNeighbours() {
        System.out.println("getCrossContinentNeighbours");
        Country instance = new Country();
        List<Country> expResult = null;
        List<Country> result = instance.getCrossContinentNeighbours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Country.
     */
    public void testGetName() {
        System.out.println("getName");
        Country instance = new Country();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Country.
     */
    public void testSetName() {
        System.out.println("setName");
        String a = "";
        Country instance = new Country();
        instance.setName(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArmies method, of class Country.
     */
    public void testGetArmies() {
        System.out.println("getArmies");
        Country instance = new Country();
        int expResult = 0;
        int result = instance.getArmies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContinent method, of class Country.
     */
    public void testGetContinent() {
        System.out.println("getContinent");
        Country instance = new Country();
        Continent expResult = null;
        Continent result = instance.getContinent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContinent method, of class Country.
     */
    public void testSetContinent() {
        System.out.println("setContinent");
        Continent a = null;
        Country instance = new Country();
        instance.setContinent(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNeighbour method, of class Country.
     */
    public void testAddNeighbour() {
        System.out.println("addNeighbour");
        Country t = null;
        Country instance = new Country();
        instance.addNeighbour(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIncomingNeighbours method, of class Country.
     */
    public void testGetIncomingNeighbours() {
        System.out.println("getIncomingNeighbours");
        Country instance = new Country();
        List<Country> expResult = null;
        List<Country> result = instance.getIncomingNeighbours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOwner method, of class Country.
     */
    public void testSetOwner() {
        System.out.println("setOwner");
        Player p = null;
        Country instance = new Country();
        instance.setOwner(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOwner method, of class Country.
     */
    public void testGetOwner() {
        System.out.println("getOwner");
        Country instance = new Country();
        Player expResult = null;
        Player result = instance.getOwner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addArmy method, of class Country.
     */
    public void testAddArmy() {
        System.out.println("addArmy");
        Country instance = new Country();
        instance.addArmy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addArmies method, of class Country.
     */
    public void testAddArmies() {
        System.out.println("addArmies");
        int n = 0;
        Country instance = new Country();
        instance.addArmies(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeArmies method, of class Country.
     */
    public void testRemoveArmies() {
        System.out.println("removeArmies");
        int lessArmies = 0;
        Country instance = new Country();
        instance.removeArmies(lessArmies);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of looseArmy method, of class Country.
     */
    public void testLooseArmy() {
        System.out.println("looseArmy");
        Country instance = new Country();
        instance.looseArmy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Country.
     */
    public void testGetColor() {
        System.out.println("getColor");
        Country instance = new Country();
        int expResult = 0;
        int result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Country.
     */
    public void testSetColor() {
        System.out.println("setColor");
        int a = 0;
        Country instance = new Country();
        instance.setColor(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class Country.
     */
    public void testGetX() {
        System.out.println("getX");
        Country instance = new Country();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Country.
     */
    public void testGetY() {
        System.out.println("getY");
        Country instance = new Country();
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Country.
     */
    public void testSetX() {
        System.out.println("setX");
        int a = 0;
        Country instance = new Country();
        instance.setX(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Country.
     */
    public void testSetY() {
        System.out.println("setY");
        int a = 0;
        Country instance = new Country();
        instance.setY(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistanceTo method, of class Country.
     */
    public void testGetDistanceTo() {
        System.out.println("getDistanceTo");
        int px = 0;
        int py = 0;
        Country instance = new Country();
        int expResult = 0;
        int result = instance.getDistanceTo(px, py);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
