class Mahasiswa {
    String nama;
    Integer nim;
    String jurusan;
    float ipk;

    void display() {
        System.out.println("Nama: " + nama + ", NIM: " + nim +", jurusan :" + jurusan + ", ipk :" + ipk );
    }

   String cekStatusKelulusan() {
        if (ipk >= 2.75) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
}


public class main {
    public static void main(String[] args) {
       
        Mahasiswa mahasiswa1 = new Mahasiswa();

        
        mahasiswa1.nama = "Difo armi frasetya";
        mahasiswa1.nim =  230902009; // nim diisi dengan nilai integer, bukan string
        mahasiswa1.jurusan = "teknologi informasi";
        mahasiswa1.ipk = 3.5f;

        
        mahasiswa1.display();
        
         String statusKelulusan = mahasiswa1.cekStatusKelulusan();
        System.out.println("Status Kelulusan: " + statusKelulusan);
    }
}
