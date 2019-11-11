/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

/**
 *
 * @author Denuradhan
 */
import java.util.Scanner;
public class NewClass {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                boolean prima = true;
                if (i%j==0) {
                    prima = false;
                }
                if (prima) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
