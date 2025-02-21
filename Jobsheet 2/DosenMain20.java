public class DosenMain20 {
    public static void main(String[] args) {
        Dosen20 dsn1 = new Dosen20();
        dsn1.idDosen = "D001";
        dsn1.nama = "Mungki Astiningrum, S.T., M.Kom.";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2005;
        dsn1.bidangKeahlian = "Algoritma dan Struktur Data";
        dsn1.tampilInformasi();

        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("Data Science");
        dsn1.tampilInformasi();

        Dosen20 dsn2 = new Dosen20("D002", "Imam Fahrur Rozi, S.T., M.T.", true, 2015, "Sistem Informasi");
        dsn2.tampilInformasi();

        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Manajemen Proyek TI");
        dsn2.tampilInformasi();
    }
}