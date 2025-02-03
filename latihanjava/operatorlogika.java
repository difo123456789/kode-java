public  class operatorlogika{
    public static void main(String[] args) {
         // operator logika --> yang bisa kita lakukan kepada tipe data boleean
         // AND,OR,XDR,negasi

         boolean a,b,c;

         // OR / atau (||)

         System.err.println("=== 0r (||) =====");
         a = false;
         b = false;
         c = (a|b);
         System.err.println( a+ " || " + b + "=" + c);
          a = false;
         b = true;
         c = (a|b);
         System.err.println( a+ " || " + b + "=" + c);
          a = true;
         b = false;
         c = (a|b);
         System.err.println( a+ " || " + b + "=" + c);
          a = true;
         b = true;
         c = (a|b);
         System.err.println( a+ " || " + b + "=" + c);


           // AND / atau (&&)

         System.err.println("=== AND (&&) =====");
         a = false;
         b = false;
         c = (a&&b);
         System.err.println( a+ " && " + b + "=" + c);
          a = false;
         b = true;
         c = (a&&b);
         System.err.println( a+ " && " + b + "=" + c);
          a = true;
         b = false;
         c = (a&&b);
         System.err.println( a+ " && " + b + "=" + c);
          a = true;
         b = true;
         c = (a&&b);
         System.err.println( a+ " && " + b + "=" + c);


         // X0R / exlusive  or (^)

         System.err.println("=== XOR (^) =====");
         a = false;
         b = false;
         c = (a^b);
         System.err.println( a+ " ^ " + b + "=" + c);
          a = false;
         b = true;
         c = (a^b);
         System.err.println( a+ " ^ " + b + "=" + c);
          a = true;
         b = false;
         c = (a^b);
         System.err.println( a+ " ^ " + b + "=" + c);
          a = true;
         b = true;
         c = (a^b);
         System.err.println( a+ " ^ " + b + "=" + c);

         // NOT /negasi --> flipping(!)
         a = true;
         c =!a;
          System.err.println( a+ " --> (!)  =" + c);

         a = false;
         c =!a;
          System.err.println( a+ " --> (!)  =" + c);





    }

}