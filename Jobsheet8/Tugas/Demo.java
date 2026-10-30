package Jobsheet8.Tugas;

public class Demo {
    public static void main(String[] args) {
        // Pegawai adalah abstract class, sehingga tidak bisa diinstansiasi:
        // Pegawai pegawai1 = new Pegawai("1", "A", 1000); // error

        // Instansiasi objek subclass Dosen
        Dosen dosen1 = new Dosen("34748964", "Revalina Putri, S.T., M.T.", 3500000, "Teknik Sipil", 12);
        System.out.println(dosen1.getInfo());
        System.out.println("Gaji       : Rp" + dosen1.tampilGaji());
        System.out.println("Prodi      : " + dosen1.tampilProgramStudi());
        dosen1.bekerja();

        // Instansiasi objek subclass Dokter
        Dokter dokter1 = new Dokter("198503102010011015", "dr. Rina Aisyah, Sp.PD", 9000000, "Penyakit Dalam", 25);
        System.out.println("\n\n" + dokter1.getInfo());
        System.out.println("Gaji       : Rp" + dokter1.tampilGaji());
        System.out.println("Spesialis  : " + dokter1.tampilSpesialis());
        dokter1.bekerja();
    }
}