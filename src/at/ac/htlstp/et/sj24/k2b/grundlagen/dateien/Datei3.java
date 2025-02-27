package at.ac.htlstp.et.sj24.k2b.grundlagen.dateien;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Datei3 {

    public static void main(String[] args) throws IOException {
        Path p= Paths.get(Datei1.outputFilename);
        List<String> data;
        data = Files.readAllLines(p);
        for (int i = 0; i < data.size(); i++) {
            String line=data.get(i);
            System.out.println(line);
        }
    }
}
