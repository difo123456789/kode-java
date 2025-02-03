
import java.util.Scanner;

public  class operatoraritmatika{
    public static void main(String[] args) {
        
       // int a = 3;
        // int b = 2;
       // int c = a+b;

       // System.err.println(c);

      // double a = 5.9;
       // double b = 4;

       // System.out.println(a - b);

       // float a = (float) 5.9;
       // float b = (float)4;
       // System.out.println(a-b);
       
       Scanner input = new Scanner(System.in);
       int a, b, c;
       System.out.print("masukan a = ");
       a = input.nextInt();
       System.out.print("masukan b = ");
       b = input.nextInt();
       c = a + b;
       System.out.print(a + " + " + b  +" = ");
       System.err.println(c);
       c = b - a;
       System.out.println(a + "-" + b  +" = " + c);
       c = a * b;
       System.out.println(a +" x " + b +" = " + c);
       c = b/a;
       System.out.println(b +" : " + a + " = " + c);
       c = b % a;
       System.out.println(b + " % " + a +" = "+ c);

    }
}