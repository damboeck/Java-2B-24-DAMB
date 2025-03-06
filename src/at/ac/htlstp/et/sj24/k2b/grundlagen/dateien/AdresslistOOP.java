package at.ac.htlstp.et.sj24.k2b.grundlagen.dateien;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AdresslistOOP {
    public static void main(String[] args) throws IOException {
        List<String> data = Files.readAllLines(Paths.get(Adressenliste.csvfile));
        Vector<Adresse> adressen = new Vector<Adresse>();

        for (int i=1;i<data.size();i++) {
            String line = data.get(i);
            if (line.trim().length()>0) {
                Adresse a = Adresse.fromCsvLine(line);
                adressen.add(a);
            }
        }

        adressen.add(new Adresse("Julia","Bauer",34,"St.Pölten",172,56.5));

        data = new ArrayList<>();
        data.add("Vorname;Name;Alter;Wohnort;Größe;Gewicht");
        for (Adresse a : adressen) {
            data.add(a.toCsvLine());
            System.out.println(a);
        }

        Files.write(Paths.get("data/out2.csv"), data);

    }
}
