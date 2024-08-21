import java.util.Scanner;

public class lathian_2 {

    public static void main(String[] args) {
        int bilangan;
        System.out.println("Program Untuk Mencari Bilangan Positif Atau Negatif4");
        System.out.println("================================================");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Sebuah Bilangan :");
        bilangan = scan.nextInt();
        if (bilangan > 0) {
            System.out.println(bilangan+"Angka yang dimasukkan adalah positif.");
        } else if (bilangan < 0) { 
            System.out.println(bilangan + " adalah bilangan negatif.");
        } else {
            System.out.println(bilangan + " adalah bilangan nol.");
        }
    }
}
