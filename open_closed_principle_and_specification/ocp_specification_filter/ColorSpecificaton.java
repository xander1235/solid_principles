package open_closed_principle_and_specification.ocp_specification_filter;

import open_closed_principle_and_specification.Product;
import open_closed_principle_and_specification.enums.Color;

public class ColorSpecificaton implements Specification<Product> {

    private Color color;

    public ColorSpecificaton(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getColor() == color;
    }
    
}
