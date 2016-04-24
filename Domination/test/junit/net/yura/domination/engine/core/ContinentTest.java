/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.yura.domination.engine.core;

import java.util.Vector;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import net.yura.domination.engine.core.Continent;
import net.yura.domination.engine.core.Country;
import net.yura.domination.engine.core.Player;

/**
 *
 * @author Jim Craveiro
 */
public class ContinentTest extends TestCase {
    
    private Continent testContinent  = null;
    private Continent testContinent2 = null;
    
    private Player    testPlayer    = null;
    
    private String    testid         = "qwerty";
    private String    testName       = "test continent";
    private int       testColor      = 123;
    private int       testArmyValue  = 7;
    
    private Country   testCountryA  = null;
    private Country   testCountryB  = null;
    private Country   testCountryC  = null;
    private Country   testCountryD  = null;
    private Country   testCountryE  = null;
    private Country   testCountryF  = null;
    
    public ContinentTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        testContinent  = new Continent(testid, testName, testArmyValue, testColor);
        testContinent2 = new Continent("udhaiofyr", "another test continent", 5, 456);
        
        testPlayer = new Player(0, "John Doe", 1, "0.0.0.0");
        
        testCountryA = new Country(testColor, "countryA", "countryA", testContinent, 2, 2);
        testCountryB = new Country(testColor, "countryB", "countryB", testContinent, 2, 3);
        testCountryC = new Country(testColor, "countryC", "countryC", testContinent, 1, 2);
        testCountryD = new Country(testColor, "countryD", "countryD", testContinent2, 3, 2);
        testCountryE = new Country(testColor, "countryE", "countryE", testContinent2, 3, 3);
        testCountryF = new Country(testColor, "countryF", "countryF", testContinent2, 3, 4);
        
        testCountryA.addNeighbour(testCountryB);
        testCountryA.addNeighbour(testCountryC);
        testCountryA.addNeighbour(testCountryD);
        
        testCountryB.addNeighbour(testCountryA);
        testCountryB.addNeighbour(testCountryE);
        
        testCountryC.addNeighbour(testCountryA);
        
        testCountryD.addNeighbour(testCountryA);
        testCountryD.addNeighbour(testCountryE);
        
        testCountryE.addNeighbour(testCountryB);
        testCountryE.addNeighbour(testCountryF);
        testCountryE.addNeighbour(testCountryD);
        
        testCountryF.addNeighbour(testCountryE);
        
        testCountryA.setOwner(testPlayer);
        testCountryB.setOwner(testPlayer);
        testCountryC.setOwner(testPlayer);
        
        testContinent.addTerritoriesContained(testCountryA);
        testContinent.addTerritoriesContained(testCountryB);
        testContinent.addTerritoriesContained(testCountryC);
        
        testContinent2.addTerritoriesContained(testCountryD);
        testContinent2.addTerritoriesContained(testCountryE);
        testContinent2.addTerritoriesContained(testCountryF);
        
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    @Test
    public void testToString() {
        String expectedOutput = testid + " [" + testArmyValue + "]";
        assertEquals(expectedOutput, testContinent.toString());
    }
    
    @Test
    public void testGetIdString() {
        assertEquals(testid, testContinent.getIdString());
    }
    
    @Test
    public void testSetIdString() {
        testid = "asdfjkl";
        testContinent.setIdString(testid);
        assertEquals(testid, testContinent.getIdString());
    }
    
    @Test
    public void testGetName() {
        assertEquals(testName, testContinent.getName());
    }
    
    @Test
    public void testSetName() {
        testName = "new test name";
        testContinent.setName(testName);
        assertEquals(testName, testContinent.getName());
    }
    
    @Test
    public void testGetColor() {
        assertEquals(testColor, testContinent.getColor());
    }
    
    @Test
    public void testSetColor() {
        testColor = 456;
        testContinent.setColor(testColor);
        assertEquals(testColor, testContinent.getColor());
    }
    
    @Test
    public void testGetArmyValue() {
        assertEquals(testArmyValue, testContinent.getArmyValue());
    }
    
    @Test
    public void testSetArmyValue() {
        testArmyValue = 4;
        testContinent.setArmyValue(testArmyValue);
        assertEquals(testArmyValue, testContinent.getArmyValue());
    }
    
    @Test
    public void testIsOwned() {
        boolean owned  = testContinent.isOwned(testPlayer);
        boolean owned2 = testContinent2.isOwned(testPlayer);
        assertEquals(true, owned);
        assertEquals(false, owned2);
    }
    
    @Test
    public void testGetNumberOwned() {
        int numOwned  = testContinent.getNumberOwned(testPlayer);
        int numOwned2 = testContinent2.getNumberOwned(testPlayer);
        assertEquals(3, numOwned);
        assertEquals(0, numOwned2);
    }
    
    @Test
    public void testGetOwner() {
        Player owner = testContinent.getOwner();
        Player owner2 = testContinent2.getOwner();
        assertEquals(testPlayer, owner);
        assertEquals(null, owner2);
    }
    
    @Test
    public void testGetBorderCountries() {
        Vector borderCountries = testContinent.getBorderCountries();
        assertEquals(2, borderCountries.size());
        assertEquals(testCountryA, borderCountries.get(0));
        assertEquals(testCountryB, borderCountries.get(1));
    }
    
    @Test
    public void testGetTerritoriesContained() {
        Vector territoriesContained = testContinent.getTerritoriesContained();
        Vector testContained = new Vector();
        testContained.add(testCountryA);
        testContained.add(testCountryB);
        testContained.add(testCountryC);
        assertEquals(testContained, territoriesContained);
    }
    
    @Test
    public void testAddTerritoriesContained() {
        Country testCountryG = new Country(testColor, "countryG", "countryG", testContinent2, 3, 5);
        testCountryF.addNeighbour(testCountryG);
        testCountryG.addNeighbour(testCountryF);
        testContinent.addTerritoriesContained(testCountryG);
        assertEquals(testCountryG, testContinent.getTerritoriesContained().get(3));
    }
    
    @Test
    public void testEquals() {
        Continent testContinent3 = new Continent("udhaiofyr", "another test continent", 5, 456);
        assertEquals(true, testContinent2.equals(testContinent3));
    }
    
}
