class coba{
    String namakamu;
    double saldo;
    double withdraw;

coba(String namakamu,double saldo){
    this.namakamu = namakamu;
    this.saldo = saldo;
    }
    void cobauji(){
        System.out.println("nama akun ada : " + namakamu);
        System.out.println("saldo saat ini " + saldo);
    }

    void withdraw (double withdraw){
        if (withdraw <= saldo) {
          saldo -= withdraw;
          System.out.println("PENARIKAN BERHASIL :" + saldo);
        }else{
            System.out.println("GAGAL PENARIKAN :");
        }
    }
}
public class ujicoba{
    public static void main(String[] args) {
        
    }
}