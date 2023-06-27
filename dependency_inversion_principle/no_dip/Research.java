package dependency_inversion_principle.no_dip;

import java.util.List;

import dependency_inversion_principle.enums.Relationship;
import dependency_inversion_principle.pojos.Triplet;

//High-level module
//Depends on the low-level module Relationships, voilating the DIP rule
public class Research {
    
    public Research(Relationships relationships) {

    
        List<Triplet> relations = relationships.getRelations();
        relations.stream()
        .filter(p -> p.getParent().getName().equals("John") && p.getRelationship() == Relationship.PARENT)
        .forEach(ch -> System.out.println(
            "John has a child called " + ch.getChild().getName()
            ));
    }
}
