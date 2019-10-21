package jobsheet5;

import java.util.List;

public class KeranjangBelanja {

    Barang listBarang[] = new Barang[4];
    
    int idx;
    boolean x = false;

    void tambah(Barang b) {
        if (idx < listBarang.length) {
            listBarang[idx] = b;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Barang b : listBarang) {
            b.tampil();
            System.out.println("------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listBarang.length - 1; i++) {
            for (int j = 1; j < listBarang.length - i; j++) {
                if (listBarang[j].hargaSatuan < listBarang[j - 1].hargaSatuan) {
                    Barang tmp = listBarang[j];
                    listBarang[j] = listBarang[j - 1];
                    listBarang[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listBarang.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listBarang.length; j++) {
                if ((listBarang[j].hitungHargaTotal()) < (listBarang[idxMin].hitungHargaTotal())) {
                    idxMin = j;
                }
                Barang tmp = listBarang[idxMin];
                listBarang[idxMin] = listBarang[i];
                listBarang[i] = tmp;
            }
        }
    }
    
    void mergesort(){
        Barang[] left = new Barang[2];
        Barang[] right = new Barang[2];
        for (int i = 0; i < 2; i++) {
            left[i] = listBarang[i];
            right[i] = listBarang[i+2];
        }
        if (left[0].jumlah<left[1].jumlah) {
            Barang tmp = listBarang[1];
            listBarang[1] = listBarang[0];
            listBarang[0] = tmp;
        }
        if (right[0].jumlah<right[1].jumlah) {
            Barang tmp = listBarang[1];
            listBarang[1] = listBarang[0];
            listBarang[0] = tmp;
        }
        for (int i = 0; i < 2; i++) {
            listBarang[i]=left[i];
            listBarang[i+2]=right[i];
        }
        for (int i = 0; i < listBarang.length - 1; i++) {
            for (int j = 1; j < listBarang.length - i; j++) {
                if (listBarang[j].jumlah < listBarang[j - 1].jumlah) {
                    Barang tmp = listBarang[j];
                    listBarang[j] = listBarang[j - 1];
                    listBarang[j - 1] = tmp;
                }
            }
        }        
    }
}
