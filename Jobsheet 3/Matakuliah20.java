public class Matakuliah20 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah20() {
        this.kode = "XXXX";
        this.nama = "Belum Ditentukan";
        this.sks = 0;
        this.jumlahJam = 0;
        } 

    public Matakuliah20 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData20() {
        
    }

    public void tambahData20(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void cetakInfo() {
        System.out.println("kode : " + kode);
        System.out.println("nama : " + nama);
        System.out.println("sks : " + sks);
        System.out.println("jumlahJam: " + jumlahJam);
        System.out.println("------------------------");
        }
        
}
