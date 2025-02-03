
import java.util.Arrays;

public  class araaypassbyrefence{
    public static void main(String[] args) {
        int[] arraysangka1 = {1,2,3,4,5};
        int[] arraysangka2 = new int[5];

        System.out.println(arraysangka1);
        System.out.println(arraysangka2);

        arraysangka2 = arraysangka1;
        System.out.println(arraysangka1);
        System.out.println(arraysangka2);


        arraysangka2 = arraysangka1;
        System.out.println("array 1 -> " + Arrays.toString(arraysangka1));
          System.out.println("array 2 -> "+ Arrays.toString(arraysangka2));

          arraysangka1[0] = 100;
          arraysangka2[4] = 400;
          System.out.println("array 1 -> " + Arrays.toString(arraysangka1));
          System.out.println("array 2 -> "+ Arrays.toString(arraysangka2));

          ubaharray(arraysangka1);
           System.out.println("array 1 -> " + Arrays.toString(arraysangka1));
          System.out.println("array 2 -> "+ Arrays.toString(arraysangka2));

    }
    // method yag argumenynya adalah reference,pass by refence
    // bukan pass by value
    private static void ubaharray(int[] dataArrays){
        dataArrays[0]=125;
    }
}