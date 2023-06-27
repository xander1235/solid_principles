package dependency_inversion_principle.no_dip;

import java.util.ArrayList;
import java.util.List;
import dependency_inversion_principle.enums.Relationship;
import dependency_inversion_principle.pojos.Person;
import dependency_inversion_principle.pojos.Triplet;

//Low level module
public class Relationships {
    private List<Triplet> relations = new ArrayList<>();

    public void addParentChild(Person parent, Person child) {
        relations.add(new Triplet(parent, Relationship.PARENT, child));
        relations.add(new Triplet(child, Relationship.CHILD, parent));
    }

    public List<Triplet> getRelations() {
        return relations;
    }

    
}
