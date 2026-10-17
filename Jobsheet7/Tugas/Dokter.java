package Jobsheet7.Tugas;

public class Dokter extends Pegawai {
    public String spesialis;

    // Constructor default tanpa parameter
    public Dokter() {

    }

    // Constructor berparameter
    public Dokter(String nip, String nama, double gaji, String spesialis) {
        super(nip, nama, gaji);
        this.spesialis = spesialis;
    }

    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Spesialis  : " + spesialis + "\n";
        
        return info;
    }
}