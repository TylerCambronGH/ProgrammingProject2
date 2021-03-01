package Building;

public class Building {
	protected String projectName, completeAddress, occupancyGroup, subgroup;
	protected double totalSquareFeet;
	
	public Building() {
		this.setProjectName("Building Project");
		this.setCompleteAddress("6710 Renate Rd, Louisville, Kentucky 40291");
		this.setOccupancyGroup("Residential");
		this.setSubgroup("R-2");
		this.setTotalSquareFeet(1000.0);
	}
	
	public Building(String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet) {
		this.setProjectName(projectName);
		this.setCompleteAddress(completeAddress);
		this.setOccupancyGroup(occupancyGroup);
		this.setSubgroup(subgroup);
		this.setTotalSquareFeet(totalSquareFeet);
	}
	
	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}
	
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + this.getProjectName() + "\n");
		sb.append("Address: " + this.getCompleteAddress() + "\n");
		sb.append("Group: " + this.getOccupancyGroup() + "\n");
		sb.append("Sub-Group: " + this.getSubgroup() + "\n");
		sb.append("Square Feet: " + this.getTotalSquareFeet() + "\n");
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
