import java.util.Scanner;
public class MainFaktorial20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai: ");
        int nilai = sc.nextInt();

        faktorial20 fk = new faktorial20();
        System.out.println("Nilai Faktorial " + nilai + " Menggunakan BF : " + fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial " + nilai + " Menggunakan DC : " + fk.faktorialDC(nilai));

    }
}
