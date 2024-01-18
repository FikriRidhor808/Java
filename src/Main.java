import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("## Resotoran Abatukam");
        System.out.println("=================================");
        System.out.println("");

        String nama, nama_2, nama_3;
        int Jumlah_Pesan, Jumlah_Pesan_2, Jumlah_Pesan_3;


        int[] Harga;
        Harga = new int[4];
        Harga[1] = 15;
        Harga[2] = 10;
        Harga[3] = 13;

        String[] Pilihan = new String[4];
        Pilihan[1] = "Nasi Goreng";
        Pilihan[2] = "Mie Ayam";
        Pilihan[3] = "Bakso";

        System.out.print("Nama : ");
        nama = input.next();

        // Menampilkan menu
        System.out.println("Menu Makanan:");
        System.out.println("1. Nasi Goreng" +" Rp."+ Harga[1] +".000");
        System.out.println("2. Mie Ayam" +" Rp."+ Harga[2]+".000");
        System.out.println("3. Bakso" +" Rp."+ Harga[3]+".000");

        // Mengambil input dari pengguna
        System.out.println("Pilih nomor makanan (1-3): ");
        int pilihanPengguna = input.nextInt();

        System.out.print("Jumlah Pesanan : ");
        Jumlah_Pesan = input.nextInt();

        // Memeriksa pilihan pengguna dengan if-else
        if (pilihanPengguna >= 1 && pilihanPengguna <= 3) {
//            System.out.println("Anda memesan: " + Pilihan[pilihanPengguna]);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        if (pilihanPengguna < 1 || Jumlah_Pesan < 0 ) {
            System.out.println("Salah Input!!!");
            return;
        }
        else {
            System.out.println("Salah!!");
        }
        System.out.println("=================================");
        System.out.println("Nama Pemesan"+" : "+ nama);
        System.out.println("Pesanan" +" : "+Pilihan[pilihanPengguna]);

        System.out.println("Harga"+" : "+ Harga[pilihanPengguna]+".000");

        System.out.println("Jumlah Pesanan : "  + Jumlah_Pesan);

        System.out.println("Jumlah" +" : "+ (Harga[pilihanPengguna] * Jumlah_Pesan)+".000");

//case 2 =========================================================================================================
        System.out.println("=================================");

        System.out.println("Nama : ");
        nama_2 = input.next();

        // Menampilkan menu
        System.out.println("Menu Makanan:");
        System.out.println("1. Nasi Goreng" +" Rp."+ Harga[1] +".000");
        System.out.println("2. Mie Ayam" +" Rp."+ Harga[2]+".000");
        System.out.println("3. Bakso" +" Rp."+ Harga[3]+".000");

        // Mengambil input dari pengguna
        System.out.println("Pilih nomor makanan (1-3): ");
        int pilihanPengguna_2 = input.nextInt();

        System.out.print("Jumlah Pesanan_2: ");
        Jumlah_Pesan_2 = input.nextInt();

        // Memeriksa pilihan pengguna dengan if-else
        if (pilihanPengguna_2 >= 1 && pilihanPengguna_2 <= 3) {
//            System.out.println("Anda memesan: " + Pilihan[pilihanPengguna_2]);
        } else {
            System.out.println("Pilihan tidak valid.");

        }
        if (pilihanPengguna_2 < 1 || Jumlah_Pesan_2 > 3) {
            System.out.println("Salah Input!!!");
            return;
        }
        else {
            System.out.println("Salah!!");
        }
        System.out.println("=================================");
        System.out.println("Nama Pemesan"+" : "+ nama_2);
        System.out.println("Pesanan" +" : "+Pilihan[pilihanPengguna_2]);

        System.out.println("Harga"+" : "+ Harga[pilihanPengguna_2]+".000");

        System.out.println("Jumlah Pesanan : "  + Jumlah_Pesan_2);

        System.out.println("Jumlah" +" : "+ (Harga[pilihanPengguna_2] * Jumlah_Pesan_2)+".000");


        //case 3 =========================================================================================================
        System.out.println("=================================");

        System.out.println("Nama : ");
        nama_3 = input.next();

        // Menampilkan menu
        System.out.println("Menu Makanan:");
        System.out.println("1. Nasi Goreng" +" Rp."+ Harga[1] +".000");
        System.out.println("2. Mie Ayam" +" Rp."+ Harga[2]+".000");
        System.out.println("3. Bakso" +" Rp."+ Harga[3]+".000");

        // Mengambil input dari pengguna
        System.out.println("Pilih nomor makanan (1-3): ");
        int pilihanPengguna_3 = input.nextInt();

        System.out.print("Jumlah Pesanan : ");
        Jumlah_Pesan_3 = input.nextInt();

        // Memeriksa pilihan pengguna dengan if-else
        if (pilihanPengguna_3 == 1) {
            System.out.println("Anda memesan Nasi Goreng ");
        } else if (pilihanPengguna_3 == 2)
        {
            System.out.println("Anda memesan Mia Ayam");
        }
        else if (pilihanPengguna_3 == 3)
        {
            System.out.println("Anda memesan Bakso");
        }
        if (pilihanPengguna_3 < 1 || Jumlah_Pesan_3 > 3) {
            System.out.println("Salah Input!!!");
            return;
        }
        else {
            System.out.println("Salah!!");
        }

        System.out.println("=================================");
        System.out.println("Nama Pemesan"+" : "+ nama_3);
        System.out.println("Pesanan" +" : "+Pilihan[pilihanPengguna_3]);

        System.out.println("Harga"+" : "+ Harga[pilihanPengguna_3]+".000");

        System.out.println("Jumlah Pesanan : "  + Jumlah_Pesan_3);

        System.out.print("Jumlah" +" : "+ (Harga[pilihanPengguna_3] * Jumlah_Pesan_3)+".000");

    }
}
