import java.util.Scanner;

public class RestoranBungar {
    public static void main(String[] args) {
        // Mengimport Scanner dari package java.util untuk input dari user
        Scanner input = new Scanner(System.in); // Membuat object input dari class Scanner
        System.out.println("Selamat siang...");
        System.out.print("Pesan untuk berapa orang : ");
        int jumlahOrang = input.nextInt(); // Meminta input jumlah orang yang memesan dari user
        input.nextLine(); // Membersihkan buffer setelah input
        System.out.print("Pesanan atas nama : ");
        String namaPemesan = input.nextLine(); // Meminta input nama pemesan dari user
        System.out.println("\nMenu Spesial hari ini\n=====================");
        System.out.println("1. Nasi Goreng Spesial      @ Rp. 9999.99"); // Menampilkan daftar menu
        System.out.println("2. Ayam Bakar Spesial       @ Rp. 12345.67");
        System.out.println("3. Steak Sirloin Spesial    @ Rp. 21108.40");
        System.out.println("4. Kuetiaw Siram Spesial    @ Rp. 13579.13");
        System.out.println("5. Kambing Guling Spesial   @ Rp. 98765.43\n");

        System.out.println("Pesanan Anda batas pesanan 0-10 poi");
        int[] jumlahPesanan = new int[5]; // Membuat array untuk menyimpan jumlah pesanan
        for (int i = 0; i < 5; i++) { // Looping untuk meminta input jumlah pesanan untuk setiap menu
            System.out.printf("%-2s%-30s = ", (i + 1) + ". ", getMenu(i)); // Menampilkan daftar menu dan meminta input jumlah pesanan dari user
            jumlahPesanan[i] = input.nextInt();
        }
        System.out.println("\nSelamat menikmati makanan anda...\n");
        System.out.println("Pembelian :\n");

        double[] hargaPesanan = new double[5]; // Membuat array untuk menyimpan harga pesanan
        double totalPembelian = 0; // Variabel untuk menyimpan total pembelian
        for (int i = 0; i < 5; i++) { // Looping untuk menghitung harga pesanan untuk setiap menu
            hargaPesanan[i] = jumlahPesanan[i] * getHarga(i); // Menghitung harga pesanan
            if (i == 4) { // Jika menu terakhir
                System.out.printf("%-40s = Rp.%20.2f\t+\n", (i + 1) + ". " + getMenu(i), hargaPesanan[i]); // Tampilkan symbol + juga di dalam modifier
            } else {
                System.out.printf("%-40s = Rp.%20.2f\n", (i + 1) + ". " + getMenu(i), hargaPesanan[i]); // Tampilan modifier printf
            }
            totalPembelian += hargaPesanan[i]; // Menghitung total pembelian
        }
        double diskon = totalPembelian * 0.1; // Menentukan diskon 10%
        double totalSetelahDiskon = totalPembelian - diskon; // Menghitung harga setelah diskon
        double pembelianPerOrang = totalSetelahDiskon / jumlahOrang; // Menghitung total pembelian per orang

        System.out.println("===================================================================");
        System.out.printf("Total Pembelian\t\t\t\t\t\t\t = Rp.%20.2f\n", totalPembelian); // menggunakan modifier untuk menampilkan harga dan text agar sejajar
        System.out.printf("Disc. 10 %% (Masa Promosi) \t\t\t\t = Rp.%20.2f\t-\n", diskon);
        System.out.println("++=================================================================");

        System.out.printf("Total Pembelian setelah disc 10 %%\t\t = Rp.%20.2f\n", totalSetelahDiskon);
        System.out.printf("Pembelian per orang (untuk %d orang) \t = Rp.%20.2f\n", jumlahOrang, pembelianPerOrang);


        System.out.println("\n           Terima kasih atas kunjungan Anda...           ");
        System.out.println("              ...tekan ENTER untuk keluar...              ");

        input.nextLine(); // Membersihkan buffer
    }

    public static String getMenu(int i) {
        switch (i) {
            case 0:
                return "Nasi Goreng Spesial"; // jika index ke 0 / jika menu pertama
            case 1:
                return "Ayam Bakar Spesial";
            case 2:
                return "Steak Sirloin Spesial";
            case 3:
                return "Kwetiaw Siram Spesial";
            case 4:
                return "Kambing Guling Spesial";
            default:
                return "";
        }
    }

    public static double getHarga(int menu) {
        double harga = 0;
        switch (menu) {
            case 0:
                harga = 9999.99; // jika index ke 0 atau jika menu pertama
                break;
            case 1:
                harga = 12345.67;
                break;
            case 2:
                harga = 21108.40;
                break;
            case 3:
                harga = 13579.13;
                break;
            case 4:
                harga = 98765.43;
                break;
            default:
                System.out.println("\n"); // jika tidak masuk dalam case di atas keluarkan enter
                break;
        }
        return harga;
    }
}