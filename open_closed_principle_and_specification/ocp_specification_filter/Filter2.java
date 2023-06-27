package open_closed_principle_and_specification.ocp_specification_filter;

import java.util.List;
import java.util.stream.Stream;

public interface Filter2<T> {
    Stream<T> filter(List<T> items, Specification<T> spec);
}
