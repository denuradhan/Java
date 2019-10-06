package TUGASJS4;
public class objek1 {
    private int nomor;
    private String nama;

    public objek1() {
        this.nomor=1;
        this.nama="Denny2";
    }

    public objek1(int nomor, String nama) {
        this.nomor = nomor;
        this.nama = nama;
    }
    
    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void info() {
        System.out.println("nomor   : "+nomor);
        System.out.println("nama    : "+nama);
    }
    
}
