package Jobsheet9;

public class Kipas extends AlatElektronik {
    public String jenis;

    @Override 
    public String getInfo() {
        return super.getInfo() + ", Jenis: " + jenis;
    }
}
