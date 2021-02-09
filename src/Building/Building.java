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

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	public String getSubgroup() {
		return subgroup;
	}

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}
	
	
}
