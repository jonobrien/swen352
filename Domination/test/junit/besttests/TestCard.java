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





}
