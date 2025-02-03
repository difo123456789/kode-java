
import java.util.Arrays;


public class operasiarray{
    public static void main(String[] args) {
          int[] arrayangka1 = {1,2,3,4,5};
        // mengubah array menjadi string
        System.out.println("\nmerubah array menjadi string\n =========");
        println(arrayangka1);

        // mengkopi array
        System.out.println("\nmengopi array\n =========");
        int [] arrayangka2= new int[5];
        println(arrayangka1);
        println(arrayangka2);
        System.out.println("\nmengkopi dengan loop");
        for (int i=0; i < arrayangka1.length;i++){
            arrayangka2[i] = arrayangka1[i];

        }
        println(arrayangka1);
        System.out.println(arrayangka1);
        println(arrayangka2);
        System.out.println(arrayangka2);

        System.out.println("\nmengkopi dengancopy0f");
        int [] arrayangka3 = Arrays.copyOf(arrayangka1, 2);
        println(arrayangka1);
        System.out.println(arrayangka1);
        println(arrayangka3);
        System.out.println(arrayangka3);

        System.out.println("\nmengkopi dengan copy0fRange");
        int[] arrayangka4 = Arrays.copyOfRange(arrayangka1,3,5);
        println(arrayangka1);
        System.out.println(arrayangka1);
        println(arrayangka4);
        System.out.println(arrayangka4);

        // fill array
        System.out.println("\nfill arra\n==================");
        int[] arrayangka5 = new int [10];
        println(arrayangka5);
        Arrays.fill(arrayangka5, 5);
        println(arrayangka5);

        // komparasi array
        System.out.println("\nkomparasi array\n==================");
        int[] arrayangka6 = {1,2,3,4,9};
        int[] arrayangka7 = {1,2,3,4,5};

        System.out.println("\nmebandingkan antara dua buah arrau");

        System.out.println(Arrays.equals(arrayangka6,arrayangka7));

        if(arrayangka6 == arrayangka7){
            System.out.println("array ini sama");
        }else {
            System.out.println("array ini beda");
        }
        System.out.println("\nmengecek mana array yang lebih besar");
        System.out.println(Arrays.compare(arrayangka6, arrayangka7));

        System.out.println("\nmengecek mana index yang bertanda");
        System.out.println(Arrays.mismatch(arrayangka6, arrayangka7));
        
        //sort array
         System.out.println("\nsearch array\n================");
        int[] arrayangka8 = {1,6,4,5,3,5,2,6};
        println(arrayangka8);
        Arrays.sort(arrayangka8);
         println(arrayangka8);


        // search array
        System.out.println("\nsearch array\n================");
      
        println(arrayangka8);
        int angka = 3;
       int posisi = Arrays.binarySearch(arrayangka8, angka);
        System.out.println("angka = "+angka + " ada di index " + posisi);

        //tugas -> sort kebalik ,
        //operasi antara dua buah array
        // mengabungkan dua buah array,


    }
    private  static void println(int[] dataArray){
        System.out.println("array = " + Arrays.toString(dataArray));
    }
}