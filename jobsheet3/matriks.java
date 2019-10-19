package jobsheet3;
import java.util.Scanner;
public class matriks {
    public int sum;
    public Scanner sc = new Scanner(System.in);
    public int[][] array1 = new int[4][4];
    public int[][] array2 = new int[4][4];
    public int[][] array = new int[4][4];
           int[][] temp = new int [2][2];
           int[][] submatriks1 = new int [2][2];
           int[][] submatriks2 = new int [2][2];
           int[][] submatriks3 = new int [2][2];
           int[][] submatriks4 = new int [2][2];
           int[][] submatriks1a = new int [2][2];
           int[][] submatriks2a = new int [2][2];
           int[][] submatriks3a = new int [2][2];
           int[][] submatriks4a = new int [2][2];
           int[][] submatriks1b = new int [2][2];
           int[][] submatriks2b = new int [2][2];
           int[][] submatriks3b = new int [2][2];
           int[][] submatriks4b = new int [2][2];
           int[][] submatriksA1 = new int [2][2];
           int[][] submatriksA2 = new int [2][2];
           int[][] submatriksA3 = new int [2][2];
           int[][] submatriksA4 = new int [2][2];
           int[][] submatriksB1 = new int [2][2];
           int[][] submatriksB2 = new int [2][2];
           int[][] submatriksB3 = new int [2][2];
           int[][] submatriksB4 = new int [2][2];
    void matriks() {

    }
    void inputMatriks() {
        for (int h = 0; h < 2; h++) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (h == 0) {
                        System.out.print("Masukan Nilai matriks ke " + (h + 1) + " pada indeks ke- [" + i + "][" + j + "] : ");
                        array1[i][j] = sc.nextInt();
                    } else {
                        System.out.print("Masukan Nilai matriks ke " + (h + 1) + " pada indeks ke- [" + i + "][" + j + "] : ");
                        array2[i][j] = sc.nextInt();
                    }
                }
            }
        }
    }
    void outputMatriks() {
        System.out.println("Matriks 1");
        System.out.println("------------------------------------------");
        for (int i = 0; i < 4; i++) {
            System.out.print("| ");
            for (int j = 0; j < 4; j++) {
                System.out.print("\t" + array1[i][j]);
            }
            System.out.print("\t |");
            System.out.println();
        }
        System.out.println("------------------------------------------");
        System.out.println("");
        System.out.println("Matriks 2");
        System.out.println("------------------------------------------");
        for (int i = 0; i < 4; i++) {
            System.out.print("| ");
            for (int j = 0; j < 4; j++) {
                System.out.print("\t" + array2[i][j]);
            }
            System.out.print("\t |");
            System.out.println();
        }
        System.out.println("------------------------------------------");
    }
    void kaliMatriksBF() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j]=0;
                for (int k = 0; k < 4; k++) {
                    array[i][j]+=array1[i][k]*array2[k][j];
                }
            }
        }
        System.out.println("Brute force");
        System.out.println("------------------------------------------");
        for (int i = 0; i < 4; i++) {
            System.out.print("| ");
            for (int j = 0; j < 4; j++) {
                System.out.print("\t" + array[i][j]);
            }
            System.out.print("\t |");
            System.out.println();
        }
        System.out.println("------------------------------------------");
    }
    int[][] kaliSubMatriks(int[][] array,int[][] array1,int[][] array2){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j]=0;
                for (int k = 0; k < 2; k++) {
                    array[i][j]+=array1[i][k]*array2[k][j];
                }
            }
        }
        return array;
    }
    int[][] jumlahSubMatriks(int[][] array, int[][] array1,int[][] array2){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j]=array1[i][j]+array2[i][j];
            }
        }
        return array;
    }
    
    void kaliMatriksDC(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                submatriksA1[i][j]=array1[i][j];
                submatriksA2[i][j]=array1[i][j+2];
                submatriksA3[i][j]=array1[i+2][j];
                submatriksA4[i][j]=array1[i+2][j+2];
                submatriksB1[i][j]=array2[i][j];
                submatriksB2[i][j]=array2[i][j+2];
                submatriksB3[i][j]=array2[i+2][j];
                submatriksB4[i][j]=array2[i+2][j+2];                
            }
        }
        kaliSubMatriks(submatriks1a, submatriksA1, submatriksB1);
        kaliSubMatriks(submatriks1b, submatriksA2, submatriksB3);
        jumlahSubMatriks(submatriks1, submatriks1a, submatriks1b);
        kaliSubMatriks(submatriks2a, submatriksA1, submatriksB2);
        kaliSubMatriks(submatriks2b, submatriksA2, submatriksB4);
        jumlahSubMatriks(submatriks2, submatriks2a, submatriks2b);
        kaliSubMatriks(submatriks3a, submatriksA3, submatriksB1);
        kaliSubMatriks(submatriks3b, submatriksA4, submatriksB3);
        jumlahSubMatriks(submatriks3, submatriks3a, submatriks3b);
        kaliSubMatriks(submatriks4a, submatriksA3, submatriksB2);
        kaliSubMatriks(submatriks4b, submatriksA4, submatriksB4);
        jumlahSubMatriks(submatriks4, submatriks4a, submatriks4b);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j]=submatriks1[i][j];
                array[i][j+2]=submatriks2[i][j];
                array[i+2][j]=submatriks3[i][j];
                array[i+2][j+2]=submatriks4[i][j];
            }
        }
        System.out.println("Divide Conquer");
        System.out.println("------------------------------------------");
        for (int i = 0; i < 4; i++) {
            System.out.print("| ");
            for (int j = 0; j < 4; j++) {
                System.out.print("\t" + array[i][j]);
            }
            System.out.print("\t |");
            System.out.println();
        }
        System.out.println("------------------------------------------");
    }
}