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
public class Programmer extends Pegawai {

    private int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public int getGaji() {
        return gaji;
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Status          : Programmer");
        System.out.println("Bonus           : "+getBonus());
    }
    
}
