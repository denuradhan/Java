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
public class Dosen extends Pegawai{
    public int jumlahSks, tarifSks;
    public Dosen(String nip, String nama, String alamat, int jumlahSks) {
        super(nip, nama, alamat);
        this.jumlahSks = jumlahSks;
        tarifSks = 65000;
    }

    public void setSks(int jumlahSks) {
        this.jumlahSks = jumlahSks;
    }
    @Override
    public int getGaji() {
        return super.getGaji()+jumlahSks*tarifSks;
    }
    @Override
    public void info() {
        super.info();
        System.out.println("Pegawai             : Dosen");
        System.out.println("Jumlah Kehadiran    : "+jumlahSks);
        System.out.println("Gaji                : "+getGaji());
    }
    
}
