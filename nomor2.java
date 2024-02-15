import java.util.Scanner;
public class nomor2{
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);

        // Masukkan NIM
        System.out.print("masukkan NIM: ");
        String nim = Input.nextLine();

        // 2 digit terakhir NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // Tambahkan 10 jika n kurang dari 10
        if (n < 10) {
            n += 10;
        }

        // Cetak deretan bilangan
        for (int i = 1; i <= n; i++) {
            // Mengecek Bil Tersebut Masuk Bil Genap atau Ganjil
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}