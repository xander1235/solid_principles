package interface_segregation_principle;

/*
 * Here the client is forced to implement the unwanted methods, which voilates inteface segregation principle
 */
public class OldPrinterMachine implements Machine {

    @Override
    public void print(Document d) {
        System.out.println("OldPrinterMachine: Printing the document " + d);
    }

    @Override
    public void fax(Document d) {
        throw new UnsupportedOperationException("OldPrinterMachine: This functionality is not supported here");
    }

    @Override
    public void scan(Document d) {
        throw new UnsupportedOperationException("OldPrinterMachine: This functionality is not supported here");
    }
    
}
