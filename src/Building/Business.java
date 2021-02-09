package Building;

public class Business extends Building {
	int numRentableUnits;
	
	public Business() {
		super();
		this.numRentableUnits = 1;
	}
	
	public Business(String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet, int numRentableUnits) {
		super(projectName, completeAddress, occupancyGroup, subgroup, totalSquareFeet);
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

	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
}
