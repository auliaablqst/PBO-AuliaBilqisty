package Jobsheet4.Perpustakaan;

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private ArrayList<Peminjaman> riwayatPeminjaman;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        riwayatPeminjaman = new ArrayList<Peminjaman>();
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahPeminjaman(Peminjaman peminjaman) {
        this.riwayatPeminjaman.add(peminjaman);
    }

    public ArrayList<Peminjaman> getRiwayatPeminjaman() {
        return riwayatPeminjaman;
    }

    public String getInfo() {
        String info = "";
        info += "NIM  : " + nim + "\n";
        info += "Nama : " + nama + "\n";
        if (!riwayatPeminjaman.isEmpty()) {
            info += "\nRiwayat Peminjaman:\n";
            for (Peminjaman peminjaman : riwayatPeminjaman) {
                info += peminjaman.getInfo();
            }
        } else {
            info += "Belum ada riwayat peminjaman.\n";
        }

        info += "\n";
        return info;
    }
}
