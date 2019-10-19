package jobsheet3;



public class KaliMatriksDC {

    private int[][] c11, c12, c21, c22;

    public KaliMatriksDC() {
    }

    int[][] hitungMatriksDC(int[][] matriksPertama, int[][] matriksKedua, int length) {

        if (length == 1) {
            int[][] hasil = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        hasil[i][j] += matriksPertama[i][k] * matriksKedua[k][j];
                    }
                }
            }
            return hasil;
        } else {

            int[][] a11 = new int[length / 2][length / 2];
            int[][] a12 = new int[length / 2][length / 2];
            int[][] a21 = new int[length / 2][length / 2];
            int[][] a22 = new int[length / 2][length / 2];

            int[][] b11 = new int[length / 2][length / 2];
            int[][] b12 = new int[length / 2][length / 2];
            int[][] b21 = new int[length / 2][length / 2];
            int[][] b22 = new int[length / 2][length / 2];

            for (int i = 0; i < a11.length; i++) {
                for (int j = 0; j < a11.length; j++) {
                    a11[i][j] = matriksPertama[i][j];
                    b11[i][j] = matriksKedua[i][j];
                }
                for (int j = 0; j < a11.length; j++) {
                    a12[i][j] = matriksPertama[i][j + 2];
                    b12[i][j] = matriksKedua[i][j + 2];
                }
                for (int j = 0; j < a11.length; j++) {
                    a21[i][j] = matriksPertama[i + 2][j];
                    b21[i][j] = matriksKedua[i + 2][j];
                }
                for (int j = 0; j < a11.length; j++) {
                    a22[i][j] = matriksPertama[i + 2][j + 2];
                    b22[i][j] = matriksKedua[i + 2][j + 2];
                }
            }

            c11 = penjumlahan(hitungMatriksDC(a11, b11, a11.length / 2), hitungMatriksDC(a12, b21, a11.length / 2));
            c12 = penjumlahan(hitungMatriksDC(a11, b12, a11.length / 2), hitungMatriksDC(a12, b22, a11.length / 2));
            c21 = penjumlahan(hitungMatriksDC(a21, b11, a11.length / 2), hitungMatriksDC(a22, b21, a11.length / 2));
            c22 = penjumlahan(hitungMatriksDC(a21, b12, a11.length / 2), hitungMatriksDC(a22, b22, a11.length / 2));

            int[][] c = new int[length][length];

            for (int i = 0; i < c11.length; i++) {
                for (int j = 0; j < c11.length; j++) {
                    c[i][j] = c11[i][j];
                }
                for (int j = 0; j < c12.length; j++) {
                    c[i][j + 2] = c12[i][j];
                }
                for (int j = 0; j < c21.length; j++) {
                    c[i + 2][j] = c21[i][j];
                }
                for (int j = 0; j < c22.length; j++) {
                    c[i + 2][j + 2] = c22[i][j];
                }
            }

            return c;
        }
    }

    public int[][] penjumlahan(int[][] a, int[][] b) {
        int[][] C = new int[a.length][a.length];

        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y < a.length; y++) {
                C[x][y] = a[x][y] + b[x][y];
            }
        }

        return C;
    }
}
