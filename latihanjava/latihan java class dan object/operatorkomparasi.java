public class operatorkomparasi {
    public static void main(String[] args) {
        
        // operasi komparasi .. ini akan menghasilkan nilai dalam bentuk boolean

        int a,b;
        boolean hasilkomparasi;
        // operator equal atau persamaan
        System.out.println("==== persamaan");
        a = 10;
        b = 10;

        hasilkomparasi = (a == b);
        System.out.printf("%d == %d ---> %s \n",a,b, hasilkomparasi);
        
        a = 10;
        b = 10;

        hasilkomparasi = (a == b);
        System.out.printf("%d == %d ---> %s \n",a,b, hasilkomparasi);
        

 // operator equal atau pertidaksamaan
        System.out.println("==== pertidaksamaan");
        a = 10;
        b = 10;

        hasilkomparasi = (a != b);
        System.out.printf("%d != %d ---> %s \n",a,b, hasilkomparasi);
        
        a = 12;
        b = 10;

        hasilkomparasi = (a != b);
        System.out.printf("%d != %d ---> %s \n",a,b, hasilkomparasi);
        
        // operator less than atau kurang dari
        System.out.println("==== kurang dari");
        a = 9;
        b = 10;

        hasilkomparasi = (a < b);
        System.out.printf("%d < %d ---> %s \n",a,b, hasilkomparasi);
        
        a = 12;
        b = 10;

        hasilkomparasi = (a < b);
        System.out.printf("%d < %d ---> %s \n",a,b, hasilkomparasi);
        

         // operator greater than atau lebih dari
        System.out.println("==== lebih dari");
        a = 9;
        b = 10;

        hasilkomparasi = (a > b);
        System.out.printf("%d > %d ---> %s \n",a,b, hasilkomparasi);
        
        a = 12;
        b = 10;

        hasilkomparasi = (a > b);
        System.out.printf("%d > %d ---> %s \n",a,b, hasilkomparasi);
        
         // operator less than equal atau kurang dari sama dengan
        System.out.println("==== kurang dari sama dengan");
        a = 9;
        b = 10;

        hasilkomparasi = (a <= b);
        System.out.printf("%d <= %d ---> %s \n",a,b, hasilkomparasi);

         a = 10;
        b = 10;

        hasilkomparasi = (a <= b);
        System.out.printf("%d <= %d ---> %s \n",a,b, hasilkomparasi);
        
        a = 12;
        b = 10;

        hasilkomparasi = (a <= b);
        System.out.printf("%d <= %d ---> %s \n",a,b, hasilkomparasi);

         // operator greater than equal atau lebih dari sama dengan
        System.out.println("==== lebih dari sama dengan");
        a = 9;
        b = 10;

        hasilkomparasi = (a >= b);
        System.out.printf("%d >= %d ---> %s \n",a,b, hasilkomparasi);

        a = 10;
        b = 10;

        hasilkomparasi = (a >= b);
        System.out.printf("%d >= %d ---> %s \n",a,b, hasilkomparasi);
        
        
        a = 12;
        b = 10;

        hasilkomparasi = (a >= b);
        System.out.printf("%d >= %d ---> %s \n",a,b, hasilkomparasi);
    }
}