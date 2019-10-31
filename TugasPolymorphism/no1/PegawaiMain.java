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
public class PegawaiMain{
    public static void main(String[] args) {
        Bayaran hr = new Bayaran();
        Pegawai m = new Manajer("Kyung", 25000000, 5000000);
        Pegawai p = new Programmer("Haru", 5000000, 300000);
        Pegawai r = new Manajer("blblb", 100, 500);
        
        m.tampil();
        System.out.println("Bayaran : "+hr.hitungBayaran(m));
        System.out.println("===");
        
        p.tampil();
        System.out.println("Bayaran : "+hr.hitungBayaran(p));
        System.out.println("===");
        
        r.tampil();
        System.out.println("Bayaran : "+hr.hitungBayaran(r));
        System.out.println("===");

        
    }   
}