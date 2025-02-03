import java.util.*;
public class latihankalkulatorifelse{
    public static void main(String[] args) {
        // a aperator b

        Scanner inputuser;
        float a,b,hasil;
        char operator;
        
        inputuser = new Scanner(System.in);
        System.out.print("nilai a = ");
        a = inputuser.nextFloat();
        System.out.print("operator = ");
        operator = inputuser.next().charAt(0);
        System.out.print("nilai b = ");
        b = inputuser.nextFloat();
        System.out.println("input user : " + a  + " " +  operator  + " " + b);

        // operator tersedia */+-
       
        // Proses operasi berdasarkan operator
        if (operator == '+'){
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-') {
            hasil = a - b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/') {
            if (b == 0){
                System.out.println("pembagian nol menghasilkan tak hingga");
            }else{
                hasil = a / b;
                System.out.println("hasil = " + hasil);
            }
        } else {
            // Operator tidak valid
            System.out.println("Operator tidak ditemukan.");
        }
    }
}