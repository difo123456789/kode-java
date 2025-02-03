
import java.util.*;

public  class switchcase{
    public static void main(String[] args) {

        

        String input;

        Scanner inputuser = new Scanner(System.in);
       
        System.out.print("panggil nama :");
        input = inputuser.next();
// ekspresianya berupa satuan (int,log,byte ,short)string atau enum
        switch(input){
            case "otong":
                System.out.println("saya otong dan hadir boss!!! ");
                break;                default:
                    System.err.println(input + " tidak hadir bos");
        }
        System.out.println("selesai program");
    }
}