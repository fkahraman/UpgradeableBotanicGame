
public class Staff {
	
	private String staffName;

	public Staff(String staffName) {
		
		this.staffName = staffName;
	}
	
	public void Peck(Plants plant, Area area)
	{	
		
		if(area.getOwnArea() >= plant.getNeedArea()) //bo� olan varsa
		{
			
			if(plant.getCount() > 0)	// elimde bitki varsa
			{
				plant.setPeckState(true);	//dikildi
				area.setOwnArea(area.getOwnArea() - plant.getNeedArea());
				plant.count -= 1;
				
				plant.growUptime = (System.currentTimeMillis() /1000);
				
			}
			
			else
				System.out.println("Elinizde yeterli say�da " + plant.getClassName() + "bitkisinden bulunmamaktad�r");
		}
		
		else
		{
			
			System.out.println("Bu i�lem i�in yeterli mevcut alan�n�z yok.");
			System.out.println("Yer a�mak i�in mevcut bitkilerinizi sat�n.");
			
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
			System.out.println("Bu i�lem i�in yeterli paran�z bulunmamaktad�r.");
			System.out.println("Para kazanmak i�in mevcut bitkilerinizi sat�n.");
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
			System.out.println("Bu i�lem i�in yeterli paran�z bulunmamaktad�r.");
			System.out.println("Para kazanmak i�in mevcut bitkilerinizi sat�n.");
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
			System.out.println("Bitkiyi toplamaya kalan s�re: " + now(plant.growUptime) + " sn.");
		}
	}
}
