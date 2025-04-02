import java.util.Scanner;
public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi20 list = new MahasiswaBerprestasi20(jumMhs);
        
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("--------------------------------");
            list.tambah (new Mahasiswa20(nim, nama,kelas,ipk));
        }

            // list.tampil();
            // System.out.println("--------------------------------");
            // System.out.println("Pencarian data");
            // System.out.println("--------------------------------");
            // System.out.println("Masukkan ipk mahasiswa yang dicari: ");
            // System.out.println("IPK: ");
            // double cari = sc.nextDouble();

            // System.out.println("menggunakan sequential searching");
            // double posisi = list.sequentialSearching(cari);
            // int pss= (int)posisi;
            // list.tampilPosisi(cari, pss);
            // list.tampilDataSearch(cari, pss);

            
            System.out.println("--------------------------------");
            System.out.println("Pencarian data");
            System.out.println("--------------------------------");
            System.out.println("Masukkan ipk mahasiswa yang dicari: ");
            System.out.println("IPK: ");
            double cari = sc.nextDouble();
            System.out.println("menggunakan binary search");
            System.out.println("--------------------------------");
            double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
            int pss2= (int)posisi2;
            list.tampilPosisi(cari, pss2);
            list.tampilDataSearch(cari, pss2);
    }    
}