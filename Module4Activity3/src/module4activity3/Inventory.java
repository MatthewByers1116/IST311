package module4activity3;

public class Inventory {

    private String name;
    private Location where;
    private String description;
    private String mainteneceHistory;
    private int IDNumber;
    //TOOD MaintenenceHistory should be a CSV or own datatype but is kept as string to keep class count low for this submission. 

    public Inventory(String name, Location where, String description, String mainteneceHistory, int IDNumber) {
        this.name = name;
        this.where = where;
        this.description = description;
        this.mainteneceHistory = mainteneceHistory;
        this.IDNumber = IDNumber;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the where
     */
    public Location getWhere() {
        return where;
    }

    /**
     * @param where the where to set
     */
    public void setWhere(Location where) {
        this.where = where;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the mainteneceHistory
     */
    public String getMainteneceHistory() {
        return this.mainteneceHistory;
    }

    /**
     * @param mainteneceHistory the mainteneceHistory to set
     */
    public void setMainteneceHistory(String mainteneceHistory) {
        this.mainteneceHistory = mainteneceHistory;
    }

    public int getIdNumber() {
        return this.IDNumber;
    }

}
