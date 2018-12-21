package tema_oop;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Album extends Book {
	
	private String quality;
	
	public Album (String name, int noPages, String quality) {
		this.name = name;
		this.noPages = noPages;
		this.quality = quality;
	}

	public Album() {
		// TODO Auto-generated constructor stub
	}

}
