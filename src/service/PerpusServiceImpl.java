package service;

public class PerpusServiceImpl implements PerpusService {

    @Override
    public void pinjamBuku(String pinjam) {

    }

    @Override
    public void showListBuku() {

        String listBuku[] = new String[5];

        listBuku[0] = "1. Buku Agama";
        listBuku[1] = "2. Buku Matematika";
        listBuku[2] = "3. Buku Bahasa Indonesia";
        listBuku[3] = "4. Buku Bahasa Inggris";
        listBuku[4] = "5. Buku Ilmu Pengetahuan Alam";
        
        System.out.println("");
        System.out.println("============= Perpus Unindraku ================");
        for (int i = 0; i < listBuku.length; i++) {
            System.out.println(listBuku[i]);
        }
        System.out.println("");
    }
}
