package Jobsheet9.Tugas;

public class KartuKredit implements MetodePembayaran {
    private double limitKredit;
    private double tagihan;

    public KartuKredit(double limitKredit) {
        this.limitKredit = limitKredit;
        this.tagihan = 0;
    }

    @Override 
    public boolean bayar(double jumlah) {
        if (tagihan + jumlah <= limitKredit) {
            tagihan += jumlah;
            System.out.println("Pembayaran kartu kredit berhasil.");
            return true;
        } else {
            System.err.println("Pembayaran gagal. Limit kredit tidak mencukupi.");
            return false;
        }
    }

    public void bayarTagihan() {
        if (tagihan > 0) {
            System.out.println("Tagihan sebesar " + tagihan + " telah dilunasi.");
            tagihan = 0;
        } else {
            System.out.println("Tidak ada tagihan yang perlu dibayar.");
        }
    }

    public String getInfo() {
        return "Limit Kredit  : Rp" + limitKredit + 
               "\nTagihan       : Rp" + tagihan;
    }
}
