/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module4activity3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matth
 */
public class LocationTest {
    private Location instanceWhere;
    public LocationTest() {
        //String address, String companyName, String locationDescription <- what goes into a location, part of a Inventory and repair ticket
        this.instanceWhere = new Location("123 Street Road, CityName STATE ZIPCODE", "Example Fireconmapany", "In the blue locker next to the elephant");

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

    /**
     * Test of getAddress method, of class Location.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Location instance = new Location("123 Street Road, CityName STATE ZIPCODE", "Example Fireconmapany", "In the blue locker next to the elephant");
        String expResult = "123 Street Road, CityName STATE ZIPCODE";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAddress method, of class Location.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "NEW ADDRESS";
        Location instance = this.instanceWhere;
        instance.setAddress(address);
        
        assertEquals(address,instance.getAddress());
    }

    /**
     * Test of getCompanyName method, of class Location.
     */
    @Test
    public void testGetCompanyName() {
        System.out.println("getCompanyName");
        Location instance = this.instanceWhere;
        String expResult = "Example Fireconmapany";
        String result = instance.getCompanyName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCompanyName method, of class Location.
     */
    @Test
    public void testSetCompanyName() {
        System.out.println("setCompanyName");
        String companyName = "NEW NAME";
        Location instance = this.instanceWhere;
        instance.setCompanyName(companyName);
        
        assertEquals(companyName,instance.getCompanyName());
    }

    /**
     * Test of getLocationDescription method, of class Location.
     */
    @Test
    public void testGetLocationDescription() {
        System.out.println("getLocationDescription");
        Location instance = this.instanceWhere;
        String expResult = "In the blue locker next to the elephant";
        String result = instance.getLocationDescription();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLocationDescription method, of class Location.
     */
    @Test
    public void testSetLocationDescription() {
        System.out.println("setLocationDescription");
        String locationDescription = "In the red crate labled 40";
        Location instance = this.instanceWhere;
        instance.setLocationDescription(locationDescription);
        
        assertEquals(locationDescription,instance.getLocationDescription());
    }

    /**
     * Test of getPrintOut method, of class Location.
     */
    @Test
    public void testGetPrintOut() {
        System.out.println("getPrintOut");
        
        Location instance = this.instanceWhere;
        String expResult = "123 Street Road, CityName STATE ZIPCODE at Example Fireconmapany in In the blue locker next to the elephant";
        String result = instance.getPrintOut();
        assertEquals(expResult, result);
        
    }
    
}
