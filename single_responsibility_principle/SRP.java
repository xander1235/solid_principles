package single_responsibility_principle;
public class SRP {
    public static void main(String[] args)throws Exception {

        //This journal no srp is violating the single responsebility principle by having all the functionalities at one place like the GOD object
        JournalNoSrp journalNoSrp = new JournalNoSrp();
        journalNoSrp.addEntry("I am GOD object");
        journalNoSrp.addEntry("Violates srp ");
        
        journalNoSrp.save("/Users/apple/Desktop/nosrp.txt");

        //Here is the journal which follows the single responsibility principle
        JournalSRP journal = new JournalSRP();
        journal.addEntry("I have one reason to chnage");
        journal.addEntry("I'm following srp rules");

        Persistence persistence = new Persistence();
        persistence.saveToFile(journal, "/Users/apple/Desktop/srp.txt", true);

    }
}