package module5activity2;

public abstract class Person implements CanPrint {

    private String name;
    private int idNumber;
    private String trainingData;
    private String medicalData;

    public Person(String name, int idNumber, String trainingData, String medicalData) {

        this.name = name;
        this.idNumber = idNumber;
        this.trainingData = trainingData;
        this.medicalData = medicalData;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getTrainingData() {
        return trainingData;
    }

    public void setTrainingData(String trainingData) {
        this.trainingData = trainingData;
    }

    public String getMedicalData() {
        return medicalData;
    }

    public void setMedicalData(String medicalData) {
        this.medicalData = medicalData;
    }
}
