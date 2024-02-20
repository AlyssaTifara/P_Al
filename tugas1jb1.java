import java.util.Scanner;
public class tugas1jb1{
    public static void main(String[] args){
        char [] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String [][] KOTA = {
            {"BANTEN"},
            {"JAKARTA"},
            {"BANDUNG"},
            {"CIREBON"},
            {"BOGOR"},
            {"PEKALONGAN"},
            {"SEMARANG"},
            {"SURABAYA"},
            {"MALANG"},
            {"TEGAL"},
        };

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Kode Plat Nomor: ");
        String kodePlat = input.nextLine(); 
        
        String kota = null;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodePlat.charAt(0)) {
                kota = KOTA[i][0];
                break;
            }
        }

        // Menampilkan hasil
        if (kota != null) {
            System.out.println("Kota: " + kota);
        } else {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }
    }
}