import java.util.Scanner;
public class nomor3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String [] Matkul = {"Pancasila, KTI, CTPS, Matdas, Bing, Daspro, Praktikum Daspro, Keselamatan dan Kesehatan Kerja"};
        int [] SKS = {2, 2, 2, 2, 2, 2, 2, 2, 3};
        double [] nilai = new double[Matkul.length];
        
        // Input nilai
        for (int i = 0; i < Matkul.length; i++){
            System.out.println("Masukkan nilai mata kuliah" +Matkul[i]+ ": ");
            nilai [i] = input.nextDouble();
            if (nilai[i]>100) {
                System.out.println("Nilai Tidak Valid");
                break;
            } 
        }

        // Konveksi nilai angka menjadi nilai huruf
        double totalIP = 0;
        for (int i = 0; i < nilai.length; i++) {
            String nilaiHuruf = "";
            double bobot = 4.00;
            double ipSemester = 0.00;

            if (nilai > 80 && nilai <=100) {
                nilaiHuruf = "A";
                bobot = 0.00;
            } else if (nilai > 73 && nilai <= 80){
                nilaiHuruf = "B+";
                bobot = 3.50;
            } else if (nilai > 65 && nilai <= 73){
                nilaiHuruf = "B";
                bobot = 3.00;
            } else if (nilai > 60 && nilai <= 65){
                nilaiHuruf = "C+";
                bobot = 2.50;
            } else {
                nilaiHuruf = "E";
                bobot = 0.00;
            }

             // Menghitung IP Semester
            ipSemester += bobot * SKS;
        }


        // Menampilkan hasil
        System.out.println("==============================");
        System.out.println("Hasil Nilai Semester");
        System.out.println("==============================");
        for (int i = 0; i < Matkul.length; i++) {
            System.out.println("Nama  Mata Kuliah: " + Matkul[i]);
            System.out.println("SKS: " + sksMatkul[i]);
            System.out.println("Nilai Huruf: " + nilaiHuruf[i]);
            System.out.println("Nilai Angka: " + nilaiAngka[i]);
        }
        System.out.println("Total SKS: " + totalSks);
        System.out.println("Total Nilai Mutu: " + totalNilaiMutu);
        System.out.println("IP Semester: " + ipSemester);
        System.out.println("==============================");

        System.out.println("Keterangan: " + keterangan);
    }
}