
import java.util.Scanner;

public class rekursifbercabang{
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("masukan nilai n = ");
        int nilai = userInput.nextInt();
       int nilai_fibonaci = fibonaci(nilai,"atas");
       System.out.println("nilai fibonaci  ke-" +nilai + " adalah "+nilai_fibonaci);
    }
    private static int fibonaci(int n,String daun){
     System.out.println("daun " + daun);
    System.out.println("fibonaci ke -" + n);
    if (n == 1|| n == 0 ){
        return  n;
    }
        return fibonaci(n-1,"kiri") + fibonaci(n-2,"kanan");
    }
}