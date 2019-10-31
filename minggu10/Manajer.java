/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10;

/**
 *
 * @author Denuradhan
 */
public class Manajer extends Pegawai{
    private int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    @Override
    public int getGaji() {
        return gaji;
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Status          : Manajer");
        System.out.println("Tunjangan       : "+getTunjangan());
    }
    
}
