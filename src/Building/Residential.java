package Building;

public class Residential extends Building {
	private int numBedrooms, numBathrooms;
	private boolean laundryRoom;
	
	public Residential() {
		super();
		this.setNumBedrooms(1);
		this.setNumBathrooms(1);
		this.setLaundryRoom(true);
	}
	
	public Residential(String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		super(projectName, completeAddress, occupancyGroup, subgroup, totalSquareFeet);
		this.setNumBedrooms(numBedrooms);
		this.setNumBathrooms(numBathrooms);
		this.setLaundryRoom(laundryRoom);
	}
	
	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}
	
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.displayData());
		sb.append("# Bedrooms: " + this.getNumBedrooms() + "\n");
		sb.append("# Bathrooms: " + this.getNumBathrooms() + "\n");
		sb.append("Laundry Room? " + this.isLaundryRoom() + "\n");
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
