import java.util.Scanner;

public class DataDosen20 {
    Dosen20[] dataDosen = new Dosen20[10];
    int idx = 0;

    void tambah(Dosen20 dsn){
        if (idx < dataDosen.length){
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data Dosen Sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++){
            dataDosen[i].tampil();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen20 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIndex].usia) {
                    maxIndex = j;
                }
            }
            Dosen20 temp = dataDosen[maxIndex];
            dataDosen[maxIndex] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void PencarianDataSequential20(){
        Scnner input =  new scanner();
        System.out.println("Masukkan nama dosen yang ingin dicari: ");
        String nama = input.nextLine();
        for (int i; i < idx; i++){
            if (dataDosen[i].nama == nama){
                System.out.println("Dosen ditemukan!");
                System.out.println("Kode: " + dataDosen[i].kode);
                System.out.println("Nama: " + dataDosen[i].nama);
                System.out.println("Jenis Kelamin: " + dataDosen[i].jenisKelamin);
                System.out.println("Usia: " + dataDosen[i].usia);
            }
        }

        if (!found) {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan! Ditemukan " + count + " dosen dengan nama " + nama + ".");
        }
    
    
    
    void PencarianDataBinary20(){
        Scanner input = new Scanner();
        System.out.println("Masukkan nama dosen yang ingin dicari: ");
        Stirng nama = input.nextLine();
        int mid = (idx -1) / 2;
        int left = 0;
        int right = idx - 1;
        while (left <= right) {
            if (dataDosen[mid].nama == nama){
                count++;
                System.out.println("Dosen ditemukan!");
                System.out.println("Kode: " + dataDosen[i].kode);
                System.out.println("Nama: " + dataDosen[i].nama);
                System.out.println("Jenis Kelamin: " + dataDosen[i].jenisKelamin);
                System.out.println("Usia: " + dataDosen[i].usia);
            }
        }

        int leftIndex = mid - 1;
            while (leftIndex >= left && dataDosen[leftIndex].nama.equals(nama)) {
                count++;
                System.out.println("Dosen ditemukan!");
                System.out.println("Kode: " + dataDosen[leftIndex].kode);
                System.out.println("Nama: " + dataDosen[leftIndex].nama);
                System.out.println("Jenis Kelamin: " + dataDosen[leftIndex].jenisKelamin);
                System.out.println("Usia: " + dataDosen[leftIndex].usia);
                System.out.println("---------------------");
                leftIndex--;
            }

        int rightIndex = mid + 1;
            while (rightIndex <= right && dataDosen[rightIndex].nama.equals(nama)) {
                count++;
                System.out.println("Dosen ditemukan!");
                System.out.println("Kode: " + dataDosen[rightIndex].kode);
                System.out.println("Nama: " + dataDosen[rightIndex].nama);
                System.out.println("Jenis Kelamin: " + dataDosen[rightIndex].jenisKelamin);
                System.out.println("Usia: " + dataDosen[rightIndex].usia);
                System.out.println("---------------------");
                rightIndex++;
            }
            break;
    }
}
