/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besttests;
import java.util.ArrayList;
import junit.framework.TestCase;
import net.yura.domination.engine.core.Mission;
import net.yura.domination.engine.core.Player;
import net.yura.domination.engine.core.Continent;
/**
 *
 * @author Matthew
 */
public class TestMission extends TestCase{
    ArrayList<Player> testplayers= new ArrayList<Player>();
    Mission testmission;
    
    int color = 0xFF000000;
    int noofarmies1 = 1;
    int noofarmies2 = 2;
    int noofcountries1 = 10;
    int noofcountries2 = 20;
    String description1 = "Mission1";
    String description2 = "Mission2";
    
    Continent c1 = new Continent("Id1", "Continent1" , color, 1);
    Continent c2 = new Continent("Id2", "Continent2" , color, 1);
    Continent c3 = new Continent("Id3", "Continent3" , color, 1);
    Continent c4 = new Continent("Id4", "Continent4" , color, 1);

    @Override
    public void setUp(){
	for (int i = 1; i <= 6; i+=1){
	    Player p = new Player(1, ("Player" + i), color, "localhost");
	    testplayers.add(p);
	}
	testmission = new Mission(testplayers.get(0), noofcountries1, noofarmies1, c1, c2, c3, description1);
    }

    public void printTest() {
	System.out.println("Running TestMission");
    }
    
    public void testGetContinent1(){
	assertEquals(c1, testmission.getContinent1());
    }
    
    public void testGetContinent2(){
	assertEquals(c2, testmission.getContinent2());
    }
    
    public void testGetContinent3(){
	assertEquals(c3, testmission.getContinent3());
    }
    
    //note that it is misspelled as "getDiscription" in the source code
    public void testGetDescription(){
	assertEquals(testmission.getDiscription(), description1);
    }
    
    public void testGetNoofarmies(){
	assertEquals(noofarmies1, testmission.getNoofarmies());
    }
    
    public void testGetNoocountries(){
	assertEquals(noofcountries1, testmission.getNoofcountries());
    }
    
    public void testGetPlayer(){
	assertEquals(testplayers.get(0), testmission.getPlayer());
    }
    
    public void testSetContinent1(){
	testmission.setContinent1(c4);
	assertEquals(testmission.getContinent1(), c4);
    }
    
    public void testSetContinent2(){
	testmission.setContinent2(c4);
	assertEquals(testmission.getContinent2(), c4);
    }
    
    public void testSetContinent3(){
	testmission.setContinent3(c4);
	assertEquals(testmission.getContinent3(), c4);
    }
    
    //note that it is misspelled as "setDiscription" in the source code
    public void testSetDescription(){
	testmission.setDiscription(description2);
	assertEquals(testmission.getDiscription(), description2);
    }
    
    public void testSetNoOfArmies(){
	testmission.setNoofarmies(noofarmies2);
	assertEquals(testmission.getNoofarmies(), noofarmies2);
    }
    
    public void testSetNoOfCountries(){
	testmission.setNoofcountries(noofcountries2);
	assertEquals(testmission.getNoofcountries(), noofcountries2);
    }
    
    public void testSetPlayer(){
	testmission.setPlayer(testplayers.get(1));
	assertEquals(testmission.getPlayer(), testplayers.get(1));
    }
    
}