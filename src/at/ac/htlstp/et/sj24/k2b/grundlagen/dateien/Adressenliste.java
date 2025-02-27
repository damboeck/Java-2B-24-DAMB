package at.ac.htlstp.et.sj24.k2b.grundlagen.dateien;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Adressenliste {

    public static final String csvfile="data/daten.csv";

    public static void main(String[] args) throws IOException {
        List<String> data = Files.readAllLines(Paths.get(csvfile));
        for (int i=1; i<data.size(); i++){
            String line = data.get(i).trim();
            if (line.length() > 0){
                String[] cols = line.split(";");
                String name = cols[1];
                System.out.println(name);
                //System.out.println(line);
            }
        }
    }
}
