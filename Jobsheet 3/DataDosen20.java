public class DataDosen20 {
    String nama;
    int usia;
    boolean jenisKelamin;

    public DataDosen20 (String nama, int usia, boolean jenisKelamin) {
        this.nama = nama;
        this.usia = usia;
        this.jenisKelamin = jenisKelamin;
    }

    public void tampilkanData () {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "pria" : "wanita"));
        System.out.println();
    }
    
    // a. Data Semua Dosen
    public static void dataSemuaDosen(DataDosen20[] arrayDataDosen20) {
        System.out.println("===Data Semua Dosen===");
        for (DataDosen20 dsn : arrayDataDosen20) {
            dsn.tampilkanData();
        }
    }

    //b. menampilkan jumlah dosen berdasarkan jenis kelamin
    public static void jumlahDosenBerdasarkanJenisKelamin(DataDosen20[] arrayDataDosen20) {
        int jumlahPria=0, jumlahWanita=0;
        for (DataDosen20 dsn : arrayDataDosen20) {
            if (dsn.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("Jumlah Dosen: ");
        System.out.println("Pria: " + jumlahPria);
        System.out.println("Wanita: " + jumlahWanita);
    }

    //c. menghitung rata-rata usia dosen berdasarkan jenis kelamin
    public static void rataRataUsiaDosenBerdasarkanJenisKelamin(DataDosen20[] arrayDataDosen20) {
        int totalUsiaPria=0, totalUsiaWanita=0;
        int countPria=0, countWanita=0;

        for (DataDosen20 dsn : arrayDataDosen20) {
            if (dsn.jenisKelamin) {
                totalUsiaPria += dsn.usia;
                countPria++;
            } else {
                totalUsiaWanita += dsn.usia;
                countWanita++;
            }
        }

        System.out.println("\nRata-rata Usia Dosen Per Jenis Kelamin:");
        double rerataUsiaPria = (double) totalUsiaPria / countPria;
        double rerataUsiaWanita = (double) totalUsiaWanita / countWanita;
        System.out.println("Pria: " + rerataUsiaPria);
        System.out.println("Wanita: " + rerataUsiaWanita);
    }

    // d. Menampilkan dosen paling tua
    public static void infoDosenPalingTua(DataDosen20[] arrayDataDosen20) {
        if (arrayDataDosen20.length == 0) return;

        DataDosen20 dosenTertua = arrayDataDosen20[0];
        for (DataDosen20 dosen : arrayDataDosen20) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }

        System.out.println("\nDosen Paling Tua: ");
        dosenTertua.tampilkanData();
    }

    // e. Menampilkan dosen paling muda
    public static void infoDosenPalingMuda(DataDosen20[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        DataDosen20 dosenTermuda = arrayOfDosen[0];
        for (DataDosen20 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }

        System.out.println("\nDosen Paling Muda: ");
        dosenTermuda.tampilkanData();

    }
}
