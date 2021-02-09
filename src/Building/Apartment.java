package Building;

public class Apartment extends Residential {
	int numRentableUnits;
	double avgUnitSize;
	boolean parkingAvailable;
	
	public Apartment() {
		super();
		this.numRentableUnits = 10;
		this.avgUnitSize = 100.0;
		this.parkingAvailable = true;
	}
	
	public Apartment(String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		super(projectName, completeAddress, occupancyGroup, subgroup, totalSquareFeet, numBedrooms, numBathrooms, laundryRoom);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}
	
	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}
	
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.displayData());
		sb.append("# Rentable Units: " + this.numRentableUnits);
		sb.append("Average Unit Size: " + this.avgUnitSize);
		sb.append("Parking Available? " + this.parkingAvailable);
		return sb.toString();
	}
	
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
}
