package module4activity3;

//TODO Crate higharchy of persons. I would have made them all but the assignment was only for 2 so i kept this one to the barebones nessesary to create RepairTickets
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
