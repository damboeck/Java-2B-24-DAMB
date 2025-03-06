package at.ac.htlstp.et.sj24.k2b.grundlagen.dateien;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Adressenliste {

    public static final String csvfile="data/daten.csv";

    public static void main(String[] args) throws IOException {
        List<String> data = Files.readAllLines(Paths.get(csvfile));
        Vector<String[]> adressen = new Vector<>();

        for (int i=1; i<data.size(); i++){
            String line = data.get(i).trim();
            if (line.length() > 0){
                //System.out.println(line);
                String[] adresse = new String[6];
                String[] cols = line.split(";");
                //System.out.println(Arrays.toString(cols));
                try {
                    for (int j = 0; j < 6; j++)
                        adresse[j] = cols[j].trim();
                } catch (ArrayIndexOutOfBoundsException e) {
                    for (int j=0; j<6; j++)
                        if (adresse[j] == null)
                            adresse[j] = "";
                }
                adressen.add(adresse);
            }
        }

        for (String[] adresse : adressen){
            System.out.println(Arrays.toString(adresse));
        }
    }
}
