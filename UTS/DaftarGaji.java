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
import java.util.ArrayList;
public class DaftarGaji {
    ArrayList<Pegawai> listPegawai = new ArrayList<>();
    
    public void addPegawai(Pegawai pegawai) {
        listPegawai.add(pegawai);
    }
    
    public void printSemuaGaji() {
        for (int i = 0; i < listPegawai.size(); i++) {
            System.out.println("Nama : "+listPegawai.get(i).getNama()+"\t\t Gaji : "+listPegawai.get(i).getGaji());
        }
    }
    
}
