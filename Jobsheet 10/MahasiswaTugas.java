public class MahasiswaTugas {
    String nim;
    String nama;
    String prodi;
    String kelas;

    MahasiswaTugas(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    void tampilkanData() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Prodi: " + prodi + ", Kelas: " + kelas);
    }
}
