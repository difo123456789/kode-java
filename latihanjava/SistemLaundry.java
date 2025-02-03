import java.util.Scanner;

class LayananLaundry {
    private String namaPelanggan;
    private String nomorKontak;
    private double berat;

    public LayananLaundry(String namaPelanggan, String nomorKontak, double berat) {
        this.namaPelanggan = namaPelanggan;
        this.nomorKontak = nomorKontak;
        this.berat = berat;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getNomorKontak() {
        return nomorKontak;
    }

    public void setNomorKontak(String nomorKontak) {
        this.nomorKontak = nomorKontak;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double hitungHarga() {
        return berat * 5000;
    }

    public String getDetailLayanan() {
        return "Layanan Laundry Reguler.";
    }

    public int estimasiWaktu() {
        return 2; // Waktu default: 2 hari
    }
}

class LaundryEkspres extends LayananLaundry {

    public LaundryEkspres(String namaPelanggan, String nomorKontak, double berat) {
        super(namaPelanggan, nomorKontak, berat);
    }

    @Override
    public double hitungHarga() {
        return getBerat() * 8000;
    }

    @Override
    public String getDetailLayanan() {
        return "Layanan Laundry Ekspres (Pemrosesan lebih cepat).";
    }

    @Override
    public int estimasiWaktu() {
        return 1; // Waktu lebih cepat: 1 hari
    }
}

class DryCleaning extends LayananLaundry {

    public DryCleaning(String namaPelanggan, String nomorKontak, double berat) {
        super(namaPelanggan, nomorKontak, berat);
    }

    @Override
    public double hitungHarga() {
        return getBerat() * 10000;
    }

    @Override
    public String getDetailLayanan() {
        return "Layanan Dry Cleaning (Perawatan khusus untuk pakaian).";
    }

    @Override
    public int estimasiWaktu() {
        return 3; // Waktu lebih lama: 3 hari
    }
}

public class SistemLaundry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Selamat datang di Layanan Laundry ===");

        while (true) {
            System.out.println("\n1. Laundry Reguler");
            System.out.println("2. Laundry Ekspres");
            System.out.println("3. Dry Cleaning");
            System.out.println("4. Keluar");
            System.out.print("Pilih layanan (1-4): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 4) {
                System.out.println("Terima kasih telah menggunakan layanan laundry kami!");
                break;
            }

            if (pilihan < 1 || pilihan > 4) {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                continue;
            }

            scanner.nextLine(); // Mengonsumsi baris kosong

            System.out.print("Masukkan nama pelanggan: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan nomor kontak: ");
            String kontak = scanner.nextLine();
            System.out.print("Masukkan berat laundry (dalam kg): ");
            double berat = scanner.nextDouble();

            if (berat <= 0) {
                System.out.println("Berat harus lebih dari 0 kg. Silakan coba lagi.");
                continue;
            }

            LayananLaundry layanan;

            if (pilihan == 1) {
                layanan = new LayananLaundry(nama, kontak, berat);
            } else if (pilihan == 2) {
                layanan = new LaundryEkspres(nama, kontak, berat);
            } else {
                layanan = new DryCleaning(nama, kontak, berat);
            }

            double totalHarga = layanan.hitungHarga();
            if (berat > 10) {
                System.out.println("Anda mendapatkan diskon 10% untuk berat di atas 10 kg!");
                totalHarga *= 0.9;
            }

            System.out.print("Pilih metode pembayaran (1: Tunai, 2: E-Wallet): ");
            int metodePembayaran = scanner.nextInt();
            scanner.nextLine(); // Konsumsi baris kosong

            String pembayaran = (metodePembayaran == 1) ? "Tunai" : "E-Wallet";

            System.out.println("\n=== Struk ===");
            System.out.println("Nama Pelanggan: " + layanan.getNamaPelanggan());
            System.out.println("Nomor Kontak: " + layanan.getNomorKontak());
            System.out.println("Jenis Layanan: " + layanan.getDetailLayanan());
            System.out.println("Berat: " + layanan.getBerat() + " kg");
            System.out.println("Total Harga: Rp " + totalHarga);
            System.out.println("Estimasi Waktu: " + layanan.estimasiWaktu() + " hari");
            System.out.println("Metode Pembayaran: " + pembayaran);
            System.out.println("\n=== Terima Kasih ===");
        }

        scanner.close();
    }
}
