import java.util.Scanner;
public class MatakuliahDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah20[] arrayOfMatakuliah20 = new Matakuliah20[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i=0 ; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode\t: ");
            kode = sc.nextLine();
            System.out.println("Nama\t: ");
            nama = sc.nextLine();
            System.out.println("Sks\t: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.println("Jumlah Jam\t: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------------");

            arrayOfMatakuliah20[i] = new Matakuliah20(kode, nama, sks, jumlahJam);
            System.out.println("------------------------------");
            arrayOfMatakuliah20[i].tambahData20(kode, nama, sks, jumlahJam);

            
            
        }
        for(int i=0; i<3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode\t: "+ arrayOfMatakuliah20[i].kode);
            System.out.println("Kode\t: "+ arrayOfMatakuliah20[i].nama);
            System.out.println("Kode\t: "+ arrayOfMatakuliah20[i].sks);
            System.out.println("Kode\t: "+ arrayOfMatakuliah20[i].jumlahJam);
            System.out.println("----------------------------------------------");


        }

        for(int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah20[i].cetakInfo();
        }
    }
}
