// Zahran Zaidan Nasution - 265150601111020
import java.util.Arrays;
import java.util.Scanner;

public class AplikasiKereta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection = 0;
        int orderSelection = 0;
        Object[][] dataKereta = {
                {"Ekonomi", 50000, 2, false, false},
                {"Bisnis", 100000, 5, true, false},
                {"Eksekutif", 200000, 7, true, false},
                {"Pariwisata", 300000, 5, true, true},
        };

        Object[][] pesanan = {};
        Object[][] pesananTemp = {};

        do {
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.println("0. Keluar");
            System.out.print("Masukkan nilai: ");

            selection = input.nextInt();

            switch (selection) {
                case 1:
                    System.out.print("\n");
                    System.out.println("Pilihan, Jenis, Harga, Diskon, AC, Colokan");
                    for (int i = 0; i < dataKereta.length; i++) {
                        // 0 = jenis
                        // 1 = harga
                        // 2 = diskon
                        // 3 = ac
                        // 4 = colokan
                        System.out.print(i + ", ");
                        System.out.print(dataKereta[i][0] + ", ");
                        System.out.print((int) dataKereta[i][1] + ", ");
                        System.out.print((int) dataKereta[i][2] + "%, ");
                        System.out.print((boolean) dataKereta[i][3] ? "Ada, " : "Tidak Ada, ");
                        System.out.print((boolean) dataKereta[i][4] ? "Ada" : "Tidak Ada");

                        System.out.println();
                    }
                    System.out.print("\n");
                    break;
                case 2:
                    System.out.print("\n");
                    System.out.println("Pilihan, Jenis, Harga, Diskon, AC, Colokan");
                    for (int i = 0; i < dataKereta.length; i++) {
                        if ((boolean) dataKereta[i][3] == true) {
                            // 0 = jenis
                            // 1 = harga
                            // 2 = diskon
                            // 3 = ac
                            // 4 = colokan
                            System.out.print(i + ", ");
                            System.out.print(dataKereta[i][0] + ", ");
                            System.out.print((int) dataKereta[i][1] + ", ");
                            System.out.print((int) dataKereta[i][2] + "%, ");
                            System.out.print((boolean) dataKereta[i][3] ? "Ada, " : "Tidak Ada, ");
                            System.out.print((boolean) dataKereta[i][4] ? "Ada" : "Tidak Ada");

                            System.out.println();
                        }
                    }
                    System.out.print("\n");
                    break;
                case 3:
                    System.out.print("\n");
                    System.out.println("Pilihan, Jenis, Harga, Diskon, AC, Colokan");
                    for (int i = 0; i < dataKereta.length; i++) {
                        if ((boolean) dataKereta[i][4] == true) {
                            // 0 = jenis
                            // 1 = harga
                            // 2 = diskon
                            // 3 = ac
                            // 4 = colokan
                            System.out.print(i + ", ");
                            System.out.print(dataKereta[i][0] + ", ");
                            System.out.print((int) dataKereta[i][1] + ", ");
                            System.out.print((int) dataKereta[i][2] + "%, ");
                            System.out.print((boolean) dataKereta[i][3] ? "Ada, " : "Tidak Ada, ");
                            System.out.print((boolean) dataKereta[i][4] ? "Ada" : "Tidak Ada");

                            System.out.println();
                        }
                    }
                    System.out.print("\n");
                    break;
                case 4:
                    System.out.print("Masukkan kereta yang ingin dipesan: ");
                    orderSelection = input.nextInt();

                    pesananTemp = Arrays.copyOf(pesanan, pesanan.length + 1);
                    pesananTemp[pesananTemp.length - 1] = dataKereta[orderSelection];
                    pesanan = pesananTemp;
                    break;
                case 5:
                    System.out.print("\n");
                    System.out.println("Jenis, Harga, Diskon, AC, Colokan");
                    for (int i = 0; i < pesanan.length; i++) {
                        // 0 = jenis
                        // 1 = harga
                        // 2 = diskon
                        // 3 = ac
                        // 4 = colokan
                        System.out.print(pesanan[i][0] + ", ");
                        System.out.print((int) pesanan[i][1] + ", ");
                        System.out.print((int) pesanan[i][2] + "%, ");
                        System.out.print((boolean) pesanan[i][3] ? "Ada, " : "Tidak Ada, ");
                        System.out.print((boolean) pesanan[i][4] ? "Ada" : "Tidak Ada");

                        System.out.println();
                    }
                    System.out.print("\n");
                    break;
            }
        } while (selection != 0);
    }
}
