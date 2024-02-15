import java.util.Scanner;
public class nomor4B{
    public static void main(String[] args) {
        static Scanner inputAngka = new Scanner(System.in);
        int statis[][] stokBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        
        static int[] hargaBunga = {75000, 50000, 60000, 10000};
public static void pendapatanPerCabang() {

for (int i0; 1stockBunga.length; i++) {

18

int totalPendapatan = 0;

19

untuk (int 0; j < stockBunga[i].panjang; j++)

20

totalPratinjau += stokBuah[i][j] * hargaBuah[j];

21

}

22

System.out.println("Pendapatan Cabang RoyalGarden "+ (i + 1) +Rp" + totalPendapatan);

23

}

24

}

25

public static void stokSetiapCabang() {

for (int i = 0; i < stockBunga.length; i++) {

System.out.println("Stok Cabang RoyalGarden " + (i + 1) + ":");

System.out.println("Aglonema: + stokBunga[1][0]);

29

System.out.println("Keladi: +stockBunga[i][1]); System.out.println("Alocasia: +stockBunga[1][2]);

30

31

System.out.print1n("Mawar: + stokBunga[i][3]);

32

Sistem.keluar.println();

33

34

35

// Fungsi untuk mengetahui jumlah stock setiap jenis bunga pada cabang RoyalGarden 4

36

//dengan pengurangan stock karena bunga matipublic static void penguranganStok() {

37

38

// Rincian pengurangan stok karena bunga mati

39

int penguranganAglonema1;

int penguranganKeladi2;

41

int penguranganAlocasia0;

42

int penguranganMawar = 5;

43

44

// Pengurangan stok pada cabang RoyalGarden 4

45

stockFlowers[3][0] -= mengurangiAglonema;

46

stockFlowers[3][1] -= penguranganYard; stockFlowers[3][3] -= kurangiRose;

47

48

49

50

51

public static void main(String[] args) {
Sistem.keluar.print1n("====");
System.out.println("Selamat Datang di Royal Garden");

54

Sistem.keluar.print1n("====");

55

System.out.println("Pilih Menu (1/2) :");

56

System.out.println("1. Pendapatan");

57

System.out.println("2. Stok Awal");

58

System.out.println("3. Stok setelah pengurangan");System.out.println("======");

59

60

System.out.print("Pilihan anda

");

61

int menu = masukanAngka.nextInt();

62

jika(menu==1){

63

pendapatanPerCabang();;

64

lain jika(menu == 2){

65

stokSetiapCabang(); } lain jika(menu == 3){

6667

kurangi Stok(); stokSetiap Cabang();

68

69

} kalau tidak{

70

System.out.println("Menu tidak valid");

72

73

75

    }
}