package dependency_inversion_principle.with_dip;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import dependency_inversion_principle.enums.Relationship;
import dependency_inversion_principle.pojos.Person;
import dependency_inversion_principle.pojos.Triplet;

//Low level module
//Depending on the abstraction by implementing the RelationshipBrowser
public class Relationships implements RelationshipBrowser {
    private List<Triplet> relations = new ArrayList<>();

    public void addParentChild(Person parent, Person child) {
        relations.add(new Triplet(parent, Relationship.PARENT, child));
        relations.add(new Triplet(child, Relationship.CHILD, parent));
    }

    @Override
    public List<Person> findAllChildrenOf(String name) {
        return relations.stream()
        .filter(p -> p.getParent().getName().equals(name) && p.getRelationship() == Relationship.PARENT)
        .map(Triplet::getChild).collect(Collectors.toList());
    }

    
}
