import java.util.ArrayList;
import java.util.List;

public class SamsungA5 extends Samsung {
	
	private int batteryLife = 100;
	private final int phoneNo;
	private final String imei;
	private List<Integer> contacts = new ArrayList<>();
	private String[] inbox = new String[10];
	private String[] history = new String [10];
	private int iContacts;
	private int iInbox;
	private int iHistory;
	private String messageToSend;
	private String contactToAdd;
	
	


	public SamsungA5 (int phoneNo, String imei) {
		this.phoneNo = phoneNo;
		this.imei = imei;
	}
	
	void addContact (int number) {
	    contacts.add(number);
	}
	
	
	void listContacts () {
		for (Integer contacts: contacts) {
		System.out.println(contacts);
		}
	}
	
	void call (String number) {
	    System.out.println("Calling" + number);
	    this.history[iHistory] = number;
	    iHistory++;
	}
	
	void callHistory () {
		for (int i = 0; i <= this.iHistory; i++) {
			System.out.println(history[i]);
		}
	}
	
	
	void viewBattery () {
		System.out.println(this.batteryLife);
	}
	
	

}
