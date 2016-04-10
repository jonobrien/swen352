/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besttests;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestCase;
import net.yura.domination.engine.core.Mission;
import net.yura.domination.engine.core.Player;
import net.yura.domination.engine.core.Continent;
/**
 *
 * @author Matthew
 */
public class TestMission extends TestCase{
    private ArrayList<Player> testplayers;
    private Mission testmission;
    Continent c1 = new Continent("Id1", "Continent1" , 0xFF000000, 1);
    Continent c2 = new Continent("Id2", "Continent2" , 0xFF000000, 1);
    Continent c3 = new Continent("Id3", "Continent3" , 0xFF000000, 1);
    
    public void initTest(){
	testPrint();
	String address = null;
	try {
	    address = InetAddress.getLocalHost().getHostName();
	} catch (UnknownHostException ex) {
	    Logger.getLogger(TestMission.class.getName()).log(Level.SEVERE, null, ex);
	}
	for (int i = 1; i < 6; i++){
	    testplayers.add(new Player(1, ("Player" + i), 0xFF000000, address));
	}

	testmission = new Mission(testplayers.get(0), 10, 1, c1, c2, c3, "Mission");
    }

    public void testPrint() {
	System.out.println("Running TestMission");
    }
    
    public void testGetTarget(){
	assertEquals(testplayers.get(0), testmission.getPlayer());
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
    
    public void testGetNoofarmies(){
	assertEquals(1, testmission.getNoofarmies());
    }
    
    public void testGetNoocountries(){
	assertEquals(10, testmission.getNoofcountries());
    }
}