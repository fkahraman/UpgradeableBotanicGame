
public class Cycas extends Plants{
	
	
	public Cycas(String plantName) {
		super(plantName);
		
		this.cost = 200;
		this.needArea = 3;
		this.irrigationCost = 30;
		this.fortilizerCost = 60;
		this.sellPrice = 500;
	}

	@Override
	public void showInfos() {
		
		System.out.println("\nJapon Sikasý");
		System.out.println("Fiyat: " + this.cost);
		System.out.println("Gerekli Alan: " + this.needArea);
	}

	@Override
	public String getClassName() {
		
		return "Cycas";
	}	
}
