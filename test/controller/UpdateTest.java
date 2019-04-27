/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amisha
 */
public class UpdateTest {
    
    public UpdateTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of updateData method, of class Update.
     */
    @Test
    public void testUpdateData() 
    {
        System.out.println("updateData");
        Update instance = new Update();
        instance.updateData();
         System.out.println("updateData success");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
