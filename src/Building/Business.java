package Building;

public class Business extends Building {
	int numRentableUnits;
	
	public Business() {
		super.projectName = new String("Building Project");
		super.completeAddress = new String("6710 Renate Rd, Louisville, Kentucky 40291");
		super.occupancyGroup = new String("Residential");
		super.subgroup = new String("R-2");
		super.totalSquareFeet = 1000.0;
		this.numRentableUnits = 1;
	}
	
	public Business(String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet, int numRentableUnits) {
		super.projectName = projectName;
		super.completeAddress = completeAddress;
		super.occupancyGroup = occupancyGroup;
		super.subgroup = subgroup;
		super.totalSquareFeet = totalSquareFeet;
		this.numRentableUnits = numRentableUnits;
	}
	
	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}
	
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.displayData());
		sb.append("# Rentable Units: " + this.numRentableUnits);
		return sb.toString();
	}
}
