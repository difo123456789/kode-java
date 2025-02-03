import  java.util.*;
public class latihankalkulatorswithcase{
    public static void main(String[] args) {
        
        Scanner inputuser;
        float a,b,hasil;
        String operator;

        inputuser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputuser.nextFloat();
        System.out.print("operator = ");
        operator = inputuser.next();
        System.out.print("nilai b = ");
        b = inputuser.nextFloat();

        switch(operator) {
            case "+":
            // penjumlahan
            hasil = a + b ;
            System.out.println("hasil = "+ hasil);
            break;
             case "-":
            // pengurangan
              hasil = a - b ;
            System.out.println("hasil = "+ hasil);
              break;
             case "*":
            // perkalian
              hasil = a * b ;
            System.out.println("hasil = "+ hasil);
              break;
             case "/":
            // pembagian
              hasil = a / b ;
            System.out.println("hasil = "+ hasil);
            break;
            default:
                System.out.println("operasi " + operator + "tidak ditemukan");
    }
}

}