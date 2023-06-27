package single_responsibility_principle;

import java.util.ArrayList;
import java.util.List;

//Now the journal has the single reason to change depending on the fields
//But in case of journalNoSrp it is a GOD object, which has everythin like save and load the file as well
public class JournalSRP {
    
    private List<String> entries = new ArrayList<>();
    private static int counter  = 0;

    public void addEntry(String entry) {
        entries.add("" + (++counter) + " : " + entry);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
