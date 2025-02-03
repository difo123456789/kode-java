abstract class hewan{
    protected String nama;
    protected  int umur;

    public hewan(String nama, int umur ){
        this.nama = nama;
        this.umur = umur;
    }
    
    public abstract void bersuara();

    public abstract void bergerak();

    public void informasi(){
        System.out.println("nama: " + nama);
        System.out.println("umur: " + umur);
    }
}
class Kucing extends hewan{
    public Kucing(String nama, int umur){
        super(nama,umur);
    }
    @Override
    public  void bersuara(){
        System.out.println("meong");
    }
     @Override
    public  void bergerak(){
        System.out.println("berlari");
    }
}
class Burung extends hewan{
    public Burung(String nama, int umur){
        super(nama,umur);
    }
    @Override
    public void bersuara(){
        System.out.println("kicau");
    }
     @Override
    public void bergerak(){
        System.out.println("kicau");
    }
}
public class abstrachewan{
    public static void main(String[] args) {
        Kucing kucing = new Kucing("mimi",1);
        Burung burung = new Burung("cici",2);

        kucing.informasi();
        kucing.bersuara();
        kucing.bergerak();

        System.out.println();
        
        burung.informasi();
        burung.bersuara();
        burung.bergerak();
        
        



    }
}