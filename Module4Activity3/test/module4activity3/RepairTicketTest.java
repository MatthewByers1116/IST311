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
public class RepairTicketTest {
    private Location instanceWhere;
    private Inventory instanceInventory;
    private Person instancePerson;
    private RepairTicket instanceRepairTicket;
    public RepairTicketTest() {
        //String address, String companyName, String locationDescription <- what goes into a location, part of a Inventory and repair ticket
        this.instanceWhere = new Location("123 Street Road, CityName STATE ZIPCODE", "Example Fireconmapany", "In the blue locker next to the elephant");
        
        //String name, Location where, String description, String maintenenceHistory, int IDNumber <- what goes into an inventory, part of a repair ticket. 
        this.instanceInventory = new Inventory("Example Item",instanceWhere,"Example Item", "Never used", 1);
       
        //String name <- what goes into a person, part of a repair ticket
        this.instancePerson = new Person("Dave");
       
        //Inventory reportedItem, int idNumber, Person reportingPerson, String issueDescription <- what goes into a Repair Ticket
        this.instanceRepairTicket = new RepairTicket(instanceInventory, instanceInventory.getIdNumber(),instancePerson,"Handle is broken");
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
     * Test of getPrintOut method, of class RepairTicket.
     */
    @Test
    public void testGetPrintOut() {
   
        System.out.println("getPrintOut");        

        
        String expResult = "Ticket Number: 1\n" +
"Item in question: Example Item with ID Number: 1\n" +
"With the issue being: Handle is broken\n" +
"Location: 123 Street Road, CityName STATE ZIPCODE at Example Fireconmapany in In the blue locker next to the elephant";
        
        RepairTicket instance = this.instanceRepairTicket;
        String result = instance.getPrintOut();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of updateTicket method, of class RepairTicket.
     */
    @Test
    public void testUpdateTicket() {
        System.out.println("updateTicket");
        String update = "Fixed handle but blade not sharp";
        
        RepairTicket instance = this.instanceRepairTicket;
        instance.updateTicket(update);
        
        String expectedResultsAfterUpdate = "Ticket Number: 1\n" +
"Item in question: Example Item with ID Number: 1\n" +
"With the issue being: Fixed handle but blade not sharp\n" +
"Location: 123 Street Road, CityName STATE ZIPCODE at Example Fireconmapany in In the blue locker next to the elephant";
        String resultAfterUpdate = instance.getPrintOut();
        assertEquals(expectedResultsAfterUpdate,resultAfterUpdate);
    }

    /**
     * Test of deleteTicket method, of class RepairTicket.
     */
    @Test
    public void testDeleteTicket() {
        System.out.println("deleteTicket");
        RepairTicket instance = this.instanceRepairTicket;
        instance.deleteTicket();
        
        String expected = "This Repair ticket has been resolved and is set to be deleted";
        String result = instance.getPrintOut();
        
        assertEquals(expected,result);
        
    }
    
}
