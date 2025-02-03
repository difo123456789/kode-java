
import java.util.Scanner;

public  class fungsirekursif{
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("masukan nilai");
        int nilai = userInput.nextInt();
        System.out.println("anda memasukan nilai " + nilai);

        printnilai(nilai);
        int jumlah = jumlahnilai(nilai);
        System.out.println("jumlah = " + jumlah);

        int faktorial = hitungfaktorial(nilai);
        System.out.println("hasil faktorial= " + faktorial);
}

         // fungsi rekursif sederhana

         private static int hitungfaktorial(int parameter){
            System.out.println("parameter = " + parameter);
            if (parameter == 1){
                return parameter;
            }
            return parameter * hitungfaktorial(parameter-1);
         }
         


    

         private static int jumlahnilai(int parameter){
            System.out.println("parameter = " + parameter);
            if (parameter == 0){
                return parameter;
            }
            return parameter + jumlahnilai(parameter-1);
         }
         
         private static void printnilai(int parameter){
            System.out.println("nilai = "+ parameter);

            if (parameter == 0){
                return;
            }
            parameter--;
            printnilai(parameter);
         
    }
}