// Zahran Zaidan Nasution - 265150601111020
import java.util.Scanner;

public class PilihanMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] opsi = {
                "Operasi Input Data Selesai",
                "Operasi Lihat Selesai",
                "Operasi Average Selesai",
                "Operasi Sum Selesai",
                "Operasi Max Selesai",
                "Operasi Min Selesai",
                "Keluar apliaksi...",
        };

        int selection = 0;

        do {
            // sedikit bingung apakah kita pakai switch case disini untuk implementasi aplikasi?
            // karena materi array, harusnya tidak mengarah ke switch case lagi
            // tetapi iya, untuk fitur aplikasinya abstrak, lebih fokus implementasi array dan selectionnya
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("0. Keluar");
            System.out.print("Masukkan nilai: ");
            selection = input.nextInt();
            if (selection != 7) {
                System.out.println(opsi[selection]);
            }
        } while (selection != 7);
    }
}
