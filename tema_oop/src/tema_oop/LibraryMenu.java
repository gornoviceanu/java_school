package tema_oop;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.HashSet;
import java.util.function.Predicate;


public class LibraryMenu {

	public LibraryMenu() {
		boolean x = true;
	    List<Book> books = new ArrayList<Book>();
		
		while (x == true) {
		System.out.println("Selectati optiunea dorita.");		
		System.out.println("1. Afisare lista carti.");
		System.out.println("2. Adaugare carte. ");
		System.out.println("3. Stergere carte. ");
		System.out.println("4. Exit. ");
		Scanner reader = new Scanner(System.in);
	     int z = reader.nextInt();
		switch (z) {
		case 1: System.out.println("Cartile disponibile sunt: ");
		        for (Book book : books) {
		        	System.out.println(book.toString());
		        }
			break;
		case 2: System.out.println("Introduceti genul cartii pe care doriti sa o adaugati: ");
		        System.out.println("1. Nuvela.");
		        System.out.println("2. Album.");
		        Scanner reader2 = new Scanner (System.in);
		        int y = reader2.nextInt();
		        if (y == 1) {
		        	System.out.println("Introduceti informatiile nuvelei: ");
		        	System.out.println("Nume: ");
		        	Scanner reader3 = new Scanner (System.in);
		        	String a = reader3.nextLine();
		        	System.out.println("Numar de pagini: ");
		        	Scanner reader4 = new Scanner (System.in);
		        	int b = reader4.nextInt();
		        	System.out.println("Genul nuvelei: ");
		        	Scanner reader5 = new Scanner (System.in);
     	        	String c = reader5.nextLine();
		        	Novel novel1 = new Novel();
		        	books.add(new Novel(a, b, c));

		        } else if (y == 2) {
		        	System.out.println("Introduceti informatiile albumului: ");
		        	System.out.println("Nume: ");
		        	Scanner reader6 = new Scanner (System.in);
		        	String m = reader6.nextLine();
		        	System.out.println("Numar de pagini: ");
		        	Scanner reader7 = new Scanner (System.in);
		        	int n = reader7.nextInt();
		        	System.out.println("Calitatea albumului: ");
		        	Scanner reader8 = new Scanner (System.in);
		        	String p = reader8.nextLine();
		        	Album album1 = new Album ();
		        	books.add(new Album(m, n, p));
		        }		        
			break;
		case 3: System.out.println("Introduceti numele cartii pe care doriti sa o stergeti: ");
		        Scanner reader9 = new Scanner (System.in);
		        String delete = reader9.nextLine();
		        for (Book book : books) {
		        	System.out.println(book);
		        	System.out.println(delete);
		        	if(delete == book.toString()) {
		        		books.remove(book);
		        	}
		       	  }
		         
			break;
		case 4: x = false;
		    break;
		default: System.out.println("Trebuie selectata o optiune valida.");
		}}
		
	}

}
