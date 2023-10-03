package id.its.pbo.store;


import java.util.List;

public class TokoBukuProgram {
	public static void main (String [] args) {
		
		TokoBuku tokobuku = new TokoBuku();
		
		//create objek
		Buku buku1 = new Buku ("123-456-643", "It Ends With Us", 12.75);
		Buku buku2 = new Buku ("932-234-222", "Learn Programming with Javascript", 250.34);
		
		tokobuku.tambahBuku(buku1);
		tokobuku.tambahBuku(buku2);
		
		// daftar buku
		List <Buku> daftarBuku = tokobuku.getDaftarBuku();
		
		System.out.println("Daftar Buku :");
		
		for(Buku buku : daftarBuku) {
		System.out.println("ISBN : " + buku.getIsbn());
		System.out.println("Judul : " +buku.getJudul());
		System.out.println("Harga : " +buku.getHarga());
		}
		
		tokobuku.hapusBuku(buku2);
		System.out.println("\n");
		
		//daftar buku setelah ada yg dihapus
		
		System.out.println("Daftar Buku Setelah Penghapusan :");
		for(Buku buku : daftarBuku) {
		
		System.out.println("ISBN : " + buku.getIsbn());
		System.out.println("Judul : " +buku.getJudul());
		System.out.println("Harga : " +buku.getHarga());
		}
		
		
		
		
	
	}
}
		

	
