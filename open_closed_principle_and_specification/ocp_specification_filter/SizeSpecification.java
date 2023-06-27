package open_closed_principle_and_specification.ocp_specification_filter;

import open_closed_principle_and_specification.Product;
import open_closed_principle_and_specification.enums.Size;

public class SizeSpecification implements Specification<Product> {

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize() == size;
    }
    
}
