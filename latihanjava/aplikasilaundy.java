

import java.util.Scanner;

class User {
    private String username;
    private String password;
    private double saldo;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.saldo = 0;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getSaldo() {
        return saldo;
    }

    public void topUp(double amount) {
        if (amount > 0) {
            saldo += amount;
            System.out.println("Top-up berhasil! Saldo Anda sekarang: Rp " + saldo);
        } else {
            System.out.println("Jumlah top-up tidak valid.");
        }
    }

    public boolean penguranganSaldo(double amount) {
        if (saldo >= amount) {
            saldo -= amount;
            return true;
        } else {
            return false;
        }
    }
}

abstract class Laundry {
    protected double hargaPerkilo;

    public abstract double hitungHarga(double kilo);
}

class LaundryReguler extends Laundry {
    public LaundryReguler() {
        this.hargaPerkilo = 2000; // Harga per kilo untuk reguler
    }

    @Override
    public double hitungHarga(double kilo) {
        return kilo * hargaPerkilo;
    }
}

class LaundryCepat extends Laundry {
    public LaundryCepat() {
        this.hargaPerkilo = 4000; // Harga per kilo untuk cepat
    }

    @Override
    public double hitungHarga(double kilo) {
        return kilo * hargaPerkilo;
    }
}

public class aplikasilaundy  {
    private static Scanner scanner = new Scanner(System.in);
    private static User user;

    public static void main(String[] args) {
        login();
        showMenu();
    }

    private static void login() {
        System.out.println("=== Program Laundry ===");
        System.out.print("Masukkan Username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();

        user = new User(username, password);
        System.out.println("Login berhasil untuk pengguna: " + user.getUsername());
    }

    private static void showMenu() {
        System.out.println("\nPilih Layanan Laundry:");
        System.out.println("1. Laundry Reguler");
        System.out.println("2. Laundry Cepat");
        System.out.println("3. Top-Up Saldo");
        System.out.println("4. Cek Saldo");
        System.out.println("5. Keluar");
        System.out.print("Pilih (1/2/3/4/5): ");
        int pilih = scanner.nextInt();

        if (pilih == 1) {
            prosesLaun(new LaundryReguler());
        } else if (pilih == 2) {
            prosesLaun(new LaundryCepat());
        } else if (pilih == 3) {
            topUpSaldo();
        } else if (pilih == 4) {
            checkSaldo();
        } else if (pilih == 5) {
            System.out.println("Terima kasih telah menggunakan layanan kami!");
        } else {
            System.out.println("Pilihan tidak valid.");
            showMenu(); // Menampilakn menu lagi kalo pilihan tidak valid
        }
    }

    private static void prosesLaun(Laundry laundryService) {
        System.out.print("Masukkan berat (dalam kg): ");
        double kilo = scanner.nextDouble();
        double totalPrice = laundryService.hitungHarga(kilo);
        System.out.println("Total Harga: Rp " + totalPrice);

        System.out.println("Pilih Metode Pembayaran:");
        System.out.println("1. Bayar Cash");
        System.out.println("2. Bayar dari Saldo");
        System.out.print("Pilih (1/2): ");
        int pembayaran = scanner.nextInt();

        if (pembayaran == 1) {
            bayarCash(totalPrice);
        } else if (pembayaran == 2) {
            payWithSaldo(totalPrice);
        } else {
            System.out.println("Pilihan tidak valid.");
            prosesLaun(laundryService); // nampilkan kembali proses laundry kalo pilihan tidak valid
        }
    }

    private static void bayarCash(double totalPrice) {
        System.out.print("Masukkan uang yang diberikan: Rp ");
        double uang = scanner.nextDouble();

        if (uang >= totalPrice) {
            double change = uang - totalPrice;
            System.out.println("Pembayaran berhasil!");
            System.out.println("Kembalian Anda: Rp " + change);
            showMenu();
        } else {
            System.out.println("Uang yang diberikan tidak cukup. Silakan coba lagi.");
            bayarCash(totalPrice); // Ulangi proses pembayaran
        }
    }

    private static void payWithSaldo(double totalPrice) {
        if (user.penguranganSaldo(totalPrice)) {
            System.out.println("Pembayaran berhasil menggunakan saldo!");
            System.out.println("Sisa saldo Anda: Rp " + user.getSaldo());
            showMenu();
        } else {
            System.out.println("Saldo Anda tidak cukup. Silakan lakukan top-up.");
            showMenu();
        }
    }

    private static void topUpSaldo() {
        System.out.print("Masukkan jumlah top-up: Rp ");
        double amount = scanner.nextDouble();
        user.topUp(amount);
        showMenu();
    }

    private static void checkSaldo() {
        System.out.println("Saldo Anda saat ini: Rp " + user.getSaldo());
        showMenu();
    }
}
