
import java.util.Arrays;
public class latihanarrays{
    public static void main(String[] args) {
        int[] arrayAngka ={2,3,4,5,1,4,6,7,8,6,8,9};
        printArray(arrayAngka,"array angka");

        //penjumlahan antara dua buah array
        int[] arrayangka1 ={2,3,4,5,6,7,8,4,6,7,8};
        int[] arrayangka2 ={2,3,4,0,9,7,6,5,9,3,4};

        int[] arrayHasil = tambahArray(arrayangka1, arrayangka2);
        printArray(arrayangka1,"array 1 " );
        printArray(arrayangka1,"array 2 " );
         printArray(arrayHasil,"hasil 1 " );

         // mengabungkan dua buah array
         int[] arrayHasil2 = new int [arrayangka1.length + arrayangka2.length];
         for (int i = 0; i < arrayangka1.length; i++) {
            arrayHasil2[i] = arrayangka1[i];
             
         }
         for (int i = 0; i < arrayangka2.length; i++ ){
            arrayHasil2[i + arrayangka1.length] = arrayangka2[i];
         }
       printArray(arrayangka1,"array 1 " );
        printArray(arrayangka1,"array 2 " );
         printArray(arrayHasil2,"hasil 2 ");
  
    }
    private static int [] tambahArray(int[] arrayInt1, int[] arrayInt2){
        int [] arrayHasil = new int [arrayInt1.length];
        for (int i = 0; i< arrayInt1.length; i++){
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
           
        }
        return arrayHasil;
    }
    private static void printArray(int[] dataArray,String message){
        System.out.println(message + "=" + Arrays.toString(dataArray));

    }
    }
