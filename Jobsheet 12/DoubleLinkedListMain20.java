import java.util.Scanner;

public class DoubleLinkedListMain20 {
    static Mahasiswa20 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        return new Mahasiswa20(nama, nim, kelas, ipk);
    }
    public static void main(String[] args) {
        DoubleLinkedList20 list = new DoubleLinkedList20();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
        System.out.println("\nMenu Double Linked List Mahasiswa");
        System.out.println("1. Tambah di awal");
        System.out.println("2. Tambah di akhir");
        System.out.println("3. Hapus di awal");
        System.out.println("4. Hapus di akhir");
        System.out.println("5. Tampilkan data");
        System.out.println("6. Cari Mahasiswa berdasarkan NIM");
        System.out.println("7. Tambah data setelah NIM tertentu");
        System.out.println("8. Hapus setelah NIM tertentu");
        System.out.println("9. Hapus di index tertentu");
        System.out.println("10. Tampilkan data pertama");
        System.out.println("11. Tampilkan data terakhir");
        System.out.println("12. Tampilkan data pada index tertentu");
        System.out.println("13. Tampilkan jumlah data");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
        pilihan = scan.nextInt();
        scan.nextLine();

        switch (pilihan) {
                case 1: {
                    Mahasiswa20 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                    break;
                }
                case 2: {
                    Mahasiswa20 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                    break;
                }
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                    list.removeLast();
                    break;
                case 5:
                    list.print();
                    break;
                case 6: {
                    System.out.print("Masukkan NIM: ");
                    String keyNim = scan.nextLine();
                    Mahasiswa20 mhs = inputMahasiswa(scan);
                    list.insertAfter(keyNim, mhs);
                }
                case 7: {
                System.out.print("Masukkan NIM yang dicari: ");
                String keyNim = scan.nextLine();

                Mahasiswa20 mhs = inputMahasiswa(scan);
                list.insertAfter(keyNim, mhs);
                break;
                }
                case 8: {
                    System.out.print("Masukkan NIM: ");
                    String nim = scan.nextLine();
                    list.removeAfter(nim);
                    break;
                }
                case 9: {
                    System.out.print("Masukkan index: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list.remove(index);
                    break;
                }
                case 10: {
                    Mahasiswa20 mhs = list.getFirst();
                    if (mhs != null) mhs.tampil();
                    else System.out.println("Data kosong.");
                    break;
                }
                case 11: {
                    Mahasiswa20 mhs = list.getLast();
                    if (mhs != null) mhs.tampil();
                    else System.out.println("Data kosong.");
                    break;
                }
                case 12: {
                    System.out.print("Masukkan index: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa20 mhs = list.get(index);
                    if (mhs != null) mhs.tampil();
                    else System.out.println("Data tidak ditemukan.");
                    break;
                }
                case 13: {
                    System.out.println("Jumlah data dalam list: " + list.size());
                    break;
                }
                case 0:
                    System.out.println("Keluar dari program.");
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);
        scan.close();
    }
}

