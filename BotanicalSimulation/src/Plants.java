

public class Plants implements IMarket{
	
	private String PlantName;
	
	protected int cost;
	protected int needArea;
	protected boolean peckState;
	protected int count;
	protected boolean irrigationState;
	protected boolean fortilizerState;
	protected int fortilizerCost;
	protected int irrigationCost;
	protected int adultPlantCount;
	protected int sellPrice;
	protected Long growUptime;
	
	public Plants(String plantName) {
		
		this.PlantName = plantName;
		this.cost = cost;
		this.needArea = needArea;
		this.peckState = false;
		this.count = 0;
		this.irrigationState = false;
		this.fortilizerState = false;
		this.fortilizerCost = fortilizerCost;
		this.irrigationCost = irrigationCost;
		this.adultPlantCount = 0;
		this.sellPrice = sellPrice;
		this.growUptime = growUptime;
		
		
	}

	public void showInfos(){
		
		System.out.println("Bitki �zellikleri");
	}
	
	public String getClassName()
	{
		return "Plants";
	}

	public boolean getPeckState() {
		return peckState;
	}

	public void setPeckState(boolean peckState) {
		this.peckState = peckState;
	}

	public int getCost() {
		return cost;
	}

	public int getNeedArea() {
		return needArea;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public int getAdultPlantCount() {
		return adultPlantCount;
	}

	public void setAdultPlantCount(int adultPlantCount) {
		this.adultPlantCount = adultPlantCount;
	}

	@Override
	public void sellPlant(Plants plant, Area area) 
	{
		if(plant.adultPlantCount > 0)
		{
			area.setOwnMoney(area.getOwnMoney() + plant.sellPrice);
			plant.adultPlantCount -= 1;
			area.setOwnArea(area.getOwnArea() + plant.getNeedArea());

		}
		
		else
		{
			System.out.println("Bu i�em i�in yeterli mevcut yeti�kin bitkiniz bulunmamaktad�r.");
		}
	}
	
	@Override
	public void buyPlant(Plants plant, Area area)
	{
		if(area.getOwnArea() >= plant.needArea)
		{
			if(area.getOwnMoney() >= plant.cost)
			{
				area.setOwnMoney(area.getOwnMoney() - plant.cost);
				plant.count += 1;
			}
			
			else
			{
				System.out.println("Bu bitkiyi almak i�in yeterli paran�z bulunmamaktad�r.");
				System.out.println("Mevcut bitkilerinizden birini satmay� deneyiniz!");
			}
		}
		
		else
		{
			System.out.println("Yeterli mevcut alan�n�z bulunmamaktad�r.");
			System.out.println("Mevcut bitkilerinizi satmay� deneyiniz.");
		}
	}
}
