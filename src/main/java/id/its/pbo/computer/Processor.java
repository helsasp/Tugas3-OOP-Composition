package id.its.pbo.computer;

public class Processor {
	
	private String brand;
	private double kecepatan;
	
	//konstruktor
	
	public Processor (String brand, double kecepatan) {
		this.brand = brand;
		this.kecepatan = kecepatan;
	}
	
	//getter setter 
	
	public String getBrand () {
		return brand;
	}
	
	public void setBrand (String brand) {
		this.brand = brand;
	}
	
	public double getKecepatan () {
		return kecepatan;
	}

	public void setKecepatan (double kecepatan) {
		this.kecepatan = kecepatan;
	}
	
	
}
