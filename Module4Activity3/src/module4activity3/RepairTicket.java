package module4activity3;

public class RepairTicket {

    private Inventory reportedItem;
    private int idNumber;
    private Location where;
    private Person reportingPerson;
    private String issueDescription;
    private boolean isResolved;

    public RepairTicket(Inventory reportedItem, int idNumber, Person reportingPerson, String issueDescription) {
        this.reportedItem = reportedItem;
        this.idNumber = idNumber;
        this.where = reportedItem.getWhere();
        this.reportingPerson = reportingPerson;
        this.issueDescription = issueDescription;
        this.isResolved = false;
    }

    public String getPrintOut() {
        if (!this.isResolved) {
            return "Ticket Number: " + idNumber + "\nItem in question: " + this.reportedItem.getName() + " with ID Number: " + this.reportedItem.getIdNumber() + "\nWith the issue being: " + this.issueDescription + "\nLocation: " + this.where.getPrintOut();

        } else {
            return "This Repair ticket has been resolved and is set to be deleted";
        }
    }

    public void updateTicket(String update) {
        this.issueDescription = update;
    }

    public void deleteTicket() {
        this.isResolved = true;
        //Flags the manager to remove this repairTicket from the database
        this.issueDescription = "This issue has been resolved and is set to be deleted.";
    }

}
