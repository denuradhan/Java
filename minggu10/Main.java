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
import java.util.ArrayList;
public class Main {
    static ArrayList<Pegawai> pegawai = new ArrayList<>();
    public static void main(String[] args) {
        addManajer("Denny", 10000, 5000);
        addProgeammer("Dharma", 5000, 7500);
        addManajer("Alpan", 2000, 3000);
        Bayaran hr = new Bayaran();
        System.out.println("======================================");
        for (Pegawai pg : pegawai) {
            pg.info();
            System.out.println("Total Bayaran   : "+hr.hitungBayaran(pg));
        System.out.println("======================================");
        }
    }
    
    public static void addManajer(String nama, int gaji, int tunjangan) {
        pegawai.add(new Manajer(nama, gaji, tunjangan));
    }
    
    public static void addProgeammer(String nama, int gaji, int bonus) {
        pegawai.add(new Programmer(nama, gaji, bonus));
    }
    
}
