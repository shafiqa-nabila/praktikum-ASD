public class Mahasiswa20 {

    String nim, nama, kelas;
    double ipk;

    Mahasiswa20() {

    }

    Mahasiswa20(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilkanInformasi(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}
