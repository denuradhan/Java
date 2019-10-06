package TUGASJS4;
public class Matkul {
    private String nama;
    private Kelas kelas;
    public Matkul(String nama) {
        this.nama = nama;
    }
    public void setKelas(String name) {
        kelas = new Kelas(name);
    }
    public void Info() {
        System.out.println("========MatKul=======");
        System.out.println("Nama MatKul : "+nama);
        kelas.Info();
    }
}
