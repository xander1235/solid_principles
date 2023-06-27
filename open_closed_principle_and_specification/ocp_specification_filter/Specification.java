package open_closed_principle_and_specification.ocp_specification_filter;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
