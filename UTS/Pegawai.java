/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author Denuradhan
 */
public class Pegawai {
    public String nip, nama, alamat;

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
    
    public int getGaji() {
        return 2500000;
    }
    
    public void info() {
        System.out.println("========================================");
        System.out.println("Nama                : "+nama);
        System.out.println("Nip                 : "+nip);
        System.out.println("Gaji                : "+getGaji());
        
    }
    
}
