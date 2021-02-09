package Building;

public class Residential extends Building {
	int numBedrooms, numBathrooms;
	boolean laundryRoom;
	
	public Residential() {
		super();
		this.numBedrooms = 1;
		this.numBathrooms = 1;
		this.laundryRoom = true;
	}
	
	public Residential(String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		super(projectName, completeAddress, occupancyGroup, subgroup, totalSquareFeet);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}
	
	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}
	
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.displayData());
		sb.append("# Bedrooms: " + this.numBedrooms);
		sb.append("# Bathrooms: " + this.numBathrooms);
		sb.append("Laundry Room? " + this.laundryRoom);
		return sb.toString();
	}

	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	
}
