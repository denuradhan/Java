/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;

/**
 *
 * @author Denuradhan
 */
public class Dosen extends Manusia{
    @Override
    public void makan() {
        super.makan();
        System.out.println("dengan gaya");
    }
    public void lembur() {
        System.out.println("dapet uang");
    }

}
