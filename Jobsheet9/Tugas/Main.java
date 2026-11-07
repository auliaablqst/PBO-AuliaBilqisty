package Jobsheet9.Tugas;

public class Main {
    public static void main(String[] args) {
        KartuKredit kartu = new KartuKredit(5000000);

        System.out.println("Kartu Kredit");
        System.out.println(kartu.getInfo());

        kartu.bayar(1000000);

        System.out.println("\nSetelah melakukan pembayaran:");
        System.out.println(kartu.getInfo());

        kartu.bayarTagihan();

        System.out.println("\nSetelah melunasi tagihan:");
        System.out.println(kartu.getInfo());

        DompetDigital dompet = new DompetDigital(2000000, "081234567890");

        System.out.println("\nDompet Digital");
        System.out.println(dompet.getInfo());

        dompet.bayar(500000);

        System.out.println("\nSetelah melakukan pembayaran:");
        System.out.println(dompet.getInfo());

        dompet.isiSaldo(1000000);

        System.out.println("\nSetelah mengisi saldo:");
        System.out.println(dompet.getInfo());
    }
}
