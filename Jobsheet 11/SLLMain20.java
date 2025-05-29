import java.util.Scanner;

public class SLLMain20 {
    public static void main(String[] args) {
        SingleLinkedList20 sll = new SingleLinkedList20();

        Mahasiswa20 mhs1 = new Mahasiswa20("20001", "Alvaro", "3A", 3.5);
        Mahasiswa20 mhs2 = new Mahasiswa20("20002", "Cintia", "3B", 3.2);
        Mahasiswa20 mhs3 = new Mahasiswa20("20003", "Bimon", "3A", 3.8);
        Mahasiswa20 mhs4 = new Mahasiswa20("20004", "Dirga", "3C", 3.1);

        // Scanner sc = new Scanner(System.in);
        // SingleLinkedList20 data = new SingleLinkedList20();

        // System.out.print("Masukkan NIM   : ");
        // String nim = sc.nextLine();
        // System.out.print("Masukkan Nama  : ");
        // String nama = sc.nextLine();
        // System.out.print("Masukkan Kelas : ");
        // String kelas = sc.nextLine();
        // System.out.print("Masukkan IPK   : ");
        // double ipk = sc.nextDouble();

        // Mahasiswa20 mhsBaru = new Mahasiswa20(nim, nama, kelas, ipk);
        // data.addFirst(mhsBaru);
        // data.print();
        
        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter("Dirga", mhs3);
        // sll.insertAt(2, mhs2);
        // sll.print();

    sll.addFirst(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);
        sll.addLast(mhs4);

        System.out.println("Data awal: ");
        sll.print();

        System.out.println("Data Index 1: ");
        sll.getData(1);

        System.out.println("Data Mahasiswa an Bimon berada pada index: " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        System.out.println("Setelah dihapus dari depan: ");
        sll.print();

        sll.removeLast();
        System.out.println("Setelah dihapus dari belakang: ");
        sll.print();

        sll.removeAt(0);
        System.out.println("Setelah dihapus index 0: ");
        sll.print();

    }
}
