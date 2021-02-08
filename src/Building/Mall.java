package Building;

public class Mall extends Business {
	int numRentedUnits, numParkingSpaces;
	double medianUnitSize;
	
	public Mall() {
		super.projectName = new String("Building Project");
		super.completeAddress = new String("6710 Renate Rd, Louisville, Kentucky 40291");
		super.occupancyGroup = new String("Residential");
		super.subgroup = new String("R-2");
		super.totalSquareFeet = 1000.0;
		super.numRentableUnits = 1;
		this.numRentedUnits = 0;
		this.numParkingSpaces = 10;
		this.medianUnitSize = 300.0;
	}
	
	public Mall(String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet, int numRentableUnits, int numRentedUnits, int numParkingSpaces, double medianUnitSize) {
		super.projectName = projectName;
		super.completeAddress = completeAddress;
		super.occupancyGroup = occupancyGroup;
		super.subgroup = subgroup;
		super.totalSquareFeet = totalSquareFeet;
		super.numRentableUnits = numRentableUnits;
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
}
