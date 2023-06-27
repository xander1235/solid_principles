package open_closed_principle_and_specification.ocp_specification_filter;

import java.util.List;
import java.util.stream.Stream;

import open_closed_principle_and_specification.Product;

public class BetterFilter implements Filter2<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(p -> spec.isSatisfied(p));
    }
    
}
