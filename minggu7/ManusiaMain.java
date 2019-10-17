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
public class ManusiaMain {
    public static void main(String[] args) {
        Dosen bapak = new Dosen();
        Mahasiswa denny = new Mahasiswa();
        System.out.println("Dosen :");
        bapak.makan();
        bapak.lembur();
        System.out.println();
        System.out.println("Mahasiswa : ");
        denny.makan();
        denny.tidur();
    }
}
