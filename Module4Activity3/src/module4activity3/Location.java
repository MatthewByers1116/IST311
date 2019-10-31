/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module4activity3;

/**
 *
 * @author matth
 */
public class Location {

    private String address;
    private String companyName;
    private String locationDescription;

    public Location(String address, String companyName, String locationDescription) {
        this.address = address;
        this.companyName = companyName;
        this.locationDescription = locationDescription;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the locationDescription
     */
    public String getLocationDescription() {
        return locationDescription;
    }

    /**
     * @param locationDescription the locationDescription to set
     */
    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }
    
    public String getPrintOut(){
        return this.address + " at " + this.companyName + " in " + this.locationDescription;
            }
}
