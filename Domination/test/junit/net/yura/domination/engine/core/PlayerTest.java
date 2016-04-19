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
public class PlayerTest extends TestCase {
    
    public PlayerTest(String testName) {
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
     * Test of rename method, of class Player.
     */
    public void testRename() {
        System.out.println("rename");
        String na = "";
        Player instance = null;
        instance.rename(na);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Player.
     */
    public void testSetColor() {
        System.out.println("setColor");
        int color = 0;
        Player instance = null;
        instance.setColor(color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Player.
     */
    public void testToString() {
        System.out.println("toString");
        Player instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextTurn method, of class Player.
     */
    public void testNextTurn() {
        System.out.println("nextTurn");
        Player instance = null;
        instance.nextTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatistics method, of class Player.
     */
    public void testGetStatistics_StatType() {
        System.out.println("getStatistics");
        StatType type = null;
        Player instance = null;
        double[] expResult = null;
        double[] result = instance.getStatistics(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatistics method, of class Player.
     */
    public void testGetStatistics_0args() {
        System.out.println("getStatistics");
        Player instance = null;
        List<Statistic> expResult = null;
        List<Statistic> result = instance.getStatistics();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNoArmies method, of class Player.
     */
    public void testGetNoArmies() {
        System.out.println("getNoArmies");
        Player instance = null;
        int expResult = 0;
        int result = instance.getNoArmies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Player.
     */
    public void testGetAddress() {
        System.out.println("getAddress");
        Player instance = null;
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Player.
     */
    public void testGetName() {
        System.out.println("getName");
        Player instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Player.
     */
    public void testGetColor() {
        System.out.println("getColor");
        Player instance = null;
        int expResult = 0;
        int result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExtraArmies method, of class Player.
     */
    public void testGetExtraArmies() {
        System.out.println("getExtraArmies");
        Player instance = null;
        int expResult = 0;
        int result = instance.getExtraArmies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addArmies method, of class Player.
     */
    public void testAddArmies() {
        System.out.println("addArmies");
        int n = 0;
        Player instance = null;
        instance.addArmies(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loseExtraArmy method, of class Player.
     */
    public void testLoseExtraArmy() {
        System.out.println("loseExtraArmy");
        int n = 0;
        Player instance = null;
        instance.loseExtraArmy(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of giveCard method, of class Player.
     */
    public void testGiveCard() {
        System.out.println("giveCard");
        Card card = null;
        Player instance = null;
        instance.giveCard(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCards method, of class Player.
     */
    public void testGetCards() {
        System.out.println("getCards");
        Player instance = null;
        Vector expResult = null;
        Vector result = instance.getCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapital method, of class Player.
     */
    public void testGetCapital() {
        System.out.println("getCapital");
        Player instance = null;
        Country expResult = null;
        Country result = instance.getCapital();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapital method, of class Player.
     */
    public void testSetCapital() {
        System.out.println("setCapital");
        Country c = null;
        Player instance = null;
        instance.setCapital(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMission method, of class Player.
     */
    public void testGetMission() {
        System.out.println("getMission");
        Player instance = null;
        Mission expResult = null;
        Mission result = instance.getMission();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMission method, of class Player.
     */
    public void testSetMission() {
        System.out.println("setMission");
        Mission m = null;
        Player instance = null;
        instance.setMission(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of takeCard method, of class Player.
     */
    public void testTakeCard() {
        System.out.println("takeCard");
        Player instance = null;
        Card expResult = null;
        Card result = instance.takeCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tradeInCards method, of class Player.
     */
    public void testTradeInCards() {
        System.out.println("tradeInCards");
        Card card1 = null;
        Card card2 = null;
        Card card3 = null;
        Player instance = null;
        instance.tradeInCards(card1, card2, card3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTerritoriesOwned method, of class Player.
     */
    public void testGetTerritoriesOwned() {
        System.out.println("getTerritoriesOwned");
        Player instance = null;
        Vector expResult = null;
        Vector result = instance.getTerritoriesOwned();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNoTerritoriesOwned method, of class Player.
     */
    public void testGetNoTerritoriesOwned() {
        System.out.println("getNoTerritoriesOwned");
        Player instance = null;
        int expResult = 0;
        int result = instance.getNoTerritoriesOwned();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newCountry method, of class Player.
     */
    public void testNewCountry() {
        System.out.println("newCountry");
        Country newCountry = null;
        Player instance = null;
        instance.newCountry(newCountry);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lostCountry method, of class Player.
     */
    public void testLostCountry() {
        System.out.println("lostCountry");
        Country lessCountry = null;
        Player instance = null;
        instance.lostCountry(lessCountry);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPlayersEliminated method, of class Player.
     */
    public void testAddPlayersEliminated() {
        System.out.println("addPlayersEliminated");
        Player p = null;
        Player instance = null;
        instance.addPlayersEliminated(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayersEliminated method, of class Player.
     */
    public void testGetPlayersEliminated() {
        System.out.println("getPlayersEliminated");
        Player instance = null;
        Vector expResult = null;
        Vector result = instance.getPlayersEliminated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Player.
     */
    public void testGetType() {
        System.out.println("getType");
        Player instance = null;
        int expResult = 0;
        int result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Player.
     */
    public void testSetType() {
        System.out.println("setType");
        int t = 0;
        Player instance = null;
        instance.setType(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Player.
     */
    public void testSetAddress() {
        System.out.println("setAddress");
        String a = "";
        Player instance = null;
        instance.setAddress(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutoEndGo method, of class Player.
     */
    public void testSetAutoEndGo() {
        System.out.println("setAutoEndGo");
        boolean b = false;
        Player instance = null;
        instance.setAutoEndGo(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoEndGo method, of class Player.
     */
    public void testGetAutoEndGo() {
        System.out.println("getAutoEndGo");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.getAutoEndGo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutoDefend method, of class Player.
     */
    public void testSetAutoDefend() {
        System.out.println("setAutoDefend");
        boolean b = false;
        Player instance = null;
        instance.setAutoDefend(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoDefend method, of class Player.
     */
    public void testGetAutoDefend() {
        System.out.println("getAutoDefend");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.getAutoDefend();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAlive method, of class Player.
     */
    public void testIsAlive() {
        System.out.println("isAlive");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.isAlive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
