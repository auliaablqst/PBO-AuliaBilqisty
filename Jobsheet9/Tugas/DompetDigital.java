package Jobsheet9.Tugas;

public class DompetDigital implements MetodePembayaran {
    private double saldo;
    private String nomorHp;

    public DompetDigital(double saldo, String nomorHp) {
        this.saldo = saldo;
        this.nomorHp = nomorHp;
    }

    @Override 
    public boolean bayar(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Pembayaran dompet digital berhasil.");
            return true;
        } else {
            System.out.println("Pembayaran gagal. Saldo tidak mencukupi.");
            return false;
        }
    }

    public void isiSaldo(double jumlah) {
        saldo += jumlah;
        System.out.println("Saldo bertambah " + jumlah + ", saldo sekarang: " + saldo);
    }

    public String getInfo() {
        return "Nomor HP  : " + nomorHp +
               "\nSaldo     : Rp" + saldo;
    }
}
