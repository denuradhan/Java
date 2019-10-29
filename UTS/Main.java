/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author Denuradhan
 */

public class Main {
    
    static DaftarGaji dg = new DaftarGaji();
    public static void main(String[] args) {
        
        addDosen("65163", "Denny", "perum abc", 5);
        addStaf("65162", "naufal", "Gunug Kawi", 9);
        addDosen("65660", "Cita", "perum abc", 6);
        dg.printSemuaGaji();
        System.out.println();
        
        for (int i = 0; i < dg.listPegawai.size(); i++) {
            dg.listPegawai.get(i).info();
        }
        
    }
    public static void addDosen(String nip, String nama, String alamat, int jmlSks) {
        dg.addPegawai(new Dosen(nip, nama, alamat, jmlSks));
    }
    public static void addStaf(String nip, String nama, String alamat, int jmlKehadiran) {
        dg.addPegawai(new Staf(nip, nama, alamat, jmlKehadiran));
    }
    
}
