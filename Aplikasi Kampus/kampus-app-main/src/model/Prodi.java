package model;

public class Prodi {
    private String id;
    public String getId() {
        return id;
    }

    private String nama;
    public String getNama() {
        return nama;
    }
    
    public Prodi(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }
}
