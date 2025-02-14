import java.util.Scanner;
public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("================================");
        System.out.print("Masukkan nilai tugas: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int uts = sc.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int uas = sc.nextInt();
        System.out.println("--------------------------------");

            if (tugas >= 0 && tugas <= 100 && kuis >= 0 && kuis <= 100 && uts >= 0 && uts <= 100 && uas >= 0 && uas <= 100) {
                double nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
                System.out.println("Nilai Akhir : " + nilaiAkhir);
                    if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                        System.out.println("Nilai Huruf : A");
                        System.out.println("--------------------------------");
                        System.out.println("Selamat Anda Lulus");
                        System.out.println("================================");
                    } else if (nilaiAkhir > 73 && nilaiAkhir <=80) {
                        System.out.println("Nilai Huruf : B+");
                        System.out.println("--------------------------------");
                        System.out.println("Selamat Anda Lulus");
                        System.out.println("================================");
                    } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                        System.out.println("Nilai Huruf : B");
                        System.out.println("--------------------------------");
                        System.out.println("Selamat Anda Lulus");
                        System.out.println("================================");
                    } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                        System.out.println("Nilai Huruf : C+");
                        System.out.println("--------------------------------");
                        System.out.println("Selamat Anda Lulus");
                        System.out.println("================================");
                    } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                        System.out.println("Nilai Huruf : C");
                        System.out.println("--------------------------------");
                        System.out.println("Selamat Anda Lulus");
                        System.out.println("================================");
                    } else if (nilaiAkhir > 40 && nilaiAkhir <= 50) {
                        System.out.println("Nilai Huruf : D");
                        System.out.println("--------------------------------");
                        System.out.println("Anda Tidak Lulus");
                        System.out.println("================================");
                    } else if (nilaiAkhir > 0 && nilaiAkhir <= 40) {
                        System.out.println("Nilai Huruf : E");
                        System.out.println("--------------------------------");
                        System.out.println("Anda Tidak Lulus");
                        System.out.println("================================");
                    }
            } else {
                System.out.println("nilai tidak valid");
                System.out.println("================================");
            }
    sc.close();
    }
}