package Jobsheet8.Tugas;

public class Dokter extends Pegawai {
    public String spesialis;
    public int jumlahPasien;

    public Dokter(String nip, String nama, double gaji, String spesialis, int jumlahPasien) {
        super(nip, nama, gaji);
        this.spesialis = spesialis;
        this.jumlahPasien = jumlahPasien;
    }

    public String tampilSpesialis() {
        return spesialis;
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " adalah dokter dengan spesialis " + spesialis);
        System.out.println("Jumlah pasien: " + jumlahPasien);
    }

    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Spesialis  : " + spesialis + "\n";
        info += "Pasien     : " + jumlahPasien + "\n";

        return info;
    }
}