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
public class SegitigaMain {
    
    public static void main(String[] args) {
        Segitiga triangle = new Segitiga();
        System.out.println(triangle.totalSudut(10));
        System.out.println(triangle.totalSudut(10, 10));
        System.out.println(triangle.keliling(6, 8, 10));
        System.out.println(triangle.keliling(6, 8));
    }
}
