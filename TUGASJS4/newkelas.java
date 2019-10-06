/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGASJS4;
import java.util.Random;
public class newkelas {
    public static void main(String[] args) {
      Random r = new Random();
      int random;
        while (true) {
            random = r.nextInt();
            if (random>=1&&random<=100) {
                System.out.println(random);
                break;
            }
        }
       
    }
}
