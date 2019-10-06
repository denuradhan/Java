package Minggu3;
public class Anggota {
    public String nama, nomorKtp;
    public int limitPinjaman, jumlahPinjaman;
    
    public Anggota(String nomorKtp, String nama, int limitPinjaman) {
        this.nama = nama;
        this.nomorKtp = nomorKtp;
        this.limitPinjaman = limitPinjaman;
    }    
    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limitPinjaman;
    }
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    public void pinjam(int pinjam){
        if (pinjam>limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }else{
            jumlahPinjaman+=pinjam;
        }
    }
    public void angsur(int angsur){
        if (angsur<(jumlahPinjaman*0.1)) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }else{
            jumlahPinjaman-=angsur;
        }
    }
}
