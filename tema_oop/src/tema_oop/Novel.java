package tema_oop;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Novel extends Book {
	
	private String type;
	
	public Novel (String name, int noPages, String type) {
		this.name = name;
		this.noPages = noPages;
		this.type = type;		
	}
	
	public void addNovel (String name, int noPages, String type) {
		this.name = name;
		this.noPages = noPages;
		this.type = type;
	}

	public Novel() {
		// TODO Auto-generated constructor stub
	}

}
