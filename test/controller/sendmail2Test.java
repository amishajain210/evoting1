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
public class sendmail2Test {
    
    public sendmail2Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of send method, of class sendmail2.
     */
    @Test
    public void testSend() {
        System.out.println("send");
        String to = "akshada.kamle@iiitb.org";
        String sub = "Test mail";
        String msg = "This is test mail..dont reply";
        String user = "amishajain210@gmail.com";
        String pass = "7987772325";
        String expResult = "test mail sent successfully";
        String result = sendmail2.send(to, sub, msg, user, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
