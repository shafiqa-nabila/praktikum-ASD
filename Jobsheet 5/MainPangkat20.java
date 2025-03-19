import java.util.Scanner;

public class MainPangkat20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan Jumlah Elemen : ");
        int elemen = sc.nextInt();

        Pangkat20[] png = new Pangkat20[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Nilai Baris Elemen ke-" + (i+1) + " : ");
            int basis = sc.nextInt();

            System.out.print("Masukkan Nilai Pangkat Elemen ke-" + (i+1) + " : ");
            int pangkat = sc.nextInt();

            png[i] = new Pangkat20(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE");
        for (Pangkat20 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
        }
        
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER");
        for (Pangkat20 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    sc.close();
    }    
}
