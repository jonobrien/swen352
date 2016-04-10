/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besttests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;
import net.yura.domination.engine.core.Card;
import net.yura.domination.engine.core.Country;
import net.yura.domination.engine.core.Continent;

/**
 *
 * @author Jon
 */
public class TestCard {


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


}
