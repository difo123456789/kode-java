public class whileloop{
    public static void main(String[] args) {
        
//      while(kondisi){
//          aksi
//        }
        int a = 0;
        boolean kondisi = true;
        System.out.println("awal program");
        while(kondisi){
            System.out.println("wihel loop" + a);
            a++;
            if (a == 20){
                kondisi = false;
            }
        }
        System.out.println("program akhir");
        
    }
}
