package interface_segregation_principle;

public class JustAPrinter implements Printer {

    @Override
    public void print(Document d) {
        System.out.println("JustAPrinter: Printing the document " + d);
    }
    
}
