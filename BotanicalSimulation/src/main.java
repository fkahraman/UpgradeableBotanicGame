
import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class main {

	public static void main(String[] args){
		
		boolean theGame = true;
		
		String message = "Botanik Simülasyonuna hoþgeldiniz!\n\n"
				+ "Baþlangýç paranýz ve kullaným alanýnýz aþaðýda verilmiþtir.\n"
				+ "Bu simülasyonda bitki satýn alabilir yetiþtirebilr ve daha sonrasýnda satabilirsiniz.\n"
				+ "Bitkilerin büyüme süreleri 10 saniyedir.\n"
				+ "Ýyi eðlenceler\n"
				+ "\nauthor: FATÝH KAHRAMAN\n";
		
		String devoloperMessage = "	\nGeliþtirilebilirlik açýsýnda SULAMA ve GÜBRELEME iþlemleri oyuna dahil edilmemiþ olup\n"
				+ "fonksiyonlarýna kod kýsmýndan ulaþabilirsiniz.\n"
				+ "Siz de oyuna kendi bitki türlerinizi ekleyebilirsiniz.\n"
				+ "Ayrýca bitki büyüme süreleri üzerinde de özelleþtirme yapabilirsiniz.";
		
		System.out.println(message);
		
		Area area = new Area();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nLütfen çalýþam adýnýzý giriniz: \n");
		String name = scan.nextLine();
				
		Staff staff = new Staff(name);
		
		Plants palm = new Cocos_Palm("defaultName");
		Plants cycas = new Cycas("defaultName");
		Plants akuba = new Akuba("defaultName");
		
		while(theGame)
		{
		
			System.out.println("\n		MENU		");
			System.out.println("1. MEVCUT PARAYI VE ALANI GÖRÜNTÜLE");
			System.out.println("2. BÝTKÝ GEREKSÝNÝMLERÝNÝ GÖR");
			System.out.println("3. BÝTKÝ AL");
			System.out.println("4. BÝTKÝ EK");
			System.out.println("5. BÝTKÝ TOPLA");
			System.out.println("6. BÝTKÝ SAT");
			System.out.println("7. GELÝÞTÝRÝCÝ MESAJINI GÖR\n");
		
		
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
				
				System.out.println("\n1. Coco_Palm sayýsý: " + palm.getCount());
				System.out.println("2. Cycas sayýsý: " + cycas.getCount());
				System.out.println("3. Akuba sayýsý: " + akuba.getCount());
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
				
				System.out.println("\n1. Mevcut Yetiþkin Coco_Palm sayýsý: " + palm.getAdultPlantCount());
				System.out.println("2. Mevcut Yetiþkin Cycas sayýsý: " + cycas.getAdultPlantCount());
				System.out.println("3. Mevcut Yetiþkin Akuba sayýsý: " + akuba.getAdultPlantCount());
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
				
				System.out.println("\n1. Satýlabilir Coco_Palm sayýsý: " + palm.getAdultPlantCount());
				System.out.println("2. Satýlabilir Cycas sayýsý: " + cycas.getAdultPlantCount());
				System.out.println("3. Satýlabilir Akuba sayýsý: " + akuba.getAdultPlantCount());
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
