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
public class InventoryTest {

    private Location instanceWhere;
    private Inventory instanceInventory;

    public InventoryTest() {
        //String address, String companyName, String locationDescription <- what goes into a location, part of a Inventory and repair ticket
        this.instanceWhere = new Location("123 Street Road, CityName STATE ZIPCODE", "Example Fireconmapany", "In the blue locker next to the elephant");

        //String name, Location where, String description, String maintenenceHistory, int IDNumber <- what goes into an inventory, part of a repair ticket. 
        this.instanceInventory = new Inventory("Example Item", instanceWhere, "Example Item description", "Never used", 1);
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
     * Test of getName method, of class Inventory.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Inventory instance = this.instanceInventory;
        String expResult = "Example Item";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getWhere method, of class Inventory.
     */
    @Test
    public void testGetWhere() {
        System.out.println("getWhere");
        Inventory instance = this.instanceInventory;
        Location expResult = this.instanceWhere;
        Location result = instance.getWhere();
        assertEquals(expResult, result);

    }

    /**
     * Test of setWhere method, of class Inventory.
     */
    @Test
    public void testSetWhere() {
        System.out.println("setWhere");
        Location where = this.instanceWhere;
        Inventory instance = this.instanceInventory;
        instance.setWhere(where);

        Location expResult = this.instanceWhere;
        Location result = instance.getWhere();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class Inventory.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Inventory instance = this.instanceInventory;
        String expResult = "Example Item description";
        String result = instance.getDescription();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDescription method, of class Inventory.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "New item description";
        Inventory instance = this.instanceInventory;
        instance.setDescription(description);

        String expectedResult = description;
        String result = instance.getDescription();

        assertEquals(expectedResult, result);
    }

    /**
     * Test of getMainteneceHistory method, of class Inventory.
     */
    @Test
    public void testGetMainteneceHistory() {
        System.out.println("getMainteneceHistory");
        Inventory instance = this.instanceInventory;
        String expResult = "Never used";
        String result = instance.getMainteneceHistory();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMainteneceHistory method, of class Inventory.
     */
    @Test
    public void testSetMainteneceHistory() {
        System.out.println("setMainteneceHistory");
        String mainteneceHistory = "Used once";
        Inventory instance = this.instanceInventory;
        instance.setMainteneceHistory(mainteneceHistory);
        
        String expected = mainteneceHistory;
        String result = instance.getMainteneceHistory();
        
        assertEquals(expected,result);
        
    }

    /**
     * Test of getIdNumber method, of class Inventory.
     */
    @Test
    public void testGetIdNumber() {
        System.out.println("getIdNumber");
        Inventory instance = this.instanceInventory;
        int expResult = 1;
        int result = instance.getIdNumber();
        assertEquals(expResult, result);
        
    }

}
