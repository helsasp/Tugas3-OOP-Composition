package id.its.pbo.electronics;

import java.util.List;
import java.util.ArrayList;

public class KeranjangBelanja {
	
	//list daftar belanja
	private List <ItemBelanja> daftarBelanja;
	
	//create array
	
	public KeranjangBelanja () {
		daftarBelanja = new ArrayList<>();
	}
	
	//add 
	public void tambahProduk (Produk produk, int kuantitas) {
		
		ItemBelanja itembelanja = new ItemBelanja(produk,kuantitas);
		daftarBelanja.add(itembelanja);
	}
	
	//total harga
	
	public double hitungTotalBelanja () {
		double ttl = 0;
		
		for(ItemBelanja item : daftarBelanja) {
			ttl += item.hitungTotal();
		}
		return ttl;
	}
	
	

}
