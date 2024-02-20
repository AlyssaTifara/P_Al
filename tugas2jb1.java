import java.util.Scanner;
public class tugas2jb1{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Rumus Yang Ingin Dihitung:");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();

        double jarak, waktu, kecepatan;
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan jarak (km): ");
                jarak = scanner.nextDouble();
                System.out.print("Masukkan waktu (jam): ");
                waktu = scanner.nextDouble();

                kecepatan = jarak / waktu;

                System.out.println("Kecepatan: " + kecepatan + " km/jam");
                break;

            case 2:
                System.out.print("Masukkan kecepatan (km/jam): ");
                kecepatan = scanner.nextDouble();
                System.out.print("Masukkan waktu (jam): ");
                waktu = scanner.nextDouble();

                jarak = kecepatan * waktu;

                System.out.println("Jarak: " + jarak + " km");
                break;

            case 3:
                System.out.print("Masukkan kecepatan (km/jam): ");
                kecepatan = scanner.nextDouble();
                System.out.print("Masukkan jarak (km): ");
                jarak = scanner.nextDouble();
                
                waktu = jarak / kecepatan;

                System.out.println("Waktu: " + waktu + " jam");
                break;
                
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}