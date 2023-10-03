package id.its.pbo.electronics;

public class TokoElektronikProgram {
	
	public static void main (String[] args) {
		
		//create objek ke keranjang
		
		Produk produk1 = new Produk ("Snack",15.75);
		Produk produk2 = new Produk ("HP", 123.67);
		Produk produk3 = new Produk ("Tas", 75.24);
		
		KeranjangBelanja keranjang = new KeranjangBelanja();
		
		keranjang.tambahProduk(produk1,3);
		keranjang.tambahProduk(produk2, 5);
		keranjang.tambahProduk(produk3, 2);
		
		System.out.println("Total Harga Belanja: " + keranjang.hitungTotalBelanja());
		
	}

}
