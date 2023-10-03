package id.its.pbo.store;

import java.util.List;
import java.util.ArrayList;

public class TokoBuku {
	
	//list daftar buku
	private List<Buku> daftarBuku;

	//create array
	public TokoBuku () {
		daftarBuku = new ArrayList<>();
	}
	
	//add
	
	public void tambahBuku (Buku bukuAdd){
		daftarBuku.add(bukuAdd);
	}
	
	//remove

	public void hapusBuku (Buku bukuHapus) {
		daftarBuku.remove(bukuHapus);
	}
	
	//cari
	
	public Buku cariBuku (String isbn) {
		for(Buku bukucari : daftarBuku) {
			if(bukucari.getIsbn().equals(isbn)) { // isbn ketemu
				return bukucari; 
			}
		}
		return null; // tidak ketemu
	}
	
	//print daftar
	
	public List <Buku> getDaftarBuku(){
		return daftarBuku;
	}
}