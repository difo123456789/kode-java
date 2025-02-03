class  mahasiswa{
    private String namamahasiswa ;
    private String nim;
    private int nilai;

 mahasiswa(String namaMahasiswa, String nim, int nilai) {
        this.namamahasiswa = namaMahasiswa;
        this.nim = nim;
        this.nilai = nilai;
    }


public void setnamamahasiwa(String namamahasiswa){
        this.namamahasiswa = namamahasiswa;
    }

public String getnamamahasiswa(){
    return this.namamahasiswa;
}
public void setnim(String nim){
        this.nim = nim;
}
public String getnim(){
    return this.nim;
}
public void setnilai(int  nilai){
        this.nilai = nilai;
    }
public int  getnilai(){
    return this.nilai;
}
public void tampilkanData() {
        System.out.println("Nama: " + namamahasiswa);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai: " + nilai);
}
}


public class  datamahasiswa{
    public static void main(String[] args) {

         mahasiswa mhs = new mahasiswa("John Doe", "123456", 70);
         System.out.println("Data Mahasiswa:");
        mhs.tampilkanData();

        System.out.println("\nMemperbarui nilai mahasiswa...");
        mhs.setnilai(90);
       
        System.out.println("Data Mahasiswa setelah diperbarui:");
        mhs.tampilkanData();
    }
}