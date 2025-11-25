public class OrderMakanan {
    private String namaMakanan;
    private int countMakanan;
    private double hargaSatuan;

    /**
     * Konstruktor OrderMakanan
     * @param nama
     * @param count
     * @param harga
     */
    public OrderMakanan(String nama, int count, double harga) {
        namaMakanan= nama;
        countMakanan= count;
        hargaSatuan=harga;
    }

    /**
     * getNamaMakanan
     * @return namaMakanan
     */
    public String getNamaMakanan() {
        return namaMakanan;
    }

    /**
     * setNamaMakanan
     * @param namaBaru
     */
    public void setNamaMakanan(String namaBaru) {
        namaMakanan=namaBaru;
    }

    /**
     * getcountMakanan
     * @return countMakanan
     */
    public int getcountMakanan() {
        return countMakanan;
    }

    /**
     * setcountMakanan
     * @param countBaru
     */
    public void setcountMakanan(int countBaru) {
        countMakanan=countBaru;
    }

    /**
     * getHargaSatuan
     * @return hargaSatuan
     */
    public double getHargaSatuan() {
        return hargaSatuan;
    }

    /**
     * setHargaSatuan
     * @param hargaBaru
     */
    public void setHargaSatuan(double hargaBaru) {
        hargaSatuan=hargaBaru;
    }

    /**
     * increasecountMakanan
     * Menambahkan countMakanan pesanan
     * @param tambahan
     */
    public void increasecountMakanan(int tambahan) {
        if (tambahan>0){
            countMakanan= countMakanan+tambahan;
        }
    }

    /**
     * decreasecountMakanan
     * Mengurangi countMakanan pesanan
     * @param pengurangan
     */
    public void decreasecountMakanan(int pengurangan) {
        if (pengurangan>0){
            countMakanan= countMakanan-pengurangan;
        }
    }

    /**
     * getTotalHarga
     * Menghitung total harga pesanan
     * @return totalHarga
     */
    public double getTotalHarga() {
        return countMakanan * hargaSatuan;
    }
}
