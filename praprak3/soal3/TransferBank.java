// Subclass TransferBank
// Meng-override method hitungTotal().
// Rumus: jumlah + 4000.

public class TransferBank extends Pembayaran{
    public TransferBank(String nama, double jumlah){
        super(nama,jumlah);
    }        
    @Override
    public double hitungTotal(){
        jumlah += 4000;
        return jumlah;
    }
}