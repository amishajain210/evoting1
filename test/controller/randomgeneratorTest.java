/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amisha
 */
public class randomgeneratorTest {
    randomgenerator rg;
    
    public randomgeneratorTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of random method, of class randomgenerator.
     * @throws java.sql.SQLException
     */
    @Test
    public void testRandom() throws SQLException {
        System.out.println("random");
        int expResult = 1;
        int result = rg.datacheck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
