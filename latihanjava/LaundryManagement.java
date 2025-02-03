import java.util.Scanner;

// Encapsulation
class Laundry {
    private String namaPelanggan;
    private String jenisLayanan;
    private double berat;
    private String nomorHp;

    // Constructor
    public Laundry(String namaPelanggan, String jenisLayanan, double berat, String nomorHp) {
        this.namaPelanggan = namaPelanggan;
        this.jenisLayanan = jenisLayanan;
        this.berat = berat;
        this.nomorHp = nomorHp;
    }

    // Getter dan Setter
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public String getNomorHp() {
        return nomorHp;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    // Method untuk menghitung harga (Polymorphism)
    public double hitungHarga() {
        return 0.0; // Implementasi default
    }
}

// Inheritance dan Polymorphism
class LaundryReguler extends Laundry {
    public LaundryReguler(String namaPelanggan, double berat, String nomorHp) {
        super(namaPelanggan, "Reguler", berat, nomorHp);
    }

    @Override
    public double hitungHarga() {
        return getBerat() * 5000; // Harga per kg untuk layanan reguler
    }
}

class LaundryExpress extends Laundry {
    public LaundryExpress(String namaPelanggan, double berat, String nomorHp) {
        super(namaPelanggan, "Express", berat, nomorHp);
    }

    @Override
    public double hitungHarga() {
        return getBerat() * 8000; // Harga per kg untuk layanan express
    }
}

public class LaundryManagement {
    // Sistem Login
    private static final String USERNAME = "admin"; // Username yang valid
    private static final String PASSWORD = "admin123"; // Password yang valid

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Proses Login
        System.out.println("=== Sistem Login ===");
        System.out.print("Masukkan Username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();

        if (!username.equals(USERNAME) || !password.equals(PASSWORD)) {
            System.out.println("Username atau password salah. Program dihentikan.");
            scanner.close();
            return; // Keluar dari program jika login gagal
        }

        System.out.println("Login berhasil!");
        
        // Menu aplikasi laundry
        System.out.println("\n=== Sistem Manajemen Laundry ===");
        System.out.println("1. Tambah Laundry Reguler");
        System.out.println("2. Tambah Laundry Express");
        System.out.println("3. Keluar");
        System.out.print("Pilih opsi: ");

        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi karakter newline

        if (pilihan == 1) {
            System.out.print("Masukkan nama pelanggan: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan nomor HP pelanggan: ");
            String nomorHp = scanner.nextLine();
            System.out.print("Masukkan berat (kg): ");
            double berat = scanner.nextDouble();

            Laundry reguler = new LaundryReguler(nama, berat, nomorHp);
            System.out.println("\n--- Struk Laundry ---");
            System.out.println("Pelanggan: " + reguler.getNamaPelanggan());
            System.out.println("Nomor HP: " + reguler.getNomorHp());
            System.out.println("Layanan: " + reguler.getJenisLayanan());
            System.out.println("Berat: " + reguler.getBerat() + " kg");
            System.out.println("Total Harga: Rp " + reguler.hitungHarga());
        } else if (pilihan == 2) {
            System.out.print("Masukkan nama pelanggan: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan nomor HP pelanggan: ");
            String nomorHp = scanner.nextLine();
            System.out.print("Masukkan berat (kg): ");
            double berat = scanner.nextDouble();

            Laundry express = new LaundryExpress(nama, berat, nomorHp);
            System.out.println("\n--- Struk Laundry ---");
            System.out.println("Pelanggan: " + express.getNamaPelanggan());
            System.out.println("Nomor HP: " + express.getNomorHp());
            System.out.println("Layanan: " + express.getJenisLayanan());
            System.out.println("Berat: " + express.getBerat() + " kg");
            System.out.println("Total Harga: Rp " + express.hitungHarga());
        } else if (pilihan == 3) {
            System.out.println("Keluar dari sistem. Terima kasih!");
        } else {
            System.out.println("Pilihan tidak valid! Silakan restart program dan coba lagi.");
        }

        scanner.close();
    }
}
