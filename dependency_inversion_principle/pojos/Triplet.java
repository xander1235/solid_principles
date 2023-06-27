package dependency_inversion_principle.pojos;

import dependency_inversion_principle.enums.Relationship;

public class Triplet {
    private Person parent;
    private Relationship relationship;
    private Person child;
    
    public Triplet(Person parent, Relationship relationship, Person child) {
        this.parent = parent;
        this.relationship = relationship;
        this.child = child;
    }

    public Person getParent() {
        return parent;
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public Person getChild() {
        return child;
    }

    
}
