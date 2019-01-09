
public abstract class Audi extends Car {
	private float fuelTankSize = 65F;
	private String chassisNumber;
	private int tireSize;
	private int gear;
	private float consupmtionRate = 0.3F * tireSize * gear;
	private float availableFuel;
	private float totalConsumption;
	private float distanceDriven;

	public Audi() {

	}
	
	public Audi (String chassisNumber, int tireSize, int gear) {
		this.chassisNumber = chassisNumber;
		this.tireSize = tireSize;
		this.gear = gear;

	}
	
	void start () {
		System.out.println("You started the car. ");
		this.totalConsumption = 0;
	}
	
	void stop () {
		System.out.println("You have stopped the car. ");
	}
	
	void shiftGear (int gear) {
		this.gear = gear;
	}
	
	void drive (float distanceToDrive) {
		this.distanceDriven = this.distanceDriven + distanceToDrive;
		System.out.println("Car has driven " + this.distanceDriven + " KMs. ");
	}
	
	
	void carStatus () {
		System.out.println("This car has driven " + this.distanceDriven + " KMs and has " + this.availableFuel + " liters of fuel left.");
	}
	
	
	void decreaseFuel (float distanceToDrive) {
		this.availableFuel = this.availableFuel - distanceToDrive;
		System.out.println("Car has " + this.availableFuel + " liters of fuel left. ");
	}

}
