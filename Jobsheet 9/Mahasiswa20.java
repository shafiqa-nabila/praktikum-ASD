public class Mahasiswa20 {
    String nim, nama, kelas;
    int nilai;

    public Mahasiswa20(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1; 
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", Nilai: " + 
               (nilai == -1 ? "Belum Dinilai" : nilai);
    }
}