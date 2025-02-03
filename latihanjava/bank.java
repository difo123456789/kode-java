import java.util.Scanner;

class Bank {
    String nameaccount;
    double saldo;
    double withdraw;

    // Constructor for nameaccount and saldo only
    Bank(String nameaccount, double saldo) {
        this.nameaccount = nameaccount;
        this.saldo = saldo;
    }

    // Method to check balance
    void checkSaldo() {
        System.out.println("Nama Akun: " + nameaccount);
        System.out.println("Saldo saat ini: Rp " + saldo);
    }

    // Method for withdrawing money
    void withdraw(double withdrawAmount) {
        if (withdrawAmount <= saldo) {
            saldo  -= withdrawAmount;
            System.out.println("Penarikan berhasil. Saldo saat ini: Rp " + saldo);
        } else {
            System.out.println("Gagal. Saldo tidak mencukupi.");
        }
    }

    // Method for depositing money
    void deposit(double depositAmount) {
        saldo += depositAmount;
        System.out.println("Setoran berhasil. Saldo saat ini: Rp " + saldo);
    }
}

public class bank {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        // Initialize the bank account with name and initial balance
        System.out.print("Masukkan nama akun: ");
        String name = scanner.nextLine();
        
        System.out.print("Masukkan saldo awal: ");
        double saldoAwal = scanner.nextDouble();
        
        Bank bank = new Bank(name, saldoAwal);
        
        bank.checkSaldo();
        
        System.out.print("Masukkan jumlah penarikan: ");
        double withdrawAmount = scanner.nextDouble();
        bank.withdraw(withdrawAmount);
        
        System.out.print("Masukkan jumlah setoran: ");
        double depositAmount = scanner.nextDouble();
        bank.deposit(depositAmount);
        
        System.out.print("Masukkan jumlah penarikan  ");
        withdrawAmount = scanner.nextDouble();
        bank.withdraw(withdrawAmount);

        System.out.print("Masukkan jumlah setoran: ");
         depositAmount = scanner.nextDouble();
        bank.deposit(depositAmount);

        System.out.print("Terima kasih sudah menarik dan setor di bank difo");
        scanner.close();
    }
}
