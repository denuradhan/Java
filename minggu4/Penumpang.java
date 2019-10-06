package minggu4;
public class Penumpang {
    private String ktp, nama;
    public Penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }
    public String getKtp() {
        return ktp;
    }
    public void setKtp(String ktp) {
        this.ktp = ktp;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String Info() {
        String info = "";
        info+="Ktp : "+ktp+"\n";
        info+="Nama: "+nama+"";
        return info;
    }
}
