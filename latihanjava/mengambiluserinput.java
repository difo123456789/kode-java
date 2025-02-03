import java.util.Scanner;

public  class mengambiluserinput{
    public static void main(String[] args) {
        

        Scanner userInput = new Scanner(System.in);
        int panjang,lebar,luas,tinggi,volume;
        // membuat perhitungan  menhitung luas persegi panjang
        // luas = panjang * lebar

        System.out.println("menhiitung luas");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("luas = " + luas);
        System.out.println("menghitung volume");
        System.out.print("tinggi =");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.println("volume = " + volume);
    }
}