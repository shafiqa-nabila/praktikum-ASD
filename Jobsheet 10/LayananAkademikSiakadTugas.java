import java.util.Scanner;

public class LayananAkademikSiakadTugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan20 antrian = new AntrianLayanan20(10);
        int jumlahKRS = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa20 mhs = new Mahasiswa20(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    System.out.println("Memproses KRS untuk 2 Mahasiswa:");
                    for (int i = 0; i < 2; i++) {
                        Mahasiswa20 mhsProses = antrian.dequeue();
                        if (mhsProses != null) {
                            mhsProses.tampilkanData();
                            jumlahKRS++;
                        }
                    }
                    break;

                case 3:
                    antrian.print();
                    break;

                case 4:
                    System.out.println("2 Antrian Terdepan:");
                    for (int i = 0; i < 2; i++) {
                        Mahasiswa20 mhsTerdepan = antrian.dequeue();
                        if (mhsTerdepan != null) {
                            mhsTerdepan.tampilkanData();
                        }
                    }
                    break;

                case 5:
                    if (!antrian.IsEmpty()) {
                        System.out.println("Antrian Paling Akhir:");
                        antrian.data[antrian.rear].tampilkanData();
                    } else {
                        System.out.println("Antrian kosong!");
                    }
                    break;

                case 6:
                    System.out.println("Jumlah Antrian: " + antrian.getJumlahAntrian());
                    break;

                case 7:
                    antrian.clear();
                    System.out.println("Antrian telah dikosongkan.");
                    break;

                case 8:
                    System.out.println("Keluar dari program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
