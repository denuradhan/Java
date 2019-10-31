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
public class Pegawai{
    private String nama;
    private int gaji;
    
    public void pegawai(){
        
    }
    
    public Pegawai(String nama, int gaji){
        this.nama = nama;
        this.gaji = gaji;
    }

    public int getGaji() {
        return this.gaji;
    }
    
    public void tampil(){
        System.out.println("Nama: " +this.nama);
        System.out.println("Gaji: " +this.gaji);
    }
}