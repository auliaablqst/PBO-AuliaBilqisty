package Jobsheet7.Tugas;

public class Demo {
    public static void main(String[] args) {
        // Instansiasi objek superclass Pegawai
        Pegawai pegawai1 = new Pegawai("34756784", "Arman Maulana, S.T., M.T. ", 3500000);
        System.out.println(pegawai1.getInfo());

        // Instansiasi objek subclass Dosen
        Dosen dosen1 = new Dosen("34748964", "Revalina Putri, S.T., M.T. ", 3500000, "Teknik Sipil");
        System.out.println(dosen1.getInfo());

        // Instansiasi objek subclass Dokter
        Dokter dokter1 = new Dokter("198503102010011015", "dr. Rina Aisyah, Sp.PD", 9000000, "Penyakit Dalam");
        System.out.println(dokter1.getInfo());
    }
}
