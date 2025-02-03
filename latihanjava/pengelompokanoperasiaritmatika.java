import  java.util.Scanner;

public class  pengelompokanoperasiaritmatika{
    public static void main(String[] args) {
        
        // kesimpulan adalah 
        // perkalian atu pembagian dilakukan terlebih 
        // dahulu
        int hasil =  5 * 10 /2 ;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        // menggunakan pengelompokan operasi dengan()
        hasil = 60 / (2+10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        // perhitungan persaman kuadrat
        System.out.print("menghitung persamaan kudrat");

        int m,x,c;

        System.out.print("nilai x = ");
        x = userInput.nextInt();
        System.out.print("gradient m = ");
        m = userInput.nextInt();
        System.out.print("bisa c =  ");
        c = userInput.nextInt();
        int y = (m* x * x) + c;
        System.out.println("nili y = "+ y);
    }
}