package Building;

public class Mall extends Business {
	private int numRentedUnits, numParkingSpaces;
	private double medianUnitSize;
	
	public Mall() {
		super();
		this.setNumRentedUnits(0);
		this.setNumParkingSpaces(10);
		this.setMedianUnitSize(300.0);
	}

	public Mall(String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet, int numRentableUnits, int numRentedUnits, int numParkingSpaces, double medianUnitSize) {
		super(projectName, completeAddress, occupancyGroup, subgroup, totalSquareFeet, numRentableUnits);
		this.setNumRentedUnits(numRentableUnits);
		this.setNumParkingSpaces(numParkingSpaces);
		this.setMedianUnitSize(medianUnitSize);
	}
	
	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}
	
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.displayData());
		sb.append("# Rented Units: " + this.getNumRentedUnits() + "\n");
		sb.append("# Parking Spaces: " + this.getNumParkingSpaces() + "\n");
		sb.append("Median Unit Size: " + this.getMedianUnitSize() + "\n");
		return sb.toString();
	}
	
	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}
}
