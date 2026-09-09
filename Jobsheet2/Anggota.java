package Jobsheet2;

public class Anggota {
    private String nomorKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String nomorKtp, String nama, int limitPeminjaman) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPinjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKtp() {
        return nomorKtp;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlahPinjaman) {
        if ((this.jumlahPinjaman + jumlahPinjaman) > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjaman += jumlahPinjaman;
        }
    }

    public void angsur(int jumlahAngsuran) {
        if (jumlahAngsuran < (0.1 * this.jumlahPinjaman)) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
        this.jumlahPinjaman -= jumlahAngsuran;
        }
    }
}
