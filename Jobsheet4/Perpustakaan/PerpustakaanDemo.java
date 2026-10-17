package Jobsheet4.Perpustakaan;

import java.time.LocalDate;

public class PerpustakaanDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku("978-602-291-662-8", "Laskar Pelangi", "Andrea Hirata");
        Buku buku2 = new Buku("978-602-412-518-9", "Filosofi Teras", "Henry Manampiring");
        Buku buku3 = new Buku("978-0-735-21129-2", "Atomic Habits", "James Clear");

        buku1.setJudul("Harry Potter");
        System.out.println(buku1.getJudul());

        Mahasiswa mhs1 = new Mahasiswa("254107060103", "Aulia Bilqisty");

        Peminjaman pinjam1 = new Peminjaman("PJ01", LocalDate.of(2026, 5, 10));
        pinjam1.tambahBuku(buku1);
        pinjam1.tambahBuku(buku2);

        Peminjaman pinjam2 = new Peminjaman("PJ002", LocalDate.of(2026, 4, 5));
        pinjam2.tambahBuku(buku3);
 
        mhs1.tambahPeminjaman(pinjam1);
        mhs1.tambahPeminjaman(pinjam2);
 
        System.out.println(mhs1.getInfo());
 
        Mahasiswa mhs2 = new Mahasiswa("2541070060199", "Budi Hartono");
        System.out.println(mhs2.getInfo());
    }
}
