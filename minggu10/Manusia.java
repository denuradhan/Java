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
public class Manusia {
    public void nyalakanPerangkat(Elektronik elc) {
        if (elc instanceof TelevisiJadul) {
            System.out.println(((TelevisiJadul) elc).getModeInput());
            System.out.println("Voltase : "+elc.getVoltase());
        }else if(elc instanceof TelevisiModern){
            System.out.println(((TelevisiModern) elc).getModeInput());
            System.out.println("Voltase : "+elc.getVoltase());
        }
    }
    
}
