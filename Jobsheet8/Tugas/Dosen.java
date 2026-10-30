package Jobsheet8.Tugas;

public class Dosen extends Pegawai {
    public String programStudi;
    public int jumlahSks;

    public Dosen(String nip, String nama, double gaji, String programStudi, int jumlahSks) {
        super(nip, nama, gaji);
        this.programStudi = programStudi;
        this.jumlahSks = jumlahSks;
    }

    public String tampilProgramStudi() {
        return programStudi;
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " mengajar mahasiswa di Program Studi " + programStudi);
        System.out.println("Beban mengajar: " + jumlahSks + " SKS");
    }

    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Prodi      : " + programStudi + "\n";
        info += "Jumlah SKS : " + jumlahSks + "\n";

        return info;
    }
}