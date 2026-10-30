package Jobsheet7.Tugas;

public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    public Pegawai() {

    }

    public Pegawai(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getInfo() {
        String info = "";
        info += "NIP        : " + nip + "\n";
        info += "Nama       : " + nama + "\n";
        info += "Gaji       : Rp" + gaji + "\n";
        
        return info;
    }

    public double tampilGaji() {
        return gaji;
    }
}