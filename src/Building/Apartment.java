package Building;

public class Apartment extends Residential {
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment() {
		super();
		this.setNumRentableUnits(10);
		this.setAvgUnitSize(100.0);
		this.setParkingAvailable(true);
	}
	
	public Apartment(String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		super(projectName, completeAddress, occupancyGroup, subgroup, totalSquareFeet, numBedrooms, numBathrooms, laundryRoom);
		this.setNumRentableUnits(numRentableUnits);
		this.setAvgUnitSize(avgUnitSize);
		this.setParkingAvailable(parkingAvailable);
	}
	
	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}
	
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.displayData());
		sb.append("# Rentable Units: " + this.getNumRentableUnits() + "\n");
		sb.append("Average Unit Size: " + this.getAvgUnitSize() + "\n");
		sb.append("Parking Available? " + this.isParkingAvailable() + "\n");
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
