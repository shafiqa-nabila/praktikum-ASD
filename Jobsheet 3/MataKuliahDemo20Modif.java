import java.util.Scanner;
public class MataKuliahDemo20Modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatakuliah = Integer.parseInt(sc.nextLine());
        Matakuliah20[] arrayOfMatakuliah = new Matakuliah20[jumlahMatakuliah];
        
        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("SKS: ");
            int sks = Integer.parseInt(sc.nextLine());
            System.out.print("Jumlah Jam: ");
            int jumlahJam = Integer.parseInt(sc.nextLine());

            arrayOfMatakuliah[i] = new Matakuliah20(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1) + ": ");
            arrayOfMatakuliah[i].cetakInfo(); 
        }
    }
}