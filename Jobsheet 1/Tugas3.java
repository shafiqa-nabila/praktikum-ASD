import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        System.out.println("--------------------------------");

        String[] namaMk = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hari = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama mata kuliah: ");
            namaMk[i] = sc.next();
            System.out.print("Masukkan SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Masukkan semester: ");
            semester[i] = sc.nextInt();
            System.out.print("Masukkan hari kuliah: ");
            hari[i] = sc.next();
            System.out.println("--------------------------------");
        }

        while (true) {
            System.out.println("Jadwal kuliah: ");
            System.out.println("1. Menampilkan seluruh jadwal kuliah");
            System.out.println("2. Menampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Menampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Mencari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            int pilihan = sc.nextInt();
    
            switch (pilihan) {
                case 1:
                    tampilkanJadwal(namaMk, sks, semester, hari);
                    break;
                case 2:
                    System.out.print("Masukkan hari: ");
                    String hariCari = sc.next();
                    tampilkanJadwalHari(namaMk, sks, semester, hari, hariCari);
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int semesterCari = sc.nextInt();
                    tampilkanJadwalSemester(namaMk, sks, semester, hari, semesterCari);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String namaCari = sc.next();
                    cariMataKuliah(namaMk, sks, semester, hari, namaCari);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    return;
            }
        }
    }

    public static void tampilkanJadwal(String[] namaMk, int[] sks, int[] semester, String[] hari) {
        System.out.println("================================");
        for (int i = 0; i < namaMk.length; i++) {
            System.out.println("Mata kuliah: " + namaMk[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
        }
        System.out.println("================================");
    }

    public static void tampilkanJadwalHari(String[] namaMk, int[] sks, int[] semester, String[] hari, String hariCari) {
        System.out.println("================================");
        boolean ditemukan = false;
        for (int i = 0; i < namaMk.length; i++) {
            if (hari[i].equals(hariCari)) {
                System.out.println("Mata kuliah: " + namaMk[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan");
        }
        System.out.println("================================");
    }

    public static void tampilkanJadwalSemester(String[] namaMk, int[] sks, int[] semester, String[] hari, int semesterCari) {
        System.out.println("================================");
        boolean ditemukan = false;
        for (int i = 0; i < namaMk.length; i++) {
            if (semester[i] == semesterCari) {
                System.out.println("Mata kuliah: " + namaMk[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
                ditemukan = true;
            } 
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan");
        }
        System.out.println("================================");
    }

    public static void cariMataKuliah(String[] namaMk, int[] sks, int[] semester, String[] hari, String namaCari) {
        System.out.println("================================");
        boolean ditemukan = false;
        for (int i = 0; i < namaMk.length; i++) {
            if (namaMk[i].equals(namaCari)) {
                System.out.println("Mata kuliah: " + namaMk[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan");
        }
        System.out.println("================================");
    }
}
