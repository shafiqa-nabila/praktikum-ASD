import java.util.Scanner;
public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Pilih perhitungan yang ingin dilakukan:");
            System.out.println("1. Volume Kubus");
            System.out.println("2. Luas Permukaan Kubus");
            System.out.println("3. Keliling Kubus");
            System.out.println("4. Keluar");

            System.out.print("Masukkan pilihan : ");
            int pilihan = sc.nextInt();
            
            if (pilihan == 4) {
                System.out.println("Program selesai.");
                break;
            }

            System.out.print("Masukkan panjang rusuk kubus: ");
            double rusuk = sc.nextDouble();
            
            
            
            switch (pilihan) {
                case 1:
                    System.out.println("Volume Kubus: " + hitungVolume(rusuk));
                    break;
                case 2:
                    System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(rusuk));
                    break;
                case 3:
                    System.out.println("Keliling Kubus: " + hitungKeliling(rusuk));
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
            System.out.println();
        }
        sc.close();
    }

    public static double hitungVolume(double rusuk) {
        return rusuk * rusuk * rusuk;
    }

    public static double hitungLuasPermukaan(double rusuk) {
        return 6 * rusuk * rusuk;
    }

    public static double hitungKeliling(double rusuk) {
        return 12 * rusuk;
    }
}

