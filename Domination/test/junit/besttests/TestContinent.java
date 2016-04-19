/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besttests;
import net.yura.domination.engine.core.Continent;
import net.yura.domination.engine.core.Country;
import net.yura.domination.engine.core.Player;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Jim Craveiro
 */
public class TestContinent {
    
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
    
    protected void setUp() {
        testContinent  = new Continent(testid, testName, testColor, testArmyValue);
        testContinent2 = new Continent("udhaiofyr", "another test continent", 456, 5);
        
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
        testContinent.setIdString(testName);
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
    public void testEquals() {
        Continent tempContinent = new Continent(testid, testName, testColor, testArmyValue);
        assertEquals(tempContinent, testContinent);
    }
    
    @Test
    public void testIsOwned() {
        
    }
}
