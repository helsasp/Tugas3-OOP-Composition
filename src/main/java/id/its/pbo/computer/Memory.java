package id.its.pbo.computer;

public class Memory {
	private int kapasitas;
	private String tipeMemory;
	
	//konstruktor
	
	public Memory(int kapasitas, String tipeMemory) {
		
		this.kapasitas = kapasitas;
		this.tipeMemory = tipeMemory;
		
	}

	//getter setter
	
	public int getKapasitas () {
		return kapasitas;
	}
	
	public void setKapasitas (int kapasitas) {
		this.kapasitas = kapasitas;
	}
	
	public String getTipeMemory () {
		return tipeMemory;
	}
	
	public void setTipeMemory (String tipeMemory) {
		this.tipeMemory = tipeMemory;
	}
}
