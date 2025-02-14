import java.util.Scanner;

public class PraktikumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");

        String[] namaMK = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        int[] sks = {2,2,3,2,2,2,3,2};
        int[] angkaMK = new int[namaMK.length];
        String[] hurufMK = new String[namaMK.length];
        double[] bobotMK = new double[namaMK.length];

        double totalBobotSKS = 0;
        int totalSKS = 0; 

        for (int i = 0; i < namaMK.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + namaMK[i] + " : ");
            angkaMK[i] = sc.nextInt();

            if (angkaMK[i] > 80 && angkaMK[i] <= 100) {
                hurufMK[i] = "A";
                bobotMK[i] = 4.00;
            } else if (angkaMK[i] > 73 && angkaMK[i] <= 80) {
                hurufMK[i] = "B+";
                bobotMK[i] = 3.50;
            } else if (angkaMK[i] > 65 && angkaMK[i] <= 73) {
                hurufMK[i] = "B";
                bobotMK[i] = 3.00;
            } else if (angkaMK[i] > 60 && angkaMK[i] <= 65) {
                hurufMK[i] = "C+";
                bobotMK[i] = 2.50;
            } else if (angkaMK[i] > 50 && angkaMK[i] <= 60) {
                hurufMK[i] = "C";
                bobotMK[i] = 2.00;
            } else if (angkaMK[i] > 39 && angkaMK[i] <= 50) {
                hurufMK[i] = "D";
                bobotMK[i] = 1.00;
            } else {
                hurufMK[i] = "E";
                bobotMK[i] = 0;
            }
            totalBobotSKS += bobotMK[i] * sks[i];
            totalSKS += sks[i];
        }

        System.out.println("=================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=================================");

        System.out.printf("%-40s%-20s%-20s%-20s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("%-40s%-20d%-20s%-20.2f\n", namaMK[i], angkaMK[i], hurufMK[i], bobotMK[i]);
        }

        System.out.println("=================================");
        double ipSemester = totalBobotSKS / totalSKS;
        System.out.println("IP Semester : " + ipSemester);
        System.out.println("=================================");

        sc.close();
    }
}
