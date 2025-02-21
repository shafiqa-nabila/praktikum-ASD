public class Dosen20 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen20() {
    } 

    public Dosen20(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Masa Kerja: " + hitungMasaKerja(2025) + " tahun");
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println();
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("Status dosen telah diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi: " + bidangKeahlian);
    }
}