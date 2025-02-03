public class fungsiataumethodvoid{
    public static void main(String[] args) {
        // void itu artinya hampa

        System.out.println(simpel());

        fungsivoid( "apa pun");
        selamatpagi("emak");
        selamatpagi("abah");
        pagihari(" senin hari");
    }
    private static void selamatpagi(String nama){
      System.out.println("selamat pagi" + nama);  
    }
    private static void pagihari(String pagi){
        System.out.println("pagi hari" + pagi);
    }
    // fungsi atau methoad tanpa kembalian
    private static  void fungsivoid(String input){
        System.out.println(input);
    }
    // fungsi atau methoad dengan kembalian
    // sehingga menggunkan return untuk
    // mengembalikan nilainya (10.0f)
    private static float simpel(){
        return 10.0f;
    }
}