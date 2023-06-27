package open_closed_principle_and_specification.ocp_filters;

import java.util.List;
import java.util.stream.Stream;

import open_closed_principle_and_specification.Product;

//Now filters will not be modified and implemented if any new filter in necessary, which follows the OCP rule
public interface Filter {
    Stream<Product> filter(List<Product> products);
}
