
import java.util.Scanner;

public class latihanfungsimenghitungdanmengambar{
    public static void main(String[] args) {
        // int panjang, lebar;
        // panjang = 5;
        // lebar = 4;
        Scanner userInput = new Scanner(System.in);
   
        System.out.print("panjang = ");
        int inputpanjang = userInput.nextInt();
        System.out.print("lebar = ");
        int inputlebar = userInput.nextInt();
        gambar(inputpanjang,inputlebar);

        System.out.println("luas = " + luas(inputpanjang, inputlebar));
        System.out.println("keliling  = " + keliling(inputpanjang,inputlebar));
        }
       private static int luas(int panjang , int lebar){
        int hasil = panjang*lebar;
        return hasil;
    }
     private static int keliling(int panjang , int lebar){
        int hasil = panjang*lebar;
        return hasil;
        }
    public static void gambar(int panjang, int lebar){
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
                
            }
            System.out.println("\n");
        }
    }
}