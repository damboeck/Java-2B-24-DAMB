package at.ac.htlstp.et.sj24.k2b.grundlagen.dateien;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Datei2 {

    public static final String failDateiname="data1/fail.txt";

    public static void main(String[] args){
        Path p= Paths.get(Datei1.outputFilename);
        //p=Paths.get(failDateiname);
        List<String> data = new ArrayList<>();
        data.add("erste Zeile");
        data.add("zweite Zeile");
        try {
            Files.write(p,data);
            System.out.println("File written");
        } catch (IOException e) {
            System.out.println("Datei konnte nicht erstellt werden");
        }
        System.out.println("FERTIG!");
    }
}
