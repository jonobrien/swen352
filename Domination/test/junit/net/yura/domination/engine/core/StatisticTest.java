/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.yura.domination.engine.core;

import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Jim Craveiro
 */
public class StatisticTest extends TestCase {
    
    
    private Statistic testStatistic = null;
    
    public StatisticTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        testStatistic = new Statistic();
        
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testEndGoStatistics() {
        testStatistic.endGoStatistics(1, 2, 3, 4, 5);
        double countries = testStatistic.get(StatType.COUNTRIES);
        double armies = testStatistic.get(StatType.ARMIES);
        double continents = testStatistic.get(StatType.CONTINENTS);
        double empire = testStatistic.get(StatType.CONNECTED_EMPIRE);
        double cards = testStatistic.get(StatType.CARDS);
        assertEquals(1, (int) countries);
        assertEquals(2, (int) armies);
        assertEquals(3, (int) continents);
        assertEquals(4, (int) empire);
        assertEquals(5, (int) cards);
    }

    @Test
    public void testAddReinforcements() {
        testStatistic.addReinforcements(12);
        double reinforcements = testStatistic.get(StatType.REINFORCEMENTS);
        assertEquals(12, (int) reinforcements);
    }

    @Test
    public void testAddKill() {
        testStatistic.addKill();
        double kills = testStatistic.get(StatType.KILLS);
        assertEquals(1, (int) kills);
    }

    @Test
    public void testAddCasualty() {
        for(int i = 0; i < 5; i++) {
            testStatistic.addCasualty();
        }
        double casualties = testStatistic.get(StatType.CASUALTIES);
        assertEquals(5, (int) casualties);
    }

    @Test
    public void testAddAttack() {
        for(int i = 0; i < 3; i++) {
            testStatistic.addAttack();
        }
        double attacks = testStatistic.get(StatType.ATTACKS);
        assertEquals(3, (int) attacks);
    }

    @Test
    public void testAddAttacked() {
        for(int i = 0; i < 14; i++) {
            testStatistic.addAttacked();
        }
        double attacked = testStatistic.get(StatType.ATTACKED);
        assertEquals(14, (int) attacked);
    }

    @Test
    public void testAddRetreat() {
        for(int i = 0; i < 4; i++) {
            testStatistic.addRetreat();
        }
        double retreats = testStatistic.get(StatType.RETREATS);
        assertEquals(4, (int) retreats);
    }

    @Test
    public void testAddCountriesWon() {
        for(int i = 0; i < 9; i++) {
            testStatistic.addCountriesWon();
        }
        double won = testStatistic.get(StatType.COUNTRIES_WON);
        assertEquals(9, (int) won);
    }

    @Test
    public void testAddCountriesLost() {
        for(int i = 0; i < 6; i++) {
            testStatistic.addCountriesLost();
        }
        double lost = testStatistic.get(StatType.COUNTRIES_LOST);
        assertEquals(6, (int) lost);
    }

    @Test
    public void testAddDice() {
        testStatistic.addDice(3);
        double dice = testStatistic.get(StatType.DICE);
        assertEquals(4, (int) dice); 
        // 4 because dice go from 0-5 instead of 1-6
        // meaning a 3 input would be 4 dice
    }

    @Test
    public void testGet() {
        double oldCasualties = testStatistic.get(StatType.CASUALTIES);
        for(int i = 0; i < 10; i++) {
            testStatistic.addCasualty();
        }
        double newCasualties = testStatistic.get(StatType.CASUALTIES);
        assertEquals(((int) oldCasualties) + 10, (int) newCasualties);
    }
    
}
