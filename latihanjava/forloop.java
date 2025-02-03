public class forloop{

    public static void main(String[] args) {
//       for (inisialisasi; kondisi; step nilai){
//            aksi

         System.out.println("ini adalah awal program");
         System.out.println("loop pertama");
         for(int nilai = 5; nilai <= 10 ; nilai++){
            System.out.println("for logo ke " + nilai);
         }
         System.out.println("loop kedua");
         for(int nilai = 2; nilai < 10 ; nilai++){
            System.out.println("for logo ke " + nilai);
         }
         System.out.println("loop ketiga");
         for(int nilai = 10; nilai >= 5 ; nilai--){
            System.out.println("for logo ke " + nilai);
         }
         System.out.println("loop keempat");
        int nilai = 0;
         for(; nilai < 10; ){
            System.out.println("for logo ke " + nilai);
            nilai++;
         }


System.out.println("ini adalah akhir program ");
        }
    }

