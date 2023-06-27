package interface_segregation_principle;

public class Photocopier implements Printer, Scanner {

    @Override
    public void scan(Document d) {
        System.out.println("Photocopier: Scanning the document " + d);
    }

    @Override
    public void print(Document d) {
        
        System.out.println("Photocopier: Printing the document " + d);
    }
    
}
