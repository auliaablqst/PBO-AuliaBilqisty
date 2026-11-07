package Jobsheet9;

public class Main {
    public static void main(String[] args) {
        Kulkas kulkas1 = new Kulkas();
        kulkas1.merk = "Polytron";
        kulkas1.warna = "Silver";
        kulkas1.harga = 3500000;
        kulkas1.jumlahPintu = 2;

        TV tv1 = new TV();
        tv1.merk = "Samsung";
        tv1.warna = "Hitam";
        tv1.harga = 5000000;
        tv1.jenisLayar = "LED";
        tv1.volume = 15;
        tv1.naikkanVolume();

        System.out.println(kulkas1.getInfo());
        System.out.println(tv1.getInfo());
    }
}
