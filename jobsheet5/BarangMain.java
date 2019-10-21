package jobsheet5;
import java.util.Scanner;
public class BarangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
        KeranjangBelanja kb = new KeranjangBelanja();
        int jmlbarang = 4;
        for (int i = 0; i < jmlbarang; i++) {
            System.out.print("Nama barang : ");
            String nama = scS.nextLine();
            System.out.print("Jumlah Barang : ");
            int jumlah = sc.nextInt();
            System.out.print("Harga Satuan : ");
            int hargasatuan = sc.nextInt();
            System.out.println("--------------------------");
            Barang b = new Barang(nama, jumlah, hargasatuan);
            kb.tambah(b);
        }
        System.out.println("Data sebelum di sorting : ");
        kb.tampil();
        System.out.println("Data sesudah di bubblesort : ");
        kb.bubbleSort();
        kb.tampil();
        System.out.println("Data seudah di selectionsort : ");
        kb.selectionSort();
        kb.tampil();
        System.out.println("mergesort");
        kb.mergesort();
        kb.tampil();
        
        
        
    }
    
}

