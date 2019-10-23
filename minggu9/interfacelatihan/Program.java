/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu9.interfacelatihan;

/**
 *
 * @author Denuradhan
 */
public class Program {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();
        
//        Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
//        pakRektor.beriSertifikanCumlaude(mahasiswaBiasa);
        pakRektor.beriSertifikanCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikanCumlaude(masterCumlaude);
//        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
//        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}
