package repository;

import model.Prodi;

public class ProdiTbl {
    private Database db;

    public ProdiTbl(Database db) {
        this.db = db;
    }

    public void create(Prodi prodi) {
        db.tables.dataProdi.add(prodi);
        db.commit();
    }

    public Prodi getProdiById(String id) {
        for (int i = 0; i < db.tables.dataProdi.size(); i++) {
            if (db.tables.dataProdi.get(i).getId().equals(id)) {
                return db.tables.dataProdi.get(i);
            }
        }
        return null;
    }

}
