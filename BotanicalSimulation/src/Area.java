
public class Area {
	
	private int ownArea;
	private int ownMoney;

	public Area() {
		
		this.ownArea = 100;
		this.ownMoney = 200;
		
		System.out.println("Baþlangýç alanýnýz: " + this.ownArea);
		System.out.println("Baþlangýç paranýz: " + this.ownMoney);
	}

	public int getOwnArea() {
		return ownArea;
	}

	public void setOwnArea(int ownArea) {
		this.ownArea = ownArea;
	}

	public int getOwnMoney() {
		return ownMoney;
	}

	public void setOwnMoney(int ownMoney) {
		this.ownMoney = ownMoney;
	}
	
	public void showInfo()
	{
		System.out.println("Baþlangýç alanýnýz: " + this.ownArea);
		System.out.println("Baþlangýç paranýz: " + this.ownMoney);
	}
}
