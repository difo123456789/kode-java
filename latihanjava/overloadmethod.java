public class overloadmethod{
    public static void main(String[] args) {

        int hasilinteger;
        hasilinteger = tambah (4,5);
        printangka(hasilinteger);

        float hasilfloat;

        hasilfloat = tambah(4.5f,4);
        printangka(hasilfloat);

        hasilfloat = tambah (4,4.5f);

        hasilinteger = tambah(11,12,13);
        printangka(hasilinteger);




        printangka(10);
        printangka(10.5f);
        printangka(16.7d);
        printangka(16);
        
    }
    private static int tambah(int angkaInt1, int angkaInt2 ,int angkaInt3){
       return angkaInt1 + angkaInt2 + angkaInt3;
    }
     private static float  tambah(int  angkaInt2, float  angkafloat1){
       return angkafloat1 + angkaInt2;
    }
    private static float  tambah(float  angkafloat1, int angkaInt2){
       return angkafloat1 + angkaInt2;
    }
    private static int tambah(int angkaInt1, int angkaInt2){
       return angkaInt1 + angkaInt2;
    }
    
     private static void  printangka(double  angkadouble){
        System.out.println("anagka ini adalah dengan nilai = " + angkadouble);
    }
    

    private static void  printangka(float angkafloat){
        System.out.println("anagka ini adalah dengan nilai = " + angkafloat);
    }
    

    private static void printangka(int angkainteger){
        System.out.println("anagka ini adalah dengan nilai = " + angkainteger);
    }
}