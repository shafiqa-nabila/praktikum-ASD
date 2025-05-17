import java.util.Scanner;
public class SuratDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat20 stack = new StackSurat20(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Layanan Surat Izin Mahasiswa ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin (berdasarkan nama mahasiswa)");
            System.out.println("5. Tampilkan Semua Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat       : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat20 suratBaru = new Surat20(id, nama, kelas, jenis, durasi);
                    stack.push(suratBaru);
                    break;
                case 2:
                    Surat20 suratDiproses = stack.pop();
                    if (suratDiproses != null) {
                        System.out.println("Surat yang diproses:");
                        suratDiproses.tampilkan();
                    }
                    break;
                case 3:
                    Surat20 suratTeratas = stack.peek();
                    if (suratTeratas != null) {
                        System.out.println("Surat izin terakhir:");
                        suratTeratas.tampilkan();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = sc.nextLine();
                    stack.cariSurat(cariNama);
                    break;
                case 5:
                    System.out.println("Semua surat yang tersimpan:");
                    stack.printAll();
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}

