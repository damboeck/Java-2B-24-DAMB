package at.ac.htlstp.et.sj24.k2b.grundlagen.schleifen;

public class TESTX {

    public static void drawX(int size) {
        for (int z = 0; z < size; z++) {
            for (int s = 0; s < size; s++) {
                char c = z==s?'X':' ';
                if (z==(size-1)-s) c='X';
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void drawZ(int b,int size) {
        for (int z = 0; z < b; z++) System.out.print(" ");
        System.out.print("X");
        for (int z = 0; z < size-2-b*2; z++) System.out.print(" ");
        System.out.println("X");
    }

    public static void drawX1(int size) {
        int a = (size-1)/2;
        for (int i=0;i<a;i++) drawZ(i,size);
        for (int w=0;w<=(size+1)%2;w++) {
            for (int i=0;i<a;i++) System.out.print(" ");
            System.out.println(size%2==0?"XX":"X");
        }
        for (int i=a-1;i>=0;i--) drawZ(i,size);
    }

    public static void main(String[] args) {
        drawX1(5);
        drawX1(8);
    }
}
