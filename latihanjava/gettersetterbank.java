class Bank {
    private String nameaccount;
    private double saldo;
    private final double withdraw;

    // Constructor untuk nameaccount dan saldo saja
    Bank(String nameaccount, double saldo) {
        this.nameaccount = nameaccount;
        this.saldo = saldo; // kenapa pakai this bisa pakai berbagai methodnya
        this.withdraw = 0;
    }

    // Metode untuk cek saldo
     void checkSaldo() {
        System.out.println("Nama Akun: " + nameaccount);
        System.out.println("Saldo saat ini: Rp " + saldo);
    }


    // Metode untuk melakukan penarikan
    void withdraw(double withdraw) {
        if ( withdraw<= saldo) {
            saldo -= withdraw;
            System.out.println("Penarikan berhasil. Saldo saat ini: Rp " + saldo);
        } else {
            System.out.println("gagal Saldo tidak mencukupi.");
        }
    }

     void deposit(double amount) {
        saldo += amount;
        System.out.println("Setoran berhasil. Saldo saat ini: Rp " + saldo);
    }

}

public class gettersetterbank {
    public static void main(String[] args) {
        Bank bank = new Bank("titi", 1000000);
        bank.checkSaldo();
        bank.withdraw(500000);
        bank.withdraw(300000);
        bank.deposit(100000);
        bank.withdraw(300000);
        
      
    }
    }
