package Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Util.InputUtil;

public class PerpusServiceImpl implements PerpusService {

    public String listBuku[] = new String[5];

    @Override
    public void listBuku() {
        listBuku[0] = "1 => Buku Agama";
        listBuku[1] = "2 => Buku Matematika";
        listBuku[2] = "3 => Buku Bahasa Indonesia";
        listBuku[3] = "4 => Buku Bahasa Inggris";
        listBuku[4] = "5 => Buku Ilmu Pengetahuan Alam";
    }

    @Override
    public void pinjamBuku() {
        Integer kodeBuku = InputUtil.inputInteger("Kode Buku (1-5)");

        if (kodeBuku > 5) {
            System.out.println("Kode buku tidak di ketahui");
            return;
        }

        String npm = InputUtil.inputString("NPM");
        String nama = InputUtil.inputString("Nama");

        showPeminjam(kodeBuku, npm, nama, showCurrentDate());
    }

    @Override
    public void showListBuku() {
        System.out.println("");
        System.out.println("============= Perpus Unindraku ================");
        listBuku();
        for (int i = 0; i < listBuku.length; i++) {
            System.out.println(listBuku[i]);
        }
        System.out.println("");
    }

    @Override
    public void showPeminjam(Integer kodeBuku, String npm, String nama, String tanggal) {
        System.out.println("============= Peminjam Buku Perpustakaan ================");
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("NPM : " + npm);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Nama buku yang dipinjam : " + getNamaBuku(kodeBuku));
        System.out.println("Batas waktu 7 hari dari tanggal peminjaman");
        System.out.println("");
        System.out.println("** Buku harap dijaga jangan sampai rusak **");
    }

    public static String showCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public String getNamaBuku(Integer kodeBuku) {
        listBuku();
        return (listBuku[kodeBuku - 1].substring(4));
    }

}
