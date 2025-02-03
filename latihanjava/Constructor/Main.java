import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        try (Scanner scanner = new Scanner(System.in)) {
            // Menampilkan menu dan meminta input dari pengguna
            System.out.println("Selamat datang di Aplikasi Kalkulator Sederhana");
            System.out.print("Masukkan angka pertama: ");
            double num1 = scanner.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double num2 = scanner.nextDouble();

            System.out.println("Pilih operasi: ");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.print("Masukkan pilihan (1-4): ");
            int choice = scanner.nextInt();

            // Memproses pilihan dan menampilkan hasil
            switch (choice) {
                case 1 -> {
                    double result = num1 + num2;
                    System.out.println("Hasil Penjumlahan: " + result);
                }
                case 2 -> {
                    double result = num1 - num2;
                    System.out.println("Hasil Pengurangan: " + result);
                }
                case 3 -> {
                    double result = num1 * num2;
                    System.out.println("Hasil Perkalian: " + result);
                }
                case 4 -> {
                    if (num2 != 0) {
                        double result = num1 / num2;
                        System.out.println("Hasil Pembagian: " + result);
                    } else {
                        System.out.println("Pembagian dengan nol tidak diperbolehkan!");
                    }
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
