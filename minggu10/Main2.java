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
public class Main2 {
    public static void main(String[] args) {
        Elektronik tv1 = new TelevisiJadul();
        Elektronik tv2 = new TelevisiModern();
        Manusia tampan = new Manusia();
        tampan.nyalakanPerangkat(tv1);
        tampan.nyalakanPerangkat(tv2);
    }
}