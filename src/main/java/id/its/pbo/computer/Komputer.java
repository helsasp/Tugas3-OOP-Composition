package id.its.pbo.computer;

public class Komputer {
	
	private Processor Processor;
	private Memory Memory;
	
	//konstruktor
	
	public Komputer (Processor Processor, Memory Memory) {
		this.Processor = Processor;
		this.Memory = Memory;
	}
 
	//getter seter
	
	public Processor getProcessor() {
		return Processor;
	}
	

	public void setProcessor(Processor Processor) {
		this.Processor = Processor;
	}
	
	public Memory getMemory () {
		return Memory;
	}
	
	public void setMemory (Memory Memory) {
		this.Memory = Memory;
	}
	
	// info komputer
	public String infoKomputer () {
		return "Processor Brand: " + Processor.getBrand() + ", Kecepatan: " + Processor.getKecepatan() + " GHz" + ", Memory Kapasitas: " + Memory.getKapasitas() + " GB"+ ", Tipe: " + Memory.getTipeMemory() ;
	}
}

