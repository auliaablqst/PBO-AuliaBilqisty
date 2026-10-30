package Jobsheet7.Tugas;

public class Dosen extends Pegawai {
    public String programStudi;

    public Dosen() {

    }

    public Dosen(String nip, String nama, double gaji, String programStudi) {
        
        //super(nip, nama, gaji);
        this.programStudi = programStudi;
    }

    public String tampilProgramStudi() {
        return programStudi;
    }

    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Prodi      : " + programStudi + "\n";
        
        return info;
    }
}