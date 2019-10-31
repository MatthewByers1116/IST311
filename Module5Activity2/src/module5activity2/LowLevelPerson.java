package module5activity2;

public class LowLevelPerson extends Person {

    private String password;

    public LowLevelPerson(String name, int idNumber, String trainingData, String medicalData, String password) {
        super(name, idNumber, trainingData, medicalData);
        this.password = password;
    }

    @Override
    public String getPrintOut() {
        return "This lowlevel person's name is " + super.getName() + "\n their ID Number is: " + super.getIdNumber() + "\n Here is their training data: " + super.getTrainingData();
    }

    @Override
    public void printOut() {
        System.out.println("This lowlevel person's name is " + super.getName() + "\n their ID Number is: " + super.getIdNumber() + "\n Here is their training data: " + super.getTrainingData());
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    private void makeReportTicket(){
        //CAN MAKE REPORT TICKETS TO THE TICKET SYSTEM. NOT IMPLEMENTED FOR THIS ASSIGNMENT
    }

}
