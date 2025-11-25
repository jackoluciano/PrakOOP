public class Pembeli {
    private String namaPembeli;
    private int nomorMeja;
    private double saldoPembeli;

    /**
     * Konstruktor Pembeli
     * @param nama
     * @param nomor
     * @param saldo
     */
    public Pembeli(String nama, int nomor, double saldo) {
        namaPembeli=nama;
        nomorMeja=nomor;
        saldoPembeli=saldo;
    }

    /**
     * getNamaPembeli
     * @return namaPembeli
     */
    public String getNamaPembeli() {
        return namaPembeli;
    }

    /**
     * setNamaPembeli
     * @param namaBaru
     * @return void
     */
    public void setNamaPembeli(String namaBaru) {
        namaPembeli=namaBaru;
    }

    /**
     * getNomorMeja
     * @return nomorMeja
     */
    public int getNomorMeja() {
        return nomorMeja;
    }

    /**
     * setNomorMeja
     * @param nomorBaru
     * @return void
     */
    public void setNomorMeja(int nomorBaru) {
        nomorMeja=nomorBaru;
    }

    /**
     * getSaldo
     * @return saldoPembeli
     */
    public double getSaldo() {
        return saldoPembeli;
    }

    /**
     * setSaldo
     * @param saldoBaru
     * @return void
     */
    public void setSaldo(double saldoBaru) {
        saldoPembeli=saldoBaru;
    }

    /**
     * cekBisaBayar
     * Mengecek apakah saldo cukup untuk membayar total harga OrderMakanan
     * @param order
     * @return true jika saldo mencukupi untuk membayar total harga OrderMakanan, selain itu false
     */
    public boolean cekBisaBayar(OrderMakanan order) {
        // TODO: implementasi perbandingan saldo vs order.getTotalHarga()
        if (saldoPembeli >= order.getTotalHarga()){
            return true;
        } else{
            return false;
        }
    }
}
