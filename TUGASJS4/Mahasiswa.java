package TUGASJS4;
public class Mahasiswa {
    private String nama;
    private int absen;

    public Mahasiswa(String nama, int absen) {
        this.nama = nama;
        this.absen = absen;
    }
    public void Info() {
        System.out.println("Nama        : "+nama);
        System.out.println("Absen       : "+absen);
        System.out.println("=====================");
    }
    
}
