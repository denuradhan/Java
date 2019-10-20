package jobsheet10Tugas;
public class Mahasiswa {
    String nama, nim;
    public Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    void print(){
        System.out.println("Nama : "+nama);
        System.out.println("NIM  : "+nim);
    }    
}
