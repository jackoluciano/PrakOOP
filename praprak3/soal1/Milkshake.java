/**
 * Milkshake.java
 * 
 */
public class Milkshake extends MenuItem {
    public enum Ukuran { SMALL, MEDIUM, LARGE }

    private String jenis;
    private boolean iceCreamTopping;
    private Ukuran ukuran;

    /**
     * Constructor Milkshake.
     *
     * For your exploration:
     * - Untuk enum, jangan lupa gunakan EnumName.VALUE
     * - Pastikan input jenis milkshake bersih dengan menggunakan .trim()
     * - Pastikan nama jenis milkshake tidak null/kosong, jika null/kosong, set jenis menjadi "Original"
     *
     * @param volumeMl        volume minuman dalam ml
     * @param jenis           jenis milkshake (contoh: "Strawberry")
     * @param iceCreamTopping true jika ada topping es krim tambahan
     * @param ukuran          ukuran milkshake (SMALL, MEDIUM, LARGE)
     */
    public Milkshake(int volumeMl, String jenis, boolean iceCreamTopping, Ukuran ukuran) {
        // TODO: panggil constructor superclass (super) dengan namaMenu="Milkshake",
        super("Milkshake", volumeMl, Unit.ML, Kategori.MINUMAN);
        //       quantity=volumeMl, unit=Unit.ML, kategori=Kategori.
        setJenis(jenis);
        this.iceCreamTopping = iceCreamTopping;
        this.ukuran = ukuran;
        // TODO: simpan parameter jenis, iceCreamTopping, ukuran ke atribut

    }

    /**
     * Getter untuk jenis milkshake.
     *
     * @return jenis milkshake
     */
    public String getJenis() { 
        return this.jenis;
    }

    /**
     * Setter untuk jenis milkshake.
     * 
     * - Pastikan input jenis milkshake bersih dengan menggunakan .trim()
     * - Pastikan nama jenis milkshake tidak null/kosong, jika null/kosong, set jenis menjadi "Original"
     *
     * @param jenis jenis milkshake baru
     */
    public void setJenis(String jenis) {
        if (jenis!=null && !jenis.trim().isEmpty()){
            this.jenis = jenis.trim();
        } else{
            this.jenis = "Original";
        }
    }

    /**
     * Getter untuk iceCreamTopping.
     *
     * @return iceCreamTopping
     */
    public boolean hasIceCreamTopping() { 
        return this.iceCreamTopping;
    }

    /**
     * Setter untuk status topping es krim.
     * 
     * @param iceCreamTopping true jika ada topping
     */
    public void setIceCreamTopping(boolean iceCreamTopping) {
        this.iceCreamTopping = iceCreamTopping;
    }

    /**
     * Getter untuk ukuran milkshake.
     *
     * @return ukuran milkshake
     */
    public Ukuran getUkuran() { 
        return this.ukuran;
    }
    
    /**
     * Setter untuk ukuran milkshake.
     *
     * @param ukuran ukuran milkshake baru
     */
    public void setUkuran(Ukuran ukuran) {
        this.ukuran = ukuran;
    }

    /**
     * Override basePrice() dari MenuItem.
     * Aturan harga dasar:
     * - SMALL  = 10000
     * - MEDIUM = 13000
     * - LARGE  = 15000
     * Tambahan:
     * - Jika iceCreamTopping = true, tambahkan 5000
     *
     * @return harga dasar milkshake
     */
    @Override
    public int basePrice() {
        int hargadasar = 0;
        if (this.iceCreamTopping){
            hargadasar += 5000;
        }
        if (this.ukuran == Ukuran.SMALL){
            hargadasar += 10000;
        } else if (this.ukuran == Ukuran.MEDIUM){
            hargadasar += 13000;
        } else {
            hargadasar += 15000;
        }
        return hargadasar;
    }

    /**
     * Override label() dari MenuItem.
     * Format contoh: 
     * - "Milkshake Strawberry [MEDIUM] 250ml" (jika iceCreamTopping = false)
     * - "Milkshake Strawberry Float [MEDIUM] 250ml" (jika iceCreamTopping = true)
     *
     * @return label string untuk milkshake
     */
    @Override
    public String label() {
        String toppingLabel = iceCreamTopping ? " Float" : "";
        return getNamaMenu() + " " + jenis + toppingLabel
               + " [" + ukuran + "] "
               + getQuantity() + "ml";
    }
}