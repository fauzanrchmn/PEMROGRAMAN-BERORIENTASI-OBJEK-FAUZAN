public class Pegawai extends Warung{

    @Override
    public void Peraturan() {
        System.out.println("""
            ====== Peraturan Pegawai War GOD ======
                1. Dateng tepat waktu sesuai dengan shift
                2. Menerapkan 5S
                3. Memasak dengan sepenuh hati
                        """);
    }

    @Override
    public void CaraBayar() {
    }

    @Override
    public void Absen() {
        System.out.println("Pegawai Absen pada jam "+ JamMasuk);
    }
    
}
