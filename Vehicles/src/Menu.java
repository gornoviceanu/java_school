import java.util.Scanner;

public class Menu {

	public Menu() {
		
		boolean x = false;
		boolean y = false;
		boolean z = false;
		boolean w = false;
		boolean v = false;
		
		while (x == false) {
			System.out.println("Selectati masina pe care doriti sa o conduceti: ");
			System.out.println("1. Volkswagen Passat");
			System.out.println("2. Volkswagen Golf");
			System.out.println("3. Audi A4");
			System.out.println("4. Audi A6");
			System.out.println("5. Exit");
			Scanner reader = new Scanner(System.in);
			int optiune = reader.nextInt();
			
						
			switch (optiune) {
	
			case 1: System.out.println("You have chosen VW Passat. Please insert chassis number, tire size and cruise gear in this order. ");
	                Scanner seriePassat = new Scanner(System.in);
	                String serie1 = seriePassat.next();
	                Scanner cauciucuriPassat = new Scanner(System.in);
	                int cauciucuri1 = cauciucuriPassat.nextInt();	
	                Scanner vitezaPassat = new Scanner(System.in);
	                int viteza1 = vitezaPassat.nextInt();
				    VWPassat carP = new VWPassat(serie1, cauciucuri1, viteza1);
				    
				    do {
				    System.out.println("Choose an action: ");
			        System.out.println("1. Drive car. ");
			        System.out.println("2. Car status. ");
			        System.out.println("3. Return to main menu. ");
			        Scanner actiunePassat = new Scanner (System.in);
			        int deciziePassat = actiunePassat.nextInt();
			        
			        if (deciziePassat == 1) {
			        	System.out.println("Choose how many KMs you wish to drive: ");
			        	Scanner distantaPassat = new Scanner (System.in);
			        	float distanceP = distantaPassat.nextFloat();
			        	carP.drive(distanceP);
			        	carP.consumptionCoeficient();
			        	carP.decreaseFuel(distanceP);
			        }
			        
			        if (deciziePassat == 2) {
			        	carP.carStatus();
			        }
			        
			        if (deciziePassat == 3) {
			        	y = true;
			        }
			        
			        } while (y == false);
				    break;
			
			case 2: System.out.println("You have chosen VW Golf. Please insert chassis number, tire size and cruise gear in this order. ");	    
			        Scanner serieGolf = new Scanner(System.in);
                    String serie2 = serieGolf.next();
                    Scanner cauciucuriGolf = new Scanner(System.in);
                    int cauciucuri2 = cauciucuriGolf.nextInt();	
                    Scanner vitezaGolf = new Scanner(System.in);
                    int viteza2 = vitezaGolf.nextInt();
			        VWGolf carG = new VWGolf(serie2, cauciucuri2, viteza2);
			        
			        do {
			        System.out.println("Choose an action: ");
				    System.out.println("1. Drive car. ");
				    System.out.println("2. Car status. ");
				    System.out.println("3. Return to main menu. ");
				    Scanner actiuneGolf = new Scanner (System.in);
				    int decizieGolf = actiuneGolf.nextInt();
				    
				    if (decizieGolf == 1) {
				    	System.out.println("Choose how many KMs you wish to drive: ");
				    	Scanner distantaGolf = new Scanner (System.in);
				    	float distanceG = distantaGolf.nextFloat();
				    	carG.drive(distanceG);
				    	carG.consumptionCoeficient();
				    	carG.decreaseFuel(distanceG);
				    	
				    }
				    
				    if (decizieGolf == 2) {
				    	carG.carStatus();
				    }
				    
				    if (decizieGolf == 3) {
				    	z = true;
				    }
			        	
			        } while (z == false);
			        break;
			        
			case 3: System.out.println("You have chosen Audi A4. Please insert chassis number, tire size and cruise gear in this order. ");
			        Scanner serieA4 = new Scanner(System.in);
                    String serie3 = serieA4.next();
                    Scanner cauciucuriA4 = new Scanner(System.in);
                    int cauciucuri3 = cauciucuriA4.nextInt();	
                    Scanner vitezaA4 = new Scanner(System.in);
                    int viteza3 = vitezaA4.nextInt();
	                AudiA4 carA4 = new AudiA4(serie3, cauciucuri3, viteza3);
	                
	                do {
	                System.out.println("Choose an action: ");
					System.out.println("1. Drive car. ");
					System.out.println("2. Car status. ");
					System.out.println("3. Return to main menu. ");
					Scanner actiuneA4 = new Scanner (System.in);
				    int decizieA4 = actiuneA4.nextInt();
					    
					if (decizieA4 == 1) {
					    System.out.println("Choose how many KMs you wish to drive: ");
					    Scanner distantaA4 = new Scanner (System.in);
					    float distanceA4 = distantaA4.nextFloat();
					    carA4.drive(distanceA4);
					    carA4.consumptionCoeficient();
					    carA4.decreaseFuel(distanceA4);
					    
					}
					
					if (decizieA4 == 2) {
						carA4.carStatus();
					}
					
					if (decizieA4 == 3) {
						w = true;
	                	
	                }
					
	                } while (w == false);
	                break;
	                
			case 4: System.out.println("You have chosen Audi A6. Please insert chassis number, tire size and cruise gear in this order. ");
	                Scanner serieA6 = new Scanner(System.in);
                    String serie4 = serieA6.next();
                    Scanner cauciucuriA6 = new Scanner(System.in);
                    int cauciucuri4 = cauciucuriA6.nextInt();	
                    Scanner vitezaA6 = new Scanner(System.in);
                    int viteza4 = vitezaA6.nextInt();
                    AudiA6 carA6 = new AudiA6(serie4, cauciucuri4, viteza4);
            
                    do {
                    System.out.println("Choose an action: ");
			        System.out.println("1. Drive car. ");
			        System.out.println("2. Car status. ");
			        System.out.println("3. Return to main menu. ");
			        Scanner actiuneA6 = new Scanner (System.in);
		            int decizieA6 = actiuneA6.nextInt();
			    
			        if (decizieA6 == 1) {
			            System.out.println("Choose how many KMs you wish to drive: ");
			            Scanner distantaA6 = new Scanner (System.in);
			            float distanceA6 = distantaA6.nextFloat();
			            carA6.drive(distanceA6);
			            carA6.consumptionCoeficient();
			            carA6.decreaseFuel(distanceA6);
			            
			        if (decizieA6 == 2) {
			        	carA6.carStatus();
			        }
			        
			        if (decizieA6 == 3) {
			        	v = true;
			        }
            	
            	
                    }
			        
                    } while (v == false);  
                    break;
                    
				    }

			}
	}

}


