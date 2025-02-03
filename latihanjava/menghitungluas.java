// emghitung luas dan keliling persegi
import java.util.Scanner;
public class menghitungluas{
    public static void main(String[] args) {

        /*
        L = s x s
        k = 4 x s

        */
       Scanner input = new Scanner(System.in);
       int s,l,k;
       System.out.print("masukan s = ");
       s = input.nextInt();
       l = s*s;
       k = 4 * s;

       // narasi luas persegi
       System.out.println("l = s x s");
       System.out.println("l = "+s+" x "+s);
       System.out.println("l = " + l + " cm \n");

       // narasi kelling persegi 
       System.out.println("k = 4 X s");
       System.out.println("k = 4" + " x " + s );
       System.out.println(("k = " + k + "\n"));
    }
}