public class PraktikumFungsi {
    public static void main(String[] args) {
        String[] bunga = {"agnolema", "keladi", "alocasia", "mawar"};
        int[] harga = {75000, 50000, 60000, 10000};
        String[] cabang = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};
        int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        
        tampilPendapatan(bunga, harga, cabang, stok);
        tampilStokBunga(bunga, stok);
    }

    static void tampilPendapatan(String[] bunga, int[] harga, String[] cabang, int[][] stok) {
        for (int i = 0; i < cabang.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < bunga.length; j++) {
                pendapatan += stok[i][j] * harga[j];
            }
            System.out.println("Pendapatan " + cabang[i] + " adalah " + pendapatan);
        }
    }

    static void tampilStokBunga(String[] bunga, int[][] stok) {
        System.out.println("Stok Bunga di cabang Royal Garden 4!");
        int[] pengurang = {1, 2, 0, 5};
        for (int j = 0; j < bunga.length; j++) {
            int x = stok[3][j] - pengurang[j];
            System.out.println("stok bunga " + bunga[j] + " = " + x);
        }
    }
}