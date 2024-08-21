import java.util.Scanner;

public class latihan_3 {
    public static void main(String[] args) {
        // Daftar barang
        String[] barang = {"1. Buku", "2. Pulpen", "3. Pensil", "4. Penghapus"};
        int[] harga = {5000, 3000, 2000, 1000};

        // Menampilkan daftar barang
        System.out.println("Pilih barang yang ingin Anda beli:");
        for (String b : barang) {
            System.out.println(b);
        }
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor barang pilihan Anda (1-4): ");
        int pilihan = scanner.nextInt();

        if (pilihan >= 1 && pilihan <= barang.length) {
            System.out.println("Anda memilih: " + barang[pilihan - 1]);
            System.out.println("Harga: Rp " + harga[pilihan - 1]);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}

