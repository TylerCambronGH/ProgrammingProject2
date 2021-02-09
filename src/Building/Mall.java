package Building;

public class Mall extends Business {
	int numRentedUnits, numParkingSpaces;
	double medianUnitSize;
	
	public Mall() {
		super();
		this.numRentedUnits = 0;
		this.numParkingSpaces = 10;
		this.medianUnitSize = 300.0;
	}

	public Mall(String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet, int numRentableUnits, int numRentedUnits, int numParkingSpaces, double medianUnitSize) {
		super(projectName, completeAddress, occupancyGroup, subgroup, totalSquareFeet, numRentableUnits);
		this.numRentedUnits = numRentedUnits;
		this.numParkingSpaces = numParkingSpaces;
		this.medianUnitSize = medianUnitSize;
	}
	
	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}
	
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.displayData());
		sb.append("# Rented Units: " + this.numRentedUnits);
		sb.append("# Parking Spaces: " + this.numParkingSpaces);
		sb.append("Median Unit Size: " + this.medianUnitSize);
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
