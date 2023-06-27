package open_closed_principle_and_specification;

import open_closed_principle_and_specification.enums.Color;
import open_closed_principle_and_specification.enums.Size;

public class Product {

    private String productName;
    private Color color;
    private Size size;

    public Product (String productNane, Color color, Size size) {
        this.productName = productNane;
        this.color = color;
        this.size = size;
    }

    public String getProductName() {
        return productName;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    
    
}
