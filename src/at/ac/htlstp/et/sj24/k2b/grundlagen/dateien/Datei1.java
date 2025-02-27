package at.ac.htlstp.et.sj24.k2b.grundlagen.dateien;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Datei1 {

    public static final String outputFilename = "data/datei1.txt";

    public static void main(String[] args) {
        File f = new File(outputFilename);
        if (f.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }
        System.out.println(f.getAbsolutePath());
        Path p = Paths.get(outputFilename);
        p = f.toPath();
        f = p.toFile();
    }
}
