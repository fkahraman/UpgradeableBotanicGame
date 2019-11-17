
public class Staff {
	
	private String staffName;

	public Staff(String staffName) {
		
		this.staffName = staffName;
	}
	
	public void Peck(Plants plant, Area area)
	{	
		
		if(area.getOwnArea() >= plant.getNeedArea()) //boþ olan varsa
		{
			
			if(plant.getCount() > 0)	// elimde bitki varsa
			{
				plant.setPeckState(true);	//dikildi
				area.setOwnArea(area.getOwnArea() - plant.getNeedArea());
				plant.count -= 1;
				
				plant.growUptime = (System.currentTimeMillis() /1000);
				
			}
			
			else
				System.out.println("Elinizde yeterli sayýda " + plant.getClassName() + "bitkisinden bulunmamaktadýr");
		}
		
		else
		{
			
			System.out.println("Bu iþlem için yeterli mevcut alanýnýz yok.");
			System.out.println("Yer açmak için mevcut bitkilerinizi satýn.");
			
		}	
	}
	
	public void fortilizer(Plants plant, Area area)
	{
		if(area.getOwnMoney() >= plant.fortilizerCost)
		{
			plant.fortilizerState = true;
			area.setOwnMoney(area.getOwnMoney() - plant.fortilizerCost);
		}
		
		else
		{
			System.out.println("Bu iþlem için yeterli paranýz bulunmamaktadýr.");
			System.out.println("Para kazanmak için mevcut bitkilerinizi satýn.");
		}
	}
	
	public void irrigation(Plants plant, Area area)
	{
		if(area.getOwnMoney() >= plant.irrigationCost)
		{
			plant.irrigationState = true;
			area.setOwnMoney(area.getOwnMoney() - plant.irrigationCost);
		}
		
		else
		{
			System.out.println("Bu iþlem için yeterli paranýz bulunmamaktadýr.");
			System.out.println("Para kazanmak için mevcut bitkilerinizi satýn.");
		}
	}
	
	public long now(long lastTime)
	{
		long newTime = (System.currentTimeMillis() /1000);
		return (newTime - lastTime);
		
	}
	
	public void collection(Plants plant, Area area)
	{
		if(now(plant.growUptime) >= 10)
		{
			area.setOwnArea(area.getOwnArea() + plant.needArea);
			plant.adultPlantCount += 1;
		}
		
		else
		{
			System.out.println("Bitkiyi toplamaya kalan süre: " + now(plant.growUptime) + " sn.");
		}
	}
}
