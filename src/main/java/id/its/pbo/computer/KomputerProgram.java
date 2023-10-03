package id.its.pbo.computer;

public class KomputerProgram {
	public static void main (String [] args) {
		
		//create objek
		Processor processor1 = new Processor ("Apple", 1.4);
		Memory memory1 = new Memory (64,"DDR5");
		Komputer komputer1 = new Komputer (processor1, memory1);
		
		System.out.println(komputer1.infoKomputer());
	}

}
