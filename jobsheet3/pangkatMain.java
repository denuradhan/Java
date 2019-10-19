package jobsheet3;
import java.util.Scanner;
public class pangkatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pangkat pgkt = new pangkat();
        PangkatProp hasil = new PangkatProp();
        System.out.print("Masukan Nilai Angka   : ");
        pgkt.x = sc.nextInt();
        System.out.print("Masukan Nilai Pangkat : ");
        pgkt.n = sc.nextInt();
        System.out.println("Brute Force     : "+pgkt.pangkatBruteForce());
        pgkt.pangkatDivideConquer(1, pgkt.n, hasil);
        System.out.print("Divide Conquer  : "+hasil.hasil);
        
    }
}
