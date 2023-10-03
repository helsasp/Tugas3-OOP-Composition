package id.its.pbo.electronics;

public class ItemBelanja {
	
	private Produk produk;
	private int kuantitas;
	
	//konstruktor
	public ItemBelanja (Produk produk, int kuantitas) {
		this.produk = produk;
		this.kuantitas = kuantitas;
	}
	
	//total harga
	
	public double hitungTotal () {
		return (produk.getHarga()* kuantitas);
	}
	
	

}
