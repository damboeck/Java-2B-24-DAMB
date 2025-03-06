package at.ac.htlstp.et.sj24.k2b.grundlagen.dateien;

public class Adresse {

    String vorname;
    String nachname;
    int    alter;
    String wohnort;
    double groesse;
    double gewicht;

    public Adresse() {
        this.vorname  = "";
        nachname = "";
        alter    = 0;
        wohnort  = "";
        groesse  = 0;
        gewicht  = 0;
    }

    public Adresse(String vorname, String nachname, int alter, String wohnort, double groesse, double gewicht) {
        this.vorname  = vorname;
        this.nachname = nachname;
        this.alter    = alter;
        this.wohnort  = wohnort;
        this.groesse  = groesse;
        this.gewicht  = gewicht;
    }

    @Override
    public String toString() {
        return vorname+" "+nachname+","+wohnort+","+alter+" Jahre,"+groesse+" cm,"+gewicht+" kg";
    }

    public static Adresse fromCsvLine(String line) {
        Adresse a = new Adresse();
        //TODO parsen der Zeile
        try {
            String[] cols = line.split(";");
            a.vorname = cols[0].trim();
            a.nachname = cols[1].trim();
            try {
                String as = cols[2].trim();
                if (as.toLowerCase().endsWith("jahre"))
                    as = as.substring(0, as.length()-5).trim();
                if (as.length()>0)
                    a.alter = Integer.parseInt(as);
            } catch (NumberFormatException e) {
                System.out.println("Alter '" + cols[2] + "' is not a number");
            }
            a.wohnort = cols[3].trim();
            try {
                String gs = cols[4].trim();
                if (gs.toLowerCase().endsWith("cm"))
                    gs = gs.substring(0, gs.length()-2).trim();
                if (gs.length()>0)
                    a.groesse = Double.parseDouble(gs.replaceAll(",","."));
            } catch (NumberFormatException e) {
                //System.out.println("Größe '" + cols[4] + "' is not a number");
                throw new RuntimeException("Groesse '" + cols[4] + "' is not a number");
            }
            try {
                String gs = cols[5].trim();
                if (gs.toLowerCase().endsWith("kg"))
                    gs = gs.substring(0, gs.length()-2).trim();
                if (gs.length()>0)
                    a.gewicht = Double.parseDouble(gs.replaceAll(",","."));
            } catch (NumberFormatException e) {
                System.out.println("Gewicht '" + cols[5] + "' is not a number");
            }
        } catch (ArrayIndexOutOfBoundsException e) {}
        return a;
    }

    public String toCsvLine() {
        StringBuilder sb = new StringBuilder();
        sb.append(vorname).append(";").append(nachname).append(";").append(alter).append(";");
        sb.append(wohnort).append(";");
        sb.append((""+groesse).replaceAll("\\.",",")).append(";");
        sb.append((""+gewicht).replaceAll("\\.",",")).append(";");
        return sb.toString();
    }

}
