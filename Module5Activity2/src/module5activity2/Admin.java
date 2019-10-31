
package module5activity2;

public class Admin extends Person {
    private String advancedPassword;
    public Admin(String name, int idNumber, String trainingData, String medicalData, String advancedPassword) {
        super(name, idNumber, trainingData, medicalData);
        this.advancedPassword = advancedPassword;
    }

    @Override
    public String getPrintOut() {
        return "The admin's name is " + super.getName() + "\n their ID Number is: " + super.getIdNumber() + "\n Here is their training data: " + super.getTrainingData();
    }

    @Override
    public void printOut() {
        System.out.println("The admin's name is " + super.getName() + "\n their ID Number is: " + super.getIdNumber() + "\n Here is their training data: " + super.getTrainingData());
    }
    
    void setPersonName(Person P, String name){
        P.setName(name);
        
    }
    
    void setPersonIdNumber(Person P, int idNumber){
        P.setIdNumber(idNumber);
    }
    
    void setPersonTrainingData(Person p, String trainingData){
        p.setTrainingData(trainingData);
    }
    
    void setPersonMedicalData(Person P, String medicalData){
        P.setMedicalData(medicalData);
    }
    
    private String getPassword(){
        return this.advancedPassword;
    }
    
}
