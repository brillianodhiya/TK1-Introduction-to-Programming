import java.util.Scanner;

public class TK2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim;
        int jumlahAngka, sumGenap, sumGanjil, sumFibonacci;
        char ulang;

        do {
            // Input Nama
            do {
                System.out.print("Masukkan Nama Anda [1..25] : ");
                nama = input.nextLine().trim();
            } while (nama.length() < 1 || nama.length() > 25);

            // Input NIM
            do {
                System.out.print("Masukkan NIM Anda [harus 10 karakter] : ");
                nim = input.nextLine().trim();
            } while (nim.length() != 10);

            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
            System.out.println("Registrasi Sukses...");
            System.out.println("Selamat datang " + nama + " [NIM: "+ nim+ "]\n");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");

            // Input Jumlah Angka
            do {
                System.out.print("Masukkan Sembarang Angka [5..20] : ");
                jumlahAngka = input.nextInt();
                input.nextLine();
            } while (jumlahAngka < 5 || jumlahAngka > 20);

            // Tampilkan deret bilangan genap
            System.out.println("\nDeret Bilangan");
            System.out.println("#############\n");
            System.out.print(jumlahAngka + " Bilangan Genap : ");
            sumGenap = 0;
            for (int i = 1; i <= jumlahAngka; i++) {
                int bilangan = 2 * i;
                System.out.print(bilangan + " ");
                sumGenap += bilangan;
            }
            System.out.println("\nHasil Penjumlahan = " + sumGenap);

            // Tampilkan deret bilangan ganjil
            System.out.print("\n" + jumlahAngka + " Bilangan Ganjil : ");
            sumGanjil = 0;
            for (int i = 0; i < jumlahAngka; i++) {
                int bilangan = 2 * i + 1;
                System.out.print(bilangan + " ");
                sumGanjil += bilangan;
            }
            System.out.println("\nHasil Penjumlahan = " + sumGanjil);

            // Tampilkan deret bilangan fibonacci
            System.out.print("\n" + jumlahAngka + " Bilangan Fibonancci : ");
            sumFibonacci = 0;
            int a = 1, b = 1;
            System.out.print(a + " " + b + " ");
            sumFibonacci = a + b;
            for (int i = 3; i <= jumlahAngka; i++) {
                int c = a + b;
                System.out.print(c + " ");
                sumFibonacci += c;
                a = b;
                b = c;
            }
            System.out.println("\nHasil Penjumlahan = " + sumFibonacci);

            // Input untuk mengulang perhitungan
            System.out.print("\nAnda ingin mengulang [y/t] : ");
            ulang = input.nextLine().toLowerCase().charAt(0);

        } while (ulang == 'y');
    }
}
