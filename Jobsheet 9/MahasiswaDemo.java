import java.util.Scanner;
public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackTugasMahasiswa stack = new StackTugasMahasiswa(5);
        int pilih;
        do {
            System.out.println("\n Menu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Terastas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih Menu : ");
            pilih = sc.nextInt();
            sc.nextLine();
            
            switch (pilih) {
            case 1:
                System.out.print("Nama: ");
                String nama = sc.nextLine();
                System.out.print("NIM: ");
                String nim = sc.nextLine();
                System.out.print("Kelas: ");
                String kelas = sc.nextLine();
                Mahasiswa20 mhs = new Mahasiswa20(nama, nim, kelas);
                stack.push(mhs);
                System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                break;
            
            case 2: 
                Mahasiswa20 dinilai = stack.pop();
                if (dinilai != null) {
                    System.out.println("Menilai tugas dari " + dinilai.nama);
                    System.out.print("Masukkan Nilai (o-100): ");
                    int nilai = sc.nextInt();
                    dinilai.tugasDinilai(nilai);
                    System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    String biner = stack.konversiDesimalkeBiner(nilai);
                    System.out.println("Nilai Biner Tugas: " + biner);
                }
                break;

            case 3:
                Mahasiswa20 lihat = stack.peek();
                if (lihat != null) {
                    System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                }
                break;

            case 4:
                System.out.println("Daftar semua tugas");
                System.out.println("Nama\tNIM\tKelas");
                stack.print();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
            case 6:
                Mahasiswa20 bawah = stack.bottom();
                if (bawah != null) {
                    System.out.println("Tugas terbawah:");
                    System.out.println(bawah.nama + " - " + bawah.nim);
                } else {
                    System.out.println("Stack masih kosong!");
                }
                break;
            case 7:
                System.out.println("Jumlah tugas yang sudah dikumpulkan: " + stack.jumlahTugas());
                break;
            }
        } while (pilih >= 1 && pilih <= 4);
        sc.close();
    }
}