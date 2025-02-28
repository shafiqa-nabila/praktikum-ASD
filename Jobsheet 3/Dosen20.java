public class Dosen20 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen20() {

    }

    public Dosen20 (String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void cetakInfo20() {
        System.out.println("Kode\t: " + kode);
        System.out.println("Nama\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia\t: " + usia);
        System.out.println("------------------------------------");
    }

    String cariKelamin() {
        return jenisKelamin ? "Laki-laki" : "Perempuan";
    }


}