package Jobsheet7.Tugas;

public class Dosen extends Pegawai {
    public String programStudi;

    // Constructor default tanpa parameter
    public Dosen() {

    }

    // Constructor berparameter
    public Dosen(String nip, String nama, double gaji, String programStudi) {
        super(nip, nama, gaji);
        this.programStudi = programStudi;
    }

    public String tampilProgramStudi() {
        return this.programStudi;
    }

    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Prodi      : " + this.programStudi + "\n";
        return info;
    }
}