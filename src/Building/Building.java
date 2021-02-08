package Building;

public class Building {
	protected String projectName, completeAddress, occupancyGroup, subgroup;
	protected double totalSquareFeet;
	
	public Building() {
		this.projectName = new String("Building Project");
		this.completeAddress = new String("6710 Renate Rd, Louisville, Kentucky 40291");
		this.occupancyGroup = new String("Residential");
		this.subgroup = new String("R-2");
		this.totalSquareFeet = 1000.0;
	}
	
	public Building(String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
		this.totalSquareFeet = totalSquareFeet;
	}
	
	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}
	
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + this.projectName);
		sb.append("Address: " + this.completeAddress);
		sb.append("Group: " + this.occupancyGroup);
		sb.append("Sub-Group: " + this.subgroup);
		sb.append("Square Feet: " + this.totalSquareFeet);
		return sb.toString();
	}
}
