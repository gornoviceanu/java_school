import java.util.Scanner;

public class Menu {

	public Menu() {
	
	boolean x = false;
	boolean y = false;

	
	while (x == false) {
		System.out.println("Selectati telefonul pe care doriti sa il folositi. ");
		System.out.println("1. Samsung S7");
		System.out.println("2. Samsung A5");
		Scanner reader1 = new Scanner(System.in);
		int menuoption = reader1.nextInt();
	    
		
		switch (menuoption) {
		
		case 1: do {
			    
			    System.out.println("Ati selectat Samsung S7. Alegeti din meniu actiunea dorita: ");
		        System.out.println("1. Creare contact");
		        System.out.println("2. Lista contacte");
		        System.out.println("3. Inapoi");
		        Scanner reader2 = new Scanner(System.in);
		        int s7option = reader2.nextInt();
		        SamsungS7 s7 = new SamsungS7 (0742432564, "imeisadsdas123");
		        
		        if (s7option == 1) {
		        	System.out.println("Enter phone number to add: ");
		        	Scanner reader3 = new Scanner (System.in);
		        	int phonenumber = reader3.nextInt();		        	
		        	s7.addContact(phonenumber);        		        	
		        }
		        
		        if (s7option == 2) {
		        	s7.listContacts();
		        }
		        
		        if (s7option == 3) {
		        	y = true;
		        } 
		
		} while (y == false);
		break;
		
		case 2: do {
		    
		    System.out.println("Ati selectat Samsung A5. Alegeti din meniu actiunea dorita: ");
	        System.out.println("1. Creare contact");
	        System.out.println("2. Lista contacte");
	        System.out.println("3. Inapoi");
	        Scanner reader2 = new Scanner(System.in);
	        int a5option = reader2.nextInt();
	        SamsungA5 a5 = new SamsungA5 (0733412664, "imeifdsf213dsa");
	        
	        if (a5option == 1) {
	        	System.out.println("Enter phone number to add: ");
	        	Scanner reader3 = new Scanner (System.in);
	        	int phonenumber = reader3.nextInt();
	        	a5.addContact(phonenumber);        		        	
	        }
	        
	        if (a5option == 2) {
	        	a5.listContacts();
	        }
	        
	        if (a5option == 3) {
	        	y = true;
	        } 
	
	} while (y == false);
			break;
	}

	}
}
}
