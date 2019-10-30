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
            System.out.println("Televisi Jadul Menyala dengan burik");
        }else if(elc instanceof TelevisiModern){
            System.out.println("Televisi Modern Menyala dengan full hologram");
        }else{
            System.out.println("error");
        }
    }
    
}
