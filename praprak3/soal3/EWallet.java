// Subclass EWallet
// Meng-override method hitungTotal().
// Rumus: jumlah + (jumlah * 0.01).

public class EWallet extends Pembayaran{
    public EWallet(String nama, double jumlah){
        super(nama,jumlah);
    }    
    @Override
    public double hitungTotal(){
        jumlah += (jumlah*0.01);
        return jumlah;
    }
}