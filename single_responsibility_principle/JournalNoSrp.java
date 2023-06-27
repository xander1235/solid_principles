package single_responsibility_principle;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

//1 -> If we want to save the data in different type like db or cloud, we need to change in this class
//2 -> If we want to change the load functionality, we need to again change in this class
//3 -> save and load are not the Journal's responsibilities. If we are doing so then it is violiting the SRP rules
public class JournalNoSrp {

    private List<String> entries = new ArrayList<>();
    private static int count = 0;
    

    public void addEntry(String entry) {
        entries.add("" + (++count) + " : " +entry);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
    
    
    public void save(String filename) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(toString());
        }
    }

    public void load(String filename) {

    }

    public void load(URL url) {}
}
