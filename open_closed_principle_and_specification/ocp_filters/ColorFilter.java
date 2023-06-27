package open_closed_principle_and_specification.ocp_filters;

import java.util.List;
import java.util.stream.Stream;

import open_closed_principle_and_specification.Product;
import open_closed_principle_and_specification.enums.Color;

public class ColorFilter implements Filter {

    private Color color;

    public ColorFilter(Color color) {
        this.color = color;
    }
 
    @Override
    public Stream<Product> filter(List<Product> products) {
        return products.stream().filter(p -> p.getColor() == color);
        
    }
    
}
