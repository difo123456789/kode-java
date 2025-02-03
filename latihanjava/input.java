import java.util.Scanner;
public class input {
    public static void main(String[] args) {
         
         double angka;
         System.out.print("masukan angaka :");
         Scanner input = new Scanner(System.in);

         angka = input.nextInt();
         System.out.println("angka = " + angka);

         input.nextLine();
         String nama ;
         System.out.print("nama :");
         
         nama = input.nextLine();
         System.out.println("nama = " + nama);

    }
}