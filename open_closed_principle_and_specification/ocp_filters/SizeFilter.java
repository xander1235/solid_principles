package open_closed_principle_and_specification.ocp_filters;

import java.util.List;
import java.util.stream.Stream;

import open_closed_principle_and_specification.Product;
import open_closed_principle_and_specification.enums.Size;

public class SizeFilter implements Filter {

    private Size size;

    public SizeFilter(Size size) {
        this.size = size;
    }

    @Override
    public Stream<Product> filter(List<Product> products) {
        return products.stream().filter(p -> p.getSize() == size);
    }

    
    
}
