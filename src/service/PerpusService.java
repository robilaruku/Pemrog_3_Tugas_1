package service;

public interface PerpusService {

    void listBuku();

    void showListBuku();

    void pinjamBuku();

    void showPeminjam(Integer kodeBuku, String npm, String nama, String tanggal);
}