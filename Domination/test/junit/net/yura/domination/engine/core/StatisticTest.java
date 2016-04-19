/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.yura.domination.engine.core;

import junit.framework.TestCase;

/**
 *
 * @author Jon_2
 */
public class StatisticTest extends TestCase {
    
    public StatisticTest(String testName) {
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
     * Test of endGoStatistics method, of class Statistic.
     */
    public void testEndGoStatistics() {
        System.out.println("endGoStatistics");
        int countries = 0;
        int armies = 0;
        int continents = 0;
        int conectedEmpire = 0;
        int cards = 0;
        Statistic instance = new Statistic();
        instance.endGoStatistics(countries, armies, continents, conectedEmpire, cards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addReinforcements method, of class Statistic.
     */
    public void testAddReinforcements() {
        System.out.println("addReinforcements");
        int a = 0;
        Statistic instance = new Statistic();
        instance.addReinforcements(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addKill method, of class Statistic.
     */
    public void testAddKill() {
        System.out.println("addKill");
        Statistic instance = new Statistic();
        instance.addKill();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCasualty method, of class Statistic.
     */
    public void testAddCasualty() {
        System.out.println("addCasualty");
        Statistic instance = new Statistic();
        instance.addCasualty();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAttack method, of class Statistic.
     */
    public void testAddAttack() {
        System.out.println("addAttack");
        Statistic instance = new Statistic();
        instance.addAttack();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAttacked method, of class Statistic.
     */
    public void testAddAttacked() {
        System.out.println("addAttacked");
        Statistic instance = new Statistic();
        instance.addAttacked();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRetreat method, of class Statistic.
     */
    public void testAddRetreat() {
        System.out.println("addRetreat");
        Statistic instance = new Statistic();
        instance.addRetreat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCountriesWon method, of class Statistic.
     */
    public void testAddCountriesWon() {
        System.out.println("addCountriesWon");
        Statistic instance = new Statistic();
        instance.addCountriesWon();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCountriesLost method, of class Statistic.
     */
    public void testAddCountriesLost() {
        System.out.println("addCountriesLost");
        Statistic instance = new Statistic();
        instance.addCountriesLost();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDice method, of class Statistic.
     */
    public void testAddDice() {
        System.out.println("addDice");
        int diceValue = 0;
        Statistic instance = new Statistic();
        instance.addDice(diceValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Statistic.
     */
    public void testGet() {
        System.out.println("get");
        StatType statType = null;
        Statistic instance = new Statistic();
        double expResult = 0.0;
        double result = instance.get(statType);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
