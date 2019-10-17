package jobsheet10;

import java.util.Scanner;

public class LinkedListTest {

    static Scanner sc = new Scanner(System.in);
    static LinkedList data = new LinkedList();
    static int i = 0;

    public static void main(String[] args) {
        while(true){
            menuUtama();
        }
    }

    private static void menuUtama() {
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Keluar");
        int pil = sc.nextInt();
        switch (pil) {
            case 1:
                tambah();
                break;
            case 2:
                hapus();
                break;
            case 3:
                cari();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah");
        }

    }

    public static void tambah() {
        int input, input1, input2;
        System.out.println("1. Tambah (First)");
        System.out.println("2. Tambah (Indeks)");
        System.out.println("3. Tambah (Key)");
        System.out.println("4. Tambah (Last)");
        int pil = sc.nextInt();
        try {
            switch (pil) {
                case 1:
                    System.out.print("Input : ");
                    input = sc.nextInt();
                    data.addFirst(input);
                    break;
                case 2:
                    System.out.print("Input data : ");
                    input1 = sc.nextInt();
                    System.out.print("Input Indeks :");
                    input2 = sc.nextInt();
                    data.add(input1, input2);
                    break;
                case 3:
                    System.out.print("Input : ");
                    input = sc.nextInt();
                    data.addKey(input);
                    break;
                case 4:
                    System.out.print("Input : ");
                    input = sc.nextInt();
                    data.addLast(input);
                    break;
            }
        } catch (Exception e) {
        }
    }

    public static void hapus() {
        int input;
        System.out.println("1. Hapus (indeks)");
        System.out.println("2. Hapus (key)");
        System.out.println("3. Clear");
        int pil = sc.nextInt();
        try {
            switch(pil){
                case 1 :
                    System.out.print("Input : ");
                    input = sc.nextInt();
                    data.remove(input);
                    break;
                case 2 :
                    System.out.print("Input : ");
                    input = sc.nextInt();
                    data.removeKey(input);
                    break;
                case 3 :
                    data.clear();
                    System.out.println("CLEARED");
                    break;
            }
        } catch (Exception e) {
        }
    }

    public static void cari() {
        int input;
        System.out.println("1. Cari (Indeks)");
        System.out.println("2. Cari (Key)");
        int pil = sc.nextInt();
        try {
            switch(pil){
                case 1 :
                    System.out.print("Input : ");
                    input = sc.nextInt();
                    System.out.println(data.get(input));
                    break;
                case 2 : 
                    System.out.print("Input : ");
                    input = sc.nextInt();
                    System.out.println(data.getKey(input));
                    break;
            }
        } catch (Exception e) {
        }
    }

}
