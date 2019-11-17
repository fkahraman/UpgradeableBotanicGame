
public class Cocos_Palm extends Plants
{
	
	public Cocos_Palm(String plantName) {
		super(plantName);

		this.cost = 1000;
		this.needArea = 10;
		this.irrigationCost = 100;
		this.fortilizerCost = 200;
		this.sellPrice = 2500;
		
	}

	@Override
	public void showInfos() {
		
		System.out.println("\nKokonat Palmiyesi");
		System.out.println("Fiyat: " + this.cost);
		System.out.println("Gerekli Alan: " + this.needArea);
	}

	@Override
	public String getClassName() {
		
		return "Cocos Palm";
	}
}
