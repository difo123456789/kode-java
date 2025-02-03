class Hewan {
    String name;

    Hewan(String name) {
        this.name = name;
    }

    void makan() {
        System.out.println(name + " sedang makan");
    }
}

class Kucing extends Hewan {
    Kucing(String name) {
        super(name);
    }
    
    @Override
    void makan() {
        System.out.println(name + " sedang makan ikan");
    }
}

public class inheritancehewan { 
    public static void main(String[] args) {
        Kucing kucing = new Kucing("kucing");
        kucing.makan();
    }
}
