public abstract class Warung {
    public String nama;
    public String no_hp;
    public String alamat;
    public String shift;
    public String JamMasuk;

    void NamaWarung(){
        System.out.println("====== SELAMAT DATANG DI WARUNG PARA DEWA ======");
    }
    public abstract void Peraturan();

    public abstract void CaraBayar();

    public abstract void Absen();
}
