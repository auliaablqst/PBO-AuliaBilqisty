package Jobsheet4.Perpustakaan;

import java.time.LocalDate;
import java.util.ArrayList;

public class Peminjaman {
    private String kodePinjam;
    private LocalDate tanggalPinjam;
    private ArrayList<Buku> daftarBuku;

    public Peminjaman(String kodePinjam, LocalDate tanggalPinjam) {
        this.kodePinjam = kodePinjam;
        this.tanggalPinjam = tanggalPinjam;
        this.daftarBuku = new ArrayList<>();
    }

    public String getKodePinjam() {
        return kodePinjam;
    }

    public void setKodePinjam(String kodePinjam) {
        this.kodePinjam = kodePinjam;
    }

    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(LocalDate tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public void tambahBuku(Buku buku) {
        this.daftarBuku.add(buku);
    }

    public ArrayList<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public String getInfo() {
        String info = "";
        info += "\nKode Pinjam  : " + kodePinjam + "\n";
        info += "Tanggal      : " + tanggalPinjam + "\n";
        info += "Daftar Buku  :\n";
        for (Buku buku : daftarBuku) {
            info += " - " + buku.getInfo() + "\n";
        }
        return info;
    }
}
