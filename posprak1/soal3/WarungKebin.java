import java.lang.System;
import java.util.Scanner;

public class WarungKebin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Baca jumlah pembeli (N)
        // HINT: Perhatikan input setelah N ini
        int N = sc.nextInt();

        int i = 0;
        while (i < N) {
            // TODO: Baca data pembeli (nama, nomorMeja, saldo)
            // HINT: Perhatikan input setelah data pembeli ini
            sc.nextLine();
            String namanya = sc.nextLine();
            int nomornya = sc.nextInt();
            double saldonya = sc.nextDouble();
            sc.nextLine();
            String makanannya = sc.nextLine();
            int jumlahnya = sc.nextInt();
            double harganya = sc.nextDouble();
            
            // TODO: Baca data order makanan (namaMakanan, jumlah, hargaSatuan)
            // HINT: Perhatikan input setelah data order makanan ini
            
            // TODO: Buat objek Pembeli dan OrderMakanan
            Pembeli PembeliTersebut= new Pembeli(namanya,nomornya,saldonya);

            OrderMakanan Orderan= new OrderMakanan(makanannya, jumlahnya, harganya);

            // TODO: Cek apakah pembeli bisa membayar sendiri pesanannya
            boolean bisaBayar = PembeliTersebut.cekBisaBayar(Orderan);
            if (bisaBayar) {
                PembeliTersebut.setSaldo(PembeliTersebut.getSaldo() - Orderan.getTotalHarga());
            }
            
            // TODO: Jika bisa bayar, kurangi saldo pembeli
            
            // TODO: Cetak laporan pembeli i
            System.out.printf("=== Pembeli %d ===\n", i+1);
            System.out.printf("Nama: %s (Meja %d)\n", PembeliTersebut.getNamaPembeli(), PembeliTersebut.getNomorMeja());
            System.out.printf("Pesanan: %s x %d @ %.1f\n", Orderan.getNamaMakanan(), Orderan.getcountMakanan(), Orderan.getHargaSatuan());
            System.out.printf("Total: %.1f\n", Orderan.getTotalHarga());
            if (bisaBayar) {
                System.out.println("Bisa Bayar: Bisa");
            } else {
                System.out.println("Bisa Bayar: Gak Bisa");
            }
            if (bisaBayar) {
                System.out.printf("Saldo setelah bayar: %.1f\n", PembeliTersebut.getSaldo());
            }
            System.out.println();
            // HINT: Jika pembeli tidak bisa membayar, tidak perlu tampilkan saldo setelah bayar
            // HINT: Perhatikan lagi format output yang diharapkan
            
            i++;
        }

        sc.close();
    }
}
