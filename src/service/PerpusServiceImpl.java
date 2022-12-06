package Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;

import Util.InputUtil;

public class PerpusServiceImpl implements PerpusService {

    private String listBuku[] = new String[5];

    private void listBuku() {
        listBuku[0] = "1 => Buku Agama";
        listBuku[1] = "2 => Buku Matematika";
        listBuku[2] = "3 => Buku Bahasa Indonesia";
        listBuku[3] = "4 => Buku Bahasa Inggris";
        listBuku[4] = "5 => Buku Ilmu Pengetahuan Alam";
    }

    @Override
    public void pinjamBuku() {
        try {
            Integer kodeBuku = InputUtil.inputInteger("Kode Buku (1-5)");
            String npm = InputUtil.inputString("NPM");
            String nama = InputUtil.inputString("Nama");
            System.out.println("");

            showPeminjam(kodeBuku, npm, nama, showCurrentDate(), getNamaBuku(kodeBuku));

        } catch (ArrayIndexOutOfBoundsException e) {
            showErrorKodeBuku();
        } catch (InputMismatchException e) {
            showErrorKodeBuku();
        }
    }

    @Override
    public void showListBuku() {
        listBuku();
        showBlankEnterSpace();
        showHeaderListBuku();

        for (int i = 0; i < listBuku.length; i++) {
            System.out.println(listBuku[i]);
        }

        showBlankEnterSpace();
    }

    private void showPeminjam(Integer kodeBuku, String npm, String nama, String tanggal, String namaBuku) {
        showHeaderPeminjam();
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("NPM : " + npm);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Nama buku yang dipinjam :" + namaBuku);
        System.out.println("Batas waktu 7 hari dari tanggal peminjaman");
        System.out.println("");
        System.out.println("** Buku harap dijaga jangan sampai rusak **");
    }

    private String showCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    private void showErrorKodeBuku() {
        System.out.println("Kode buku tidak di ketahui");
        return;
    }

    private void showHeaderListBuku() {
        System.out.println("============= Perpus Unindraku ================");
    }

    private void showHeaderPeminjam() {
        System.out.println("============= Peminjam Buku Perpustakaan ================");
    }

    private void showBlankEnterSpace() {
        System.out.println("");
    }

    private String getNamaBuku(Integer kodeBuku) {
        listBuku();
        return (listBuku[kodeBuku - 1].substring(4));
    }

}
