// Subclass COD (Cash on Delivery)
// Meng-override method hitungTotal().
// Rumus: jumlah + 5000.

public class COD extends Pembayaran{
    public COD(String nama, double jumlah){
        super(nama,jumlah);
    }
        
    @Override
    public double hitungTotal(){
        jumlah += 5000;
        return jumlah;
    }
}