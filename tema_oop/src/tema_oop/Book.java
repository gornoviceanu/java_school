package tema_oop;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Book {
	
	public String name;
	public int noPages;
	
	public Book(String name, int noPages) {
		this.name = name;
	}
	

	public Book() {

	}
	
	public String listBooks() {
		return name;
	}
	
	
	public String toString() {
		return listBooks();
	}
	
	public boolean checkName(String name) {
		if (this.name == name) {
			return true;
		} else { return false;
		}
	}
}
	

		

	

	
 


 