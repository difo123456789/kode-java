class Onepiece{
    String nama;
    String jabatan;
    String keahlin;

// method /fungsi
void displayInfo(){
    System.out.println("nama :" + nama);
     System.out.println("jabatan :" + jabatan);
      System.out.println("keahlian:" + keahlin);
}
}

public class helloword{
    public static void main(String[] args) {
       // System.out.println("hello morld");

       Onepiece obj = new Onepiece();
       obj.nama ="luffy";
       obj.jabatan ="wakil kapten";
       obj.keahlin ="manusia karet";

       obj.displayInfo();

       Onepiece obj2 = new Onepiece( );
       obj2.nama ="zorro";
       obj.jabatan ="wakil kapten";
       obj.keahlin = "pedang";

       obj2.displayInfo();
    }
}