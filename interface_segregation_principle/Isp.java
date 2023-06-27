package interface_segregation_principle;

public class Isp {
    public static void main(String[] args) {

        Document d = new Document("My rules my world", "There was a legend living in the world");
        
        System.out.println("\nNot following the Interface segregation principle(ISP)");
        //Here this machine can't use the scan and fax functionality. But it is forcfully implementing and throwing the exception
        //Which is not the good practice, to solve this kind of problems. let's segregate the interface.
        OldPrinterMachine oPM = new OldPrinterMachine();
        oPM.print(d);

        System.out.println("\n\n");


        System.out.println("Following the Interface segregation principle(ISP)");
        /*
        * It is just a printer so it has the only functionality to print the document. Thats why it is only implementing the Printer interface
        * and following the interface segregation principle. Inspite of implemting the Machine interface, we segregated the functionalities in to
        * Printer and Scanner interface
        */
        JustAPrinter printer = new JustAPrinter();
        printer.print(d);

        
        /* 
        * This photocopier has the functionality to scan and print the document. Thats why it is implementing both the Printer and Scanner
        * interfaces. 
        */
        Photocopier photocopier = new Photocopier();
        photocopier.scan(d);
        photocopier.print(d);

        /*
         * We can also create an interface by extending other interfaces
         * interface MultiFunctionDevice extends Printer, Scanner {}
         * 
         * While implemting the MultiFunctionDevice, the sub class can also use the already implemted Printer and Scanner
         * according to the usage
         * 
         * 
         */

    }
}
