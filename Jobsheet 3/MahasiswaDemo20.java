public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Mahasiswa20[] arrayOfMahasiswa = new Mahasiswa20[3];
        arrayOfMahasiswa[0] = new Mahasiswa20 ();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;

        arrayOfMahasiswa[1] = new Mahasiswa20();
        arrayOfMahasiswa[1].nim = "2341720172";
        arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa[1].kelas = "TI-2A";
        arrayOfMahasiswa[1].ipk = (float) 3.36;

        arrayOfMahasiswa[2] = new Mahasiswa20();
        arrayOfMahasiswa[2].nim = "2441070023006";
        arrayOfMahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa[2].kelas = "TI - 2E";
        arrayOfMahasiswa[2].ipk = (float) 3.80;

        System.out.println("NIM\t : "+ arrayOfMahasiswa[0].nim);
        System.out.println("Nama\t : "+ arrayOfMahasiswa[0].nama);
        System.out.println("Kelas\t : "+ arrayOfMahasiswa[0].kelas);
        System.out.println("IPK\t : "+ arrayOfMahasiswa[0].ipk);
        System.out.println("---------------------------------");
        System.out.println("NIM\t : "+ arrayOfMahasiswa[1].nim);
        System.out.println("Nama\t : "+ arrayOfMahasiswa[1].nama);
        System.out.println("Kelas\t : "+ arrayOfMahasiswa[1].kelas);
        System.out.println("IPK\t : "+ arrayOfMahasiswa[1].ipk);
        System.out.println("---------------------------------");
        System.out.println("NIM\t : "+ arrayOfMahasiswa[2].nim);
        System.out.println("Nama\t : "+ arrayOfMahasiswa[2].nama);
        System.out.println("Kelas\t : "+ arrayOfMahasiswa[2].kelas);
        System.out.println("IPK\t : "+ arrayOfMahasiswa[2].ipk);
        System.out.println("---------------------------------");
    }
}
