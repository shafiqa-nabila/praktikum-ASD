public class MahasiswaMain20 {
    public static void main(String[] args) {
        Mahasiswa20 mhs1 = new Mahasiswa20();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa20 mhs2 = new Mahasiswa20("Shafiqa Nabila Maharani K", "244107020221", 3.66, "TI 2L");
        mhs2.updateIpk(3.66);
        mhs2.tampilkanInformasi();
        
    }
}