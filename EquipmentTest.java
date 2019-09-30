/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joe Giallorenzo
 */
public class EquipmentTest {
    
    public EquipmentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetEquipmentType() {
        System.out.println("getEquipmentType");
        Equipment instance = new Equipment("Air Tank", "David");
        String expResult = "Air Tank";
        String s = "Air Tank";
        String result = instance.getEquipmentType();
        assertEquals(expResult, result);
        if(s.equals(expResult)==false){
            fail("The results are not equal.");
        }
    }


    @Test
    public void testSetEquipmentType() {
        System.out.println("setEquipmentType");
        String equipmentType = "Air Tank";
        String t = "Air Tank";
        String expResult = "Air Tank";
        Equipment instance = new Equipment("Air Tank", "David");
        instance.setEquipmentType(equipmentType);
         if(t.equals(expResult)==false){
            fail("The results are not equal.");
        }
    }

    @Test
    public void testGetLastOperator() {
        System.out.println("getLastOperator");
        Equipment instance = new Equipment("Air Tank", "David");
        String expResult = "David";
        String y = "David";
        String result = instance.getLastOperator();
        assertEquals(expResult, result);
          if(y.equals(expResult)==false){
            fail("The results are not equal.");
        }
    }
    @Test
    public void testSetLastOperator() {
        System.out.println("setLastOperator");
        String lastOperator = "David";
        Equipment instance = new Equipment("Air Tank", "David");
        instance.setLastOperator(lastOperator);
    }
}
