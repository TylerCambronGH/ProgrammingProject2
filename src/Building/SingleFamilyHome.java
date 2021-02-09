package Building;

public class SingleFamilyHome extends Residential {
	private boolean garage;
	
	public SingleFamilyHome() {
		super();
		this.garage = false;
	}
	
	public SingleFamilyHome(String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		super(projectName, completeAddress, occupancyGroup, subgroup, totalSquareFeet, numBedrooms, numBathrooms, laundryRoom);
		this.garage = garage;
	}
	
	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}
	
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append("Garage? " + this.garage);
		return sb.toString();
	}

	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}
}
