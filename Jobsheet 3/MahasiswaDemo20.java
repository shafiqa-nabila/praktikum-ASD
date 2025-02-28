import java.util.Scanner;
public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Mahasiswa20[] arrayOfMahasiswa = new Mahasiswa20[3];
        String dummy;

        for (int i=0 ; i<3 ; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa20();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.println("NIM\t: ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.println("Nama\t: ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.println("Kelas\t: ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.println("IPK\t: ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------------");
        }

        for(int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
        }
    }
}
            
