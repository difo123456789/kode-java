import java.util.Scanner;


public class latihaninput{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama,alamat;
        int umur;

        System.out.print("nama \t: ");
        nama = input.nextLine();
        System.out.print("alamat \t: ");
        alamat = input.nextLine();        
        System.out.print("umur \t: ");
        umur = input.nextInt();
        System.out.println("==================");
        System.out.println(nama +" lahir di "+alamat);
        System.out.println("berumur "+umur+" tahun");
    }
}