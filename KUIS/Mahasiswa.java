package KUIS;
public class Mahasiswa {
    String nama;
    int nim, nilai;
    public Mahasiswa(String nama, int nim, int nilai){
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }
    void print(){
        System.out.println("|Nama  : "+nama+"\t\t|");
        System.out.println("|NIM   : "+nim+"\t\t|");
        System.out.println("|Nilai : "+nilai+"\t\t|");
        System.out.println("+=======================+");
    }
}
