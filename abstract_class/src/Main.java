public class Main{
    public static void main(String[] args) {
    Pembeli pembeli01 = new Pembeli();
    pembeli01.nama = "fauzan";
    pembeli01.alamat = "Sukbir";
    pembeli01.no_hp = "082122";
    pembeli01.NamaWarung();
    System.out.println();
    pembeli01.Peraturan();
    System.out.println("===== DATA PEMBELI =====");
    System.out.println("Nama pembeli    : " + pembeli01.nama);
    System.out.println("Alamat pembeli  : " + pembeli01.alamat);
    System.out.println("NO Telp pembeli : " + pembeli01.no_hp);
    pembeli01.CaraBayar();

    Pembeli pembeli02 = new Pembeli();
    pembeli02.nama = "Aqila";
    pembeli02.alamat = "Sukpur";
    pembeli02.no_hp = "085122";
    System.out.println("========================");
    System.out.println("Nama pembeli    : " + pembeli02.nama);
    System.out.println("Alamat pembeli  : " + pembeli02.alamat);
    System.out.println("NO Telp pembeli : " + pembeli02.no_hp);
    pembeli02.CaraBayar(null);
    

    Pegawai pegawai01 =  new Pegawai();
    pegawai01.nama = "Nur";
    pegawai01.no_hp = "03122";
    pegawai01.shift = "Shift 1";
    pegawai01.JamMasuk = "6:00";
    System.out.println();
    pegawai01.Peraturan();
    System.out.println("======= DATA PEGAWAI =======");
    System.out.println("Nama Pegawai     : " + pegawai01.nama);
    System.out.println("NO Telp Pegawai  : " + pegawai01.no_hp);
    System.out.println("Shift Pegawai    : " + pegawai01.shift);
    pegawai01.Absen();


    Pegawai pegawai02 =  new Pegawai();
    pegawai02.nama = "Rachman";
    pegawai02.no_hp = "09122";
    pegawai02.shift = "Shift 2";
    pegawai02.JamMasuk = "12:00";
    System.out.println("============================");
    System.out.println("Nama Pegawai     : " + pegawai02.nama);
    System.out.println("NO Telp Pegawai  : " + pegawai02.no_hp);
    System.out.println("Shift Pegawai    : " + pegawai02.shift);
    pegawai02.Absen();

    Pegawai pegawai03 =  new Pegawai();
    pegawai03.nama = "Jons";
    pegawai03.no_hp = "01111";
    pegawai03.shift = "Shift 3";
    pegawai03.JamMasuk = "20:00";
    System.out.println("============================");
    System.out.println("Nama Pegawai     : " + pegawai03.nama);
    System.out.println("NO Telp Pegawai  : " + pegawai03.no_hp);
    System.out.println("Shift Pegawai    : " + pegawai03.shift);
    pegawai03.Absen();
    }   

}
