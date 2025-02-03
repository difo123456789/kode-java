

public class ifbersarangnestedif{
public static void main(String[] args) {
    
    // nested if atau if bersarang

    int a = 5;
    int b = 7;
    System.out.println("ini adalah  awal dari progaram");
    if ( a == 5){
        if (b == 10){
       System.out.println("ini adalah aksi,diaman a = 5 dan b = 10");

    } else {
       System.out.println("ini adalah aksi dafault 1, diamana = 5 dan b bukan 10");
         }
}else{
    System.out.println("ini adalah diamana a  salah ");
}
System.out.println("ini adalah akhri dari program");
}
}