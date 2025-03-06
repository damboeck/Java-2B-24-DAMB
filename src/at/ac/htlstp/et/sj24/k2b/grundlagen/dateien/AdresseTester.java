package at.ac.htlstp.et.sj24.k2b.grundlagen.dateien;

public class AdresseTester {
    public static void main(String[] args) {
        Adresse a = new Adresse("Peter","Müller",34,"Zürich",178,72.7);
        Adresse b;
        b=new Adresse();

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.vorname);

    }
}
