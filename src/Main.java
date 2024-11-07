package src;

import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input dari pengguna

public class Main {
    public static void main(String[] args) {
        // Membuat objek scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan panjang sisi persegi
        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = scanner.nextDouble(); // Membaca panjang sisi persegi yang dimasukkan pengguna
        
        // Menghitung luas dan keliling persegi menggunakan metode yang telah didefinisikan
        double luas = hitungLuas(sisi);
        double keliling = hitungKeliling(sisi);
        
        // Menampilkan hasil perhitungan luas dan keliling persegi
        System.out.printf("Luas persegi: %.2f\n", luas); // Menampilkan luas dengan format dua angka desimal
        System.out.printf("Keliling persegi: %.2f\n", keliling); // Menampilkan keliling dengan format dua angka desimal
        
        // Menutup scanner untuk melepaskan sumber daya yang digunakan
        scanner.close();
    }

    // Metode untuk menghitung luas persegi
    private static double hitungLuas(double sisi) {
        return sisi * sisi; // Luas persegi dihitung dengan rumus sisi * sisi
    }

    // Metode untuk menghitung keliling persegi
    private static double hitungKeliling(double sisi) {
        return 4 * sisi; // Keliling persegi dihitung dengan rumus 4 * sisi
    }
}
