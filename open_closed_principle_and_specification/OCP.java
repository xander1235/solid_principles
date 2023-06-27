package open_closed_principle_and_specification;

import java.util.List;

import open_closed_principle_and_specification.enums.Color;
import open_closed_principle_and_specification.enums.Size;
import open_closed_principle_and_specification.non_ocp_filter.ProductFilter;
import open_closed_principle_and_specification.ocp_filters.*;
import open_closed_principle_and_specification.ocp_filters.Filter;
import open_closed_principle_and_specification.ocp_specification_filter.AndSpecification;
import open_closed_principle_and_specification.ocp_specification_filter.BetterFilter;
import open_closed_principle_and_specification.ocp_specification_filter.ColorSpecificaton;
import open_closed_principle_and_specification.ocp_specification_filter.SizeSpecification;

//Check the ProductFilter, Filter interface and Filter2 interface for the explanation
public class OCP {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.MEDIUM);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.WHITE, Size.LARGE);
        Product mouse = new Product("Mouse", Color.RED, Size.SMALL);

        List<Product> products = List.of(apple, tree, house, mouse);

        //Not following the OCP, So to create any new filter old filters should be modified. which may leads to system failure 
        System.out.println("Filter which is violating the OCP principle(1)");
        ProductFilter filter = new ProductFilter();

        System.out.println("Filter by color");
        filter.filterByColor(products, Color.GREEN).forEach(p -> System.out.println(p.getProductName() + " " + p.getColor() + " " + p.getSize()));
        
        System.out.println("\n");
        System.out.println("Filter by size");
        filter.filterBySize(products, Size.LARGE).forEach(p -> System.out.println(p.getProductName() + " " + p.getColor() + " " + p.getSize()));

        System.out.println("\n\n");


        //Following the OCP, So to create new filters just needs to extend the interace, no need to modify the old filters
        System.out.println("Filter which is following the OCP principle(2)");
        
        System.out.println("Filter by color");
        Filter filter2 = new ColorFilter(Color.GREEN);
        filter2.filter(products).forEach(p -> System.out.println(p.getProductName() + " " + p.getColor() + " " + p.getSize()));

        System.out.println("\n");

        System.out.println("Filter by size");
        filter2 = new SizeFilter(Size.LARGE);
        filter2.filter(products).forEach(p -> System.out.println(p.getProductName() + " " + p.getColor() + " " + p.getSize()));


        System.out.println("\n\n");


        //Following both the OCP and Specification design pattern
        //Specification is the engineering enterprise design pattern
        System.out.println("Filter which is following the OCP principle + Specification design pattern(3)");
        BetterFilter filter3 = new BetterFilter();

        System.out.println("Filter by color");
        filter3.filter(products, new ColorSpecificaton(Color.GREEN)).forEach(p -> System.out.println(p.getProductName() + " " + p.getColor() + " " + p.getSize()));

        System.out.println("\n");

        System.out.println("Filter by size");
        filter3.filter(products, new SizeSpecification(Size.LARGE)).forEach(p -> System.out.println(p.getProductName() + " " + p.getColor() + " " + p.getSize()));


        System.out.println("\n");

        System.out.println("Filter by size and color");
        //Here we can combine the two specification for the filter, no need to create another specification
        filter3.filter(products, new AndSpecification<>(new ColorSpecificaton(Color.GREEN), new SizeSpecification(Size.LARGE))).forEach(p -> System.out.println(p.getProductName() + " " + p.getColor() + " " + p.getSize()));

    }
}
