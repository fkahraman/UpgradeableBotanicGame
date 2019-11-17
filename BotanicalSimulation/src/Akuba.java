
public class Akuba extends Plants{
	
	public Akuba(String plantName) {
		super(plantName);
		
		this.cost = 100;
		this.needArea = 2;
		this.irrigationCost = 20;
		this.fortilizerCost = 40;
		this.sellPrice = 250;
	}

	@Override
	public void showInfos() {
		
		System.out.println("\nAkuba Bitkisi");
		System.out.println("Fiyat: " + this.cost);
		System.out.println("Gerekli Alan: " + this.needArea);
	}

	@Override
	public String getClassName() {
			
		return  ("Akuba");
	}	
}
