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
public class Staf extends Pegawai{
    public int jumlahKehadiran, tarifHarian;
    public Staf(String nip, String nama, String alamat, int jumlahKehadiran) {
        super(nip, nama, alamat);
        this.jumlahKehadiran = jumlahKehadiran;
        tarifHarian = 50000;
    }

    public void setKehadiran(int jumlahKehadiran) {
        this.jumlahKehadiran = jumlahKehadiran;
    }
    @Override
    public int getGaji() {
        return super.getGaji()+tarifHarian*jumlahKehadiran;
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Pegawai             : Staff");
        System.out.println("Jumlah Kehadiran    : "+jumlahKehadiran);
        System.out.println("Gaji                : "+getGaji());
    }
    
}
