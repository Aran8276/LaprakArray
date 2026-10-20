// Zahran Zaidan Nasution - 265150601111020
import java.util.Scanner;

public class Array2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double nilaiRata2 = 0;
        double nilaiMin = 0;
        double nilaiMax = 0;
        String nama[] = new String[10];
        int[][] coba = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        int nilaiJumlah = 0;
        double[][] bank = new double[2][3];

        System.out.println(" i    j  coba[i][j]");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%2d %2d %3d\n", i, j, coba[i][j]);
            }
        }
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < 3; j++) {
                bank[i][j] = i * 0.5 + j * 0.25;
            }
        }
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(bank[i][j] + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < coba.length; i++) {
            for (int j = 0; j < coba[i].length; j++) {
                if (coba[i][j] > nilaiMax) {
                    nilaiMax = coba[i][j];
                } else if (coba[i][j] < nilaiMin) {
                    nilaiMin = coba[i][j];
                }
            }
        }

        nilaiRata2 = (double) nilaiJumlah / 12;

        System.out.println(nilaiRata2);

        System.out.println("nilaiMin = " + nilaiMin);
        System.out.println("nilaiMax = " + nilaiMax);
    }
}