// Kelas Abstrak: Pembayaran

// Atribut (gunakan modifier yang hanya mengizinkan attribut dapat diakses oleh objek kelasnya dan subclassnya):
// String namaPelanggan
// double jumlah

// Method abstrak:
// double hitungTotal(); → menghitung total yang harus dibayar pelanggan.

// Method tambahan:
// String getNamaPelanggan(); → mengembalikan nilai namaPelanggan.

public abstract class Pembayaran{
    public String namaPelanggan;
    public double jumlah;

    public Pembayaran(String nama, double jumlah){
        this.namaPelanggan = nama;
        this.jumlah = jumlah;
    }

    public abstract double hitungTotal();
    public String getNamaPelanggan(){
        return namaPelanggan;
    }
}