/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPolymorphism.no1;

/**
 *
 * @author kinanpermata
 */
public class Manajer extends Pegawai{
    private int tunjangan;
    Pegawai gaji;

    Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }
    
    public int getTunjangan() {
        return this.tunjangan;
    }
    
    public int gajiTotalManajer(){
        return super.getGaji()+tunjangan;
    }
    
    @Override
    public void tampil(){
        super.tampil();
        System.out.println("Tunjangan: " +tunjangan);
        System.out.println("Gaji Total: " +gajiTotalManajer());
    }
}