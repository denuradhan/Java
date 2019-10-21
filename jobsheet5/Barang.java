package jobsheet5;
public class Barang {
    String nama;
    int jumlah, hargaSatuan;
    Barang(String n, int j, int hs){
        nama = n;
        jumlah = j;
        hargaSatuan=hs;
    }
    void tampil(){
        System.out.println("Nama Barang  : "+nama);
        System.out.println("Jumlah       : "+jumlah);
        System.out.println("Harga Satuan : "+hargaSatuan);
        System.out.println("Harga Total  : "+hitungHargaTotal());
    }
    int hitungHargaTotal(){
        return jumlah*hargaSatuan;
    }
}
