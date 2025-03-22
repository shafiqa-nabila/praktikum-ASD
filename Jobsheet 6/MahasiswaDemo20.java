import java.util.Scanner;
public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi20 list = new MahasiswaBerprestasi20();

        // for (int i = 0; i < 5; i++) {
        //     System.out.print("Masukkan NIM Mahasiswa: ");
        //     String nim = sc.nextLine();
        //     System.out.print("Masukkan Nama Mahasiswa: ");
        //     String nama = sc.nextLine();
        //     System.out.print("Masukkan Kelas Mahasiswa: ");
        //     String kelas = sc.nextLine();
        //     System.out.print("Masukkan IPK Mahasiswa: ");
        //     double ipk = sc.nextDouble();
        //     sc.nextLine(); 

        //     Mahasiswa20 m = new Mahasiswa20(nim, nama, kelas, ipk);
        //     list.tambah(m);

    Mahasiswa20 m1 = new Mahasiswa20 ("123", "Zidan", "2A", 3.2);
    Mahasiswa20 m2 = new Mahasiswa20 ("124", "Ayu", "2A", 3.5);
    Mahasiswa20 m3 = new Mahasiswa20 ("125", "Sofi", "2A", 3.1);
    Mahasiswa20 m4 = new Mahasiswa20 ("126", "Sita", "2A", 3.9);
    Mahasiswa20 m5 = new Mahasiswa20 ("127", "Miki", "2A", 3.7);

    list.tambah(m1);
    list.tambah(m2);
    list.tambah(m3);
    list.tambah(m4);
    list.tambah(m5);

    System.out.println("Data Mahasiswa Belum Sorting");
    list.tampil();
    System.out.println("Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC)");
    list.bubbleSort();
    list.tampil();

    System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
    list.SelectionSort();
    list.tampil();

    System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
    list.insertionSort();
    list.tampil();


    }
}
