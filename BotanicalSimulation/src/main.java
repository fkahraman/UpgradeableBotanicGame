
import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class main {

	public static void main(String[] args){
		
		boolean theGame = true;
		
		String message = "Botanik Sim�lasyonuna ho�geldiniz!\n\n"
				+ "Ba�lang�� paran�z ve kullan�m alan�n�z a�a��da verilmi�tir.\n"
				+ "Bu sim�lasyonda bitki sat�n alabilir yeti�tirebilr ve daha sonras�nda satabilirsiniz.\n"
				+ "Bitkilerin b�y�me s�releri 10 saniyedir.\n"
				+ "�yi e�lenceler\n"
				+ "\nauthor: FAT�H KAHRAMAN\n";
		
		String devoloperMessage = "	\nGeli�tirilebilirlik a��s�nda SULAMA ve G�BRELEME i�lemleri oyuna dahil edilmemi� olup\n"
				+ "fonksiyonlar�na kod k�sm�ndan ula�abilirsiniz.\n"
				+ "Siz de oyuna kendi bitki t�rlerinizi ekleyebilirsiniz.\n"
				+ "Ayr�ca bitki b�y�me s�releri �zerinde de �zelle�tirme yapabilirsiniz.";
		
		System.out.println(message);
		
		Area area = new Area();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nL�tfen �al��am ad�n�z� giriniz: \n");
		String name = scan.nextLine();
				
		Staff staff = new Staff(name);
		
		Plants palm = new Cocos_Palm("defaultName");
		Plants cycas = new Cycas("defaultName");
		Plants akuba = new Akuba("defaultName");
		
		while(theGame)
		{
		
			System.out.println("\n		MENU		");
			System.out.println("1. MEVCUT PARAYI VE ALANI G�R�NT�LE");
			System.out.println("2. B�TK� GEREKS�N�MLER�N� G�R");
			System.out.println("3. B�TK� AL");
			System.out.println("4. B�TK� EK");
			System.out.println("5. B�TK� TOPLA");
			System.out.println("6. B�TK� SAT");
			System.out.println("7. GEL��T�R�C� MESAJINI G�R\n");
		
		
			int choose = scan.nextInt();
		
			switch(choose)
			{
			case 1:
			
				area.showInfo();
				break;
			
			case 2:
				
				palm.showInfos();
				cycas.showInfos();
				akuba.showInfos();	
				break;
				
			case 3:
				
				System.out.println("\n1. Coco_Palm");
				System.out.println("2. Cycas");
				System.out.println("3. Akuba\n");
				System.out.println("Press another press to Exit");
				
				int i = scan.nextInt();
				
				if (i == 1)
					palm.buyPlant(palm, area); 
				
				else if(i == 2)
					cycas.buyPlant(cycas, area);	
				
				else if(i == 3)
					akuba.buyPlant(akuba, area);
				
				else
					break;
				
				break;
		
			case 4:
				
				System.out.println("\n1. Coco_Palm say�s�: " + palm.getCount());
				System.out.println("2. Cycas say�s�: " + cycas.getCount());
				System.out.println("3. Akuba say�s�: " + akuba.getCount());
				System.out.println("Press another press to Exit\n");
				
				int j = scan.nextInt();
				
				if (j == 1)
					staff.Peck(palm, area); 
				
				else if(j == 2)
					staff.Peck(cycas, area); 	
				
				else if(j == 3)
					staff.Peck(akuba, area); 
				
				else
					break;
				
				break;
			
			case 5:
				
				System.out.println("\n1. Mevcut Yeti�kin Coco_Palm say�s�: " + palm.getAdultPlantCount());
				System.out.println("2. Mevcut Yeti�kin Cycas say�s�: " + cycas.getAdultPlantCount());
				System.out.println("3. Mevcut Yeti�kin Akuba say�s�: " + akuba.getAdultPlantCount());
				System.out.println("Press another press to Exit\n");
				
				int k = scan.nextInt();
				
				if (k == 1)
					staff.collection(palm, area);
				
				else if(k == 2)
					staff.collection(cycas, area); 	
				
				else if(k == 3)
					staff.collection(akuba, area); 
				
				else
					break;
				
				break;
			
			case 6:
				
				System.out.println("\n1. Sat�labilir Coco_Palm say�s�: " + palm.getAdultPlantCount());
				System.out.println("2. Sat�labilir Cycas say�s�: " + cycas.getAdultPlantCount());
				System.out.println("3. Sat�labilir Akuba say�s�: " + akuba.getAdultPlantCount());
				System.out.println("Press another press to Exit\n");
				
				int n = scan.nextInt();
				
				if (n == 1)
					palm.sellPlant(palm, area);
				
				else if(n == 2)
					palm.sellPlant(cycas, area); 	
				
				else if(n == 3)
					palm.sellPlant(akuba, area); 
				
				else
					break;
				
				break;
			
			case 7:	
				
				System.out.println(devoloperMessage);
				break;
				
			default: break;
			
			}
		
		}
		
	}

}
