package id.its.pbo.store;

public class Buku {
    private String isbn;
    private String judul;
    private double harga;
    
    //konstruktor

    public Buku(String isbn, String judul, double harga) {
        this.isbn = isbn;
        this.judul = judul;
        this.harga = harga;
    }

    //setter getter

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

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}