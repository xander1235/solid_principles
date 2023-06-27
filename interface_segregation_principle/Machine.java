package interface_segregation_principle;

/*
 * If the client wants to implement the Machine interface, he/she needs implement all the methods given below
 * even if its unnecssary, which we are forcing the client to implement, which is not a good practise.
 * To avoid this use the interface segregation principle.
 */
public interface Machine {
    void print(Document d);
    void fax(Document d);
    void scan(Document d);
}
