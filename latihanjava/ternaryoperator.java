
import java.util.Scanner;

public class ternaryoperator{
    public static void main(String[] args) {
        
        // ternar operator 
        // variable x = ekspresi ? statement_true : statement_false

        int input, x;
        Scanner inputuser = new Scanner(System.in);
        System.out.println("masukan nilai: ");
        input = inputuser.nextInt();
        System.out.println(input);

        // variable x = ekspresi ? statement_true : statement_false
         x = (input == 10 ) ? (input*input) : (input/2);

     //    jika memamakai if
     //    if ( input == 10 ) {
      //      x = input*input;
      //   }else {
      //      x = input/2;
      //   }
         System.out.println("hasilnya " + x );

    }
}