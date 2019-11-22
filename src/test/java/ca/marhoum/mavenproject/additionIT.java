/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.marhoum.mavenproject;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *ca.marhoum.mavenproject
 * @author marhoum
 */
public class additionIT {
    
    public additionIT() {
    }

    @Test
    public void testSomeMethod() {
         System.out.println("calculer");
        int val1 = 2;
        int val2 = 4;
        int expResult = 4;
        int result = addition.add(val1, val2);
        assertEquals(expResult, result, 6);
    }
    
}
