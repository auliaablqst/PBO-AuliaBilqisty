package Jobsheet9;

public abstract class AlatElektronik {
    public double harga;
    public String merk;
    public String warna;

    public String getInfo() {
        return "Merk: " + merk + ", Warna: " + warna + ", Harga: " + harga;
    }
}
