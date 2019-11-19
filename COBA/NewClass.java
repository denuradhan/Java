/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COBA;
/**
 *
 * @author Denuradhan
 */
import java.util.Scanner;
public class NewClass {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukan Banyak Mahasiswa : ");
        int baris = sc.nextInt();
        System.out.print("Masukan Banyak Nilai : ");
        int kolom = sc.nextInt();
        int[][] mahasiswa = new int[baris][kolom+1];
        System.out.println("====================================");
        for (int i = 0; i < mahasiswa.length; i++) {
            mahasiswa[i][0] = i+1;
            System.out.println("Mahasiswa "+mahasiswa[i][0]);
            for (int j = 1; j < mahasiswa[i].length; j++) {
                System.out.print("input nilai "+j+" : ");
                int nilai = sc.nextInt();
                mahasiswa[i][j]=nilai;
            }
            System.out.println("----------------------");
        }
        System.out.println("====================================");
        for (int i = 0; i < mahasiswa.length; i++) {
            int sum = 0;
            for (int j = 1; j < mahasiswa[i].length; j++) {
                sum+=mahasiswa[i][j];
                if (j==mahasiswa[i].length-1) {
                    System.out.println("Mahasiswa "+mahasiswa[i][0]);
                    System.out.println("Rata - Rata : "+(sum/(mahasiswa[i].length-1)));
                    System.out.println();
                }
            }
        }
        
    }     
}