class namahewan{
    String nama;
    String jenis;
    String warna;

void displayInfo(){
    System.out.println("nama hewan :" + nama);
    System.out.println("jenis hewan :" + jenis);
    System.out.println("warna hewan :" + warna);
}
}
public class hewan{
    public static void main(String[] args) {
        
        namahewan to = new namahewan();
        to.nama ="sapi";
        to.jenis="mamalia";
        to.warna="hitam";

    to.displayInfo();
    System.err.println("====================");

    namahewan to2 = new namahewan();
    to2.nama ="kambing";
    to2.jenis ="kambing";
    to2.warna ="putih";

    to2.displayInfo();
    }
}