package dependency_inversion_principle.with_dip;

//High-level module
//Now it debends on abstraction RelationshipBrowser as per the DIP rule
public class Research {
    
    public Research(RelationshipBrowser browser) {

    
        browser.findAllChildrenOf("John")
        .forEach(ch -> System.out.println(
            "John has a child called " + ch.getName()
            ));
    }
}
