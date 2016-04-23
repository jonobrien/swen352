/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.yura.domination.engine.core;
import org.junit.Test;

import junit.framework.TestCase;

/**
 *
 * @author Jon_2
 */
public class StatTypeTest extends TestCase {
    
    public StatTypeTest(String testName) {
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
     * Test of values method, of class StatType.
     */
    public void testValues() {
        System.out.println("values");
        StatType[] expResult = null;
        StatType[] result = StatType.values();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class StatType.
     */
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        StatType expResult = null;
        StatType result = StatType.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSummable method, of class StatType.
     */
    public void testIsSummable() {
        System.out.println("isSummable stattype");
        StatType stat = StatType.COUNTRIES;
        assertEquals(false, stat.isSummable());
    }

    /**
     * Test of getName method, of class StatType.
     */
    public void testGetName() {
        System.out.println("getName stattype");
        StatType stat = StatType.COUNTRIES;
        assertEquals("countries", stat.getName());
    }

    /**
     * Test of fromOrdinal method, of class StatType.
     */
    public void testFromOrdinal() {
        System.out.println("fromOrdinal");
        int id = 0;
        StatType expResult = null;
        StatType result = StatType.fromOrdinal(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
