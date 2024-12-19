package at.ac.htlstp.et.sj24.k2b.grundlagen.methoden;

import java.util.Scanner;

public class TesteMethoden {

    public static int readInt(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        sc.close();
        return result;
    }

    public static void main(String[] args) {
        int e;
        int a = readInt(   "Zahl :");
        e = BerechnungsMethoden.ziffernsumme(a);
        System.out.printf("Ziffernsumme von %d ist %d\n",a,e);
    }
}
