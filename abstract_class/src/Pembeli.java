public class Pembeli extends Warung {

    @Override
    public void Peraturan() {
        System.out.println("""
                ====== Peraturan Pembeli War GOD ======
                1.Dilarang mencuri apa bila ketahuan 
                akan diproses oleh komdis
                2.Diharapkan ngantri
                """);
    }

    @Override
    public void CaraBayar() {
        System.out.println("Pembayaran menggunakan Cash");
    }

    void CaraBayar(String Bayar){
        System.out.println("Pembayaran Menggunakan Qris");
    }
    
    @Override
    public void Absen() {}
    
}
