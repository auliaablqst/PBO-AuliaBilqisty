package Jobsheet9;

public class SmartFridge extends AlatElektronik implements Audible {
    public int volume;
    public String ukuranLayar;

    @Override
    public void naikkanVolume() {
        volume += 1;
    }

    @Override 
    public void turunkanVolume() {
        volume -= 1;
    }

    @Override 
    public String getInfo() {
        return super.getInfo() + ", Ukuran Layar: " + ukuranLayar + ", Volume: " + volume;
    }
}
