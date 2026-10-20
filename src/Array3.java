// Zahran Zaidan Nasution - 265150601111020
public class Array3 {
    public static void main(String args[]) {
        int jumlahGanjil = 0;
        int jumlahGenap = 0;
        int a[] = {2, 7, 6, 8, 1};
        int b[] = {3, 4, 2, 8, 9, 7, 2, 7, 5};
        int pjg;
        pjg = Math.max(a.length, b.length);
        int c[] = new int[pjg];
        int d[] = new int[a.length + b.length];
        for (int i = 0; i < pjg; i++) {
            if (a.length < i+1)
                c[i] = b[i];
            else if (b.length < i+1)
                c[i] = a[i];
            else
                c[i] = a[i] + b[i];
            System.out.print(c[i] + " ");
        }

        for (int i = 0; i < a.length; i++) {
            d[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (!(a[j] == b[i])) {
                    d[a.length + i] = b[i];
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < d.length; i++) {
            for (int j = i + 1; j < d.length; j++) {
                if (d[i] == d[j]) {
                    d[i] = 0;
                    break;
                }
            }
        }

        System.out.println();

        System.out.print("Angka: ");

        for (int i = 0; i < d.length; i++) {
            // 2 7 6 8 1 3 4 0 8 9 7 0 7 5
            if (d[i] != 0) {
                System.out.print(d[i] + " ");

                if (d[i] % 2 == 0) {
                    jumlahGenap += d[i];
                } else {
                    jumlahGanjil += d[i];
                }
            }
        }

        System.out.println();

        System.out.println("jumlahGanjil = " + jumlahGanjil);
        System.out.println("jumlahGenap = " + jumlahGenap);
    }
}