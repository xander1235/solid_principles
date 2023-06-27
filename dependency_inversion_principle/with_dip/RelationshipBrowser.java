package dependency_inversion_principle.with_dip;

import java.util.List;

import dependency_inversion_principle.pojos.Person;

public interface RelationshipBrowser {
    List<Person> findAllChildrenOf(String name);
}
