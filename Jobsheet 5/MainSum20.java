import java.util.Scanner;

public class MainSum20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Elemen : ");
        int elemen = sc.nextInt();

        Sum20 sm = new Sum20(elemen);
        for(int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i+1) + " : ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce : " + sm.totalBF());
        System.out.println("Total Keuntungan Menggunakan Divide and Conquer : " + sm.totalDC(sm.keuntungan, 0, elemen - 1));

        sc.close();
    }
}
