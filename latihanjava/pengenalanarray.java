import java.util.Arrays;

public class pengenalanarray{
    public static void main(String[] args) {
        
        // array adalah kumpulan data primitif
        // tipe [] nama ={ komponen - komponen}

        System.out.println("assiment array");
        //             index = 0 1 2 3
        //                     | | |
        int [] arrayinteger = {1,2,3,4};

        arrayinteger [0] = 11;
        
        System.out.println(arrayinteger[0]);
        System.out.println(arrayinteger[1]);
        System.out.println(arrayinteger[2]);
        System.out.println(arrayinteger[3]);


        // deklarasi
        // tipedata[] nama = new int (jumlah array);

        System.out.println("deklarasi array");
        float [] arrayfloat = new float[5];

        arrayfloat[2] = 11;

        System.out.println(arrayfloat [0]);
         System.out.println(arrayfloat [1]);
          System.out.println(arrayfloat [2]);
           System.out.println(arrayfloat [3]);
            System.out.println(arrayfloat [4]);


        System.out.println(Arrays.toString(arrayinteger));
        System.out.println(Arrays.toString(arrayfloat));
    }
}