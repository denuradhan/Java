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
public class Mahasiswa extends Manusia{
    @Override
    public void makan() {
        super.makan();
        System.out.println("Ala bangsawan");
    }
    public void tidur() {
        System.out.println("beristirahat dengan tenang");
    }
    
}
