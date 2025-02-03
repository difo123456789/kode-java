import java.util.Scanner;
public class latihanlooping{
    public static void main(String[] args){
        // program untuk menjumlahkan angka dengan rentang
        int nilaiawal , nilaiakhir ,total;
        
        Scanner inputuser = new Scanner(System.in);
        System.out.println("maukan nilai awal:");
        nilaiawal = inputuser.nextInt();
        System.out.println("masukan nilai akhir:");
        nilaiakhir = inputuser.nextInt();

        total = 0;
        while (nilaiawal <= nilaiakhir){
            total = total + nilaiawal;
            System.out.println("ditambah" + nilaiawal + "menjadi" + total);
            nilaiawal++;
        }
    }
}