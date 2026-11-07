package Jobsheet9;

public class Kulkas extends AlatElektronik {
    public int jumlahPintu;

    @Override
    public String getInfo() {
        return super.getInfo() + ", Jumlah Pintu: " + jumlahPintu;
    }
}
