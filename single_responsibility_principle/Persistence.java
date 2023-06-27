package single_responsibility_principle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persistence {
    
    public void saveToFile(JournalSRP journal, String filename, boolean overwrite) throws FileNotFoundException {
        if (overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal);
            }
        }
    }
}
