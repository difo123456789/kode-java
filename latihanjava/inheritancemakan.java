class makan{
    String nama;

    makan(String nama){
        this.nama = nama ;
    }

void kue(){
    System.out.println(nama +"enak rasanya");
}
}
class bikeambon extends makan{
       bikeambon(String nama) {
        super(nama);
    }
    @Override
   void kue(){
    System.out.println(nama +" enak rasanya");
}
    
}
public class inheritancemakan{
    public static void main(String[] args) {
        bikeambon bikeambon = new bikeambon("bike ambon");
          bikeambon bikeambon2= new bikeambon("bolu kukus");
        bikeambon.kue();
         bikeambon2.kue();

        
    }
}