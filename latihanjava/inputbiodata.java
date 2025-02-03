import java.util.Scanner;


class biodata{
    String nama,jeniskelamin;
    int umur;

    void display(){
        System.out.println("nama : " + nama);
        System.out.println("jenis kelamin : " + jeniskelamin);
        System.out.println("umur : " + umur);
    }

}
public class inputbiodata{
    public static void main(String[] args) {
        biodata bio = new biodata();
        Scanner scanner = new Scanner(System.in);

       // System.out.print("Masukkan nama : ");
       // String nama = scanner.nextLine();
       // bio.nama = nama;


       // System.out.print("masukan jenis kelamin : " );
        // String jeniskelamin = scanner.nextLine();
       // bio.jeniskelamin = jeniskelamin;

        // System.out.print("umur : " );
        // int umur = scanner.nextInt();
        // bio.umur = umur;

        System.out.print("masukan nama : " );
        bio.nama = scanner.nextLine();

        System.out.print("masukan jenis kelamin : " );
        bio.jeniskelamin = scanner.nextLine();

        System.out.print("umur : " );
        bio.umur = scanner.nextInt();





        bio.display();
        scanner.close();

    }
}