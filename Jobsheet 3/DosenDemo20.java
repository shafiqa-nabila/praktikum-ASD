import java.util.Scanner;

public class DosenDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        DataDosen20[] daftarDosen = new DataDosen20[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data untuk dosen ke-" + (i + 1));

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (true=Laki-laki, false=Perempuan): ");
            boolean jenisKelamin = sc.nextBoolean();

            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine(); 

            daftarDosen[i] = new DataDosen20(nama, usia, jenisKelamin);
        }

        // Menampilkan data menggunakan FOREACH
        System.out.println("\n=== Data Dosen ===");
        for (DataDosen20 dosen : daftarDosen) {
            dosen.tampilkanData();
        }

        //menampilkan hasil
        DataDosen20.dataSemuaDosen(daftarDosen);
        DataDosen20.jumlahDosenBerdasarkanJenisKelamin(daftarDosen);
        DataDosen20.rataRataUsiaDosenBerdasarkanJenisKelamin(daftarDosen);
        DataDosen20.infoDosenPalingTua(daftarDosen);
        DataDosen20.infoDosenPalingMuda(daftarDosen);


    }
}