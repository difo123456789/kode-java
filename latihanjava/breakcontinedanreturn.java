

public class breakcontinedanreturn{
    public static void main(String[] args) {
        // break,contine,dan return
        
        int  a = 0;
        while (true) {
            a++;
            if(a == 10){
               break;
               // ini adalah keyword untuk memaksa keluar dari loop
            }else if (a == 5){
                continue; 
                // ini adalah keyword untuk memaksa memulai aksi dari awal
            }else if (a == 7){
                return;
            }
            
            System.out.println("lopping ke - "+ a); 

        }
        System.out.println("akhir dari looping " );
    }
}