package single_responsibility_principle;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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
