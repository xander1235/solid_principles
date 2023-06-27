package open_closed_principle_and_specification.non_ocp_filter;

import java.util.List;
import java.util.stream.Stream;

import open_closed_principle_and_specification.Product;
import open_closed_principle_and_specification.enums.Color;
import open_closed_principle_and_specification.enums.Size;

/*Currently the product have only three fields (name, color and size)
Now we are filtering by color and size. If in we future another field is introduced in the product to filter or
We want the filter based on both the color and size. we will again modify the current class, which violates the OCP rules
which is open for extension and closed for modification
*/
public class ProductFilter {
    
    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(p -> p.getColor() == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(p -> p.getSize() == size);
    }

}
