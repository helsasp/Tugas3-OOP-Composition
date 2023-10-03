package id.its.pbo.electronics;

public class Produk {
	
	private String nama;
	private double harga;
	
	//konstruktor
	
	public Produk (String nama, double harga) {
		this.nama = nama;
		this.harga = harga;
	}
	
	//setter geter
	
	public String getNama () {
		return nama;
	}
	
	public void setNama (String nama) {
		this.nama = nama;
	}

	public double getHarga () {
		return harga;
	}
	
	public void setHarga (double harga) {
		this.harga = harga;
	}
}
