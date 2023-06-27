package dependency_inversion_principle.pojos;

public class Person {
    private String name;
    //dop

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    
}
