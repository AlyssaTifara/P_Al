import java.util.Scanner;
public class nomor4A{
    public static void main(String[] args) {
        // Data stok bunga
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        int[][] stockBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9},
        };
    
        // Hitung pendapatan setiap cabang
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatanCabang = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatanCabang += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("Pendapatan RoyalGarden " + (i + 1) + ": Rp" + pendapatanCabang);
        }
        // Hitung stock setiap cabang
    for (int i = 0; i < stockBunga.length; i++){
        System.out.println("Stok Cabang Royal Garden " + (i + 1));
        System.out.println("Aglonema: " + stockBunga[i][0]);
        System.out.println("Keladi: " + stockBunga[i][1]);
        System.out.println("Alocasia: " + stockBunga[i][2]);
        System.out.println("Mawar: " + stockBunga[i][3]);
    }
    // Hitung pengurangan stok
    int penguranganAglonema = 1;
    int penguranganKeladi = 2;
    int penguranganAlocasia = 0;
    int penguranganMawar = 5;

    stockBunga[3][0] -= penguranganAglonema;
    stockBunga[3][1] -= penguranganKeladi;
    stockBunga[3][2] -= penguranganMawar;
    }
}

