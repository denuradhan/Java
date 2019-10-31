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
public class Programmer extends Pegawai{
    private int bonus;
    
    Programmer(String nama, int gaji, int bonus){
        super(nama, gaji);
        this.bonus = bonus;
    }
    
    public int getBonus() {
        return bonus;
    }
    
    public int gajiTotalProgrammer(){
        return super.getGaji()+bonus;
    }
    
    @Override
    public void tampil(){
        super.tampil();
        System.out.println("Bonus: " +bonus);
        System.out.println("Gaji Total: " +gajiTotalProgrammer());
    }
}
