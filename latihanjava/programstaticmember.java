class myclass{
    public static int count = 0;

    public myclass(){
        count++;
    }
    public static int factorial(int n){
        if(n == 0 ){
            return 1 ;
        }else{
            return  n * factorial(n-1);
      }
    }
    static {
        System.out.println("kelas my class telah dimaut");
    }
    public static class nestedclass{
        public void display(){
            System.out.println("ini adalah inner classs static");
        }
    }
}

public class programstaticmember{
    public static void main(String[] args) {
        System.out.println("jumlah objeck myclass :" + myclass.count);

        myclass obj1 = new myclass();
        myclass obj2 = new myclass();
        System.out.println("jumlah objek myclass sekarang "+ myclass.count);

        int hasilfaktorial = myclass.factorial(5);
        System.out.println("faktorial 5:" + hasilfaktorial);

        myclass.nestedclass nested = new myclass.nestedclass();
        nested.display();
    }
}