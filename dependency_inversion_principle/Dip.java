package dependency_inversion_principle;

import dependency_inversion_principle.no_dip.Relationships;
import dependency_inversion_principle.no_dip.Research;
import dependency_inversion_principle.pojos.Person;

/*
 * Dependency inversion principle is divided into two parts.
 * 
 * A. High-level modules should not depend on low-level modules.
 * Both should depend on abstractions.
 * 
 * B. Abstractions should not depend on details.
 * Details should depend on abstractions.
 */
public class Dip {
    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Chrisopher");
        Person child2 = new Person("Robert");

        System.out.println("Not following the DIP rule");
        //Relationships is making the sensitive or internal storage data to public by public getter method
        Relationships relationships = new Relationships(); //low-level, it is low level because it is related to data storage
        relationships.addParentChild(parent, child1);
        relationships.addParentChild(parent, child2);

        /*
         * Here this is violating the Dependency inversion principle
         * A. As high-level should not depend on the low-level, but the Research is depending on the Relationships
         * It is also accessing the internal storage data which is irrevalent to the Researcher. Only the details are needed here.
         */
        new Research(relationships); //high-level


        System.out.println("\n\n");

        
        System.out.println("Following the DIP rules");
        /*
         * By depending on the abstraction RelationshipBrowser it is following the DIP rule and not exposing the internal storage to anyone
         */
        dependency_inversion_principle.with_dip.Relationships relationships2 = new dependency_inversion_principle.with_dip.Relationships();
        relationships2.addParentChild(parent, child1);
        relationships2.addParentChild(parent, child2);

        /*
         * Here you think that again it is accepting the Relationships the low-level module. But just see the constructor of the Research 
         * module, it is accepting the abstraction. So, other details will be hidden.
         * Basically it means that high-level is depending on the abstraction.
         */
        new dependency_inversion_principle.with_dip.Research(relationships2);


    }
}
