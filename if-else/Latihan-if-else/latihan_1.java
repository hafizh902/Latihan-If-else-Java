import java.util.Scanner;

public class latihan_1 {

    public static void main(String[] args) {
        int bilangan;
        System.out.println("Program Untuk Mencari Bilangan Ganjil Atau Genap");
        System.out.println("================================================");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Sebuah Bilangan :");
        bilangan = scan.nextInt();
        if (bilangan == 0) {
            System.out.println("Angka yang dimasukkan adalah 0.");
        } else if (bilangan % 2 != 0) {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        } else {
            System.out.println(bilangan + " adalah bilangan genap.");
        }
    }
}