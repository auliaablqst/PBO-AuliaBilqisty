package Jobsheet4.Perpustakaan;

public class Buku {
    private String isbn;
    private String judul;
    private String penulis;

    public Buku(String isbn, String judul, String penulis) {
        this.isbn = isbn;
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getInfo() {
        return judul + " - " + penulis + " (ISBN: " + isbn + ")";
    }
}
