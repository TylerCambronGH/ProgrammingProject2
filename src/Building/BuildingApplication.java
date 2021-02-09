package Building;

public class BuildingApplication {
	public static void main(String[] args) {		
		Building building1 = new Building();
		Building building2 = new Building("Project Building 2", "8320 Davidson Lane  39554 Kansas City, Kansas", "Educational", "E", 10000.0);
		System.out.println(building1.getProjectName() + "\n" + building1.getCompleteAddress() + "\n" + building1.getOccupancyGroup() + "\n" + building1.getSubgroup() + "\n" + building1.getTotalSquareFeet());
		System.out.println("\n");
		System.out.println(building2.getProjectName() + "\n" + building2.getCompleteAddress() + "\n" + building2.getOccupancyGroup() + "\n" + building2.getSubgroup() + "\n" + building2.getTotalSquareFeet());
		building1.setProjectName("House 1");
		building2.setProjectName("School 1");
		System.out.println(building1.getProjectName() + "\n" + building1.getCompleteAddress() + "\n" + building1.getOccupancyGroup() + "\n" + building1.getSubgroup() + "\n" + building1.getTotalSquareFeet());
		System.out.println("\n");
		System.out.println(building2.getProjectName() + "\n" + building2.getCompleteAddress() + "\n" + building2.getOccupancyGroup() + "\n" + building2.getSubgroup() + "\n" + building2.getTotalSquareFeet());
		
		System.out.println("\n\n");
		
		Business building3 = new Business();
		building3.setProjectName("Business 1");
		building3.setOccupancyGroup("Business");
		building3.setSubgroup("B");
		Business building4 = new Business("Project Building 4", "8320 Davidson Lane  39554 Kansas City, Kansas", "Business", "B", 10000.0, 3);
		System.out.println(building3.getProjectName() + "\n" + building3.getCompleteAddress() + "\n" + building3.getOccupancyGroup() + "\n" + building3.getSubgroup() + "\n" + building3.getTotalSquareFeet() + "\n" + building3.getNumRentableUnits());
		System.out.println("\n");
		System.out.println(building4.getProjectName() + "\n" + building4.getCompleteAddress() + "\n" + building4.getOccupancyGroup() + "\n" + building4.getSubgroup() + "\n" + building4.getTotalSquareFeet() + "\n" + building4.getNumRentableUnits());
		
		System.out.println("\n\n");
		
		Mall building5 = new Mall();
		building5.setProjectName("Mall 1");
		building5.setOccupancyGroup("Business");
		building5.setSubgroup("B");
		Mall building6 = new Mall("Project Building 6", "8320 Davidson Lane  39554 Kansas City, Kansas", "Business", "B", 10000.0, 3, 2, 15, 2500.0);
		System.out.println(building5.getProjectName() + "\n" + building5.getCompleteAddress() + "\n" + building5.getOccupancyGroup() + "\n" + building5.getSubgroup() + "\n" + building5.getTotalSquareFeet() + "\n" + building5.getNumRentableUnits() + "\n" + building5.getNumRentedUnits() + "\n" + building5.getNumParkingSpaces() + "\n" + building5.getMedianUnitSize());
		System.out.println("\n");
		System.out.println(building6.getProjectName() + "\n" + building6.getCompleteAddress() + "\n" + building6.getOccupancyGroup() + "\n" + building6.getSubgroup() + "\n" + building6.getTotalSquareFeet() + "\n" + building6.getNumRentableUnits() + "\n" + building6.getNumRentedUnits() + "\n" + building6.getNumParkingSpaces() + "\n" + building6.getMedianUnitSize());
		
		System.out.println("\n\n");
		
		Residential building7 = new Residential();
		building7.setProjectName("Residential 1");
		building7.setLaundryRoom(false);
		building7.setOccupancyGroup("Residential");
		building7.setSubgroup("R-4");
		Residential building8 = new Residential("Project Building 8", "8320 Davidson Lane  39554 Kansas City, Kansas", "Residential", "R-2", 4000.0, 2, 2, true);
		System.out.println(building7.getProjectName() + "\n" + building7.getCompleteAddress() + "\n" + building7.getOccupancyGroup() + "\n" + building7.getSubgroup() + "\n" + building7.getTotalSquareFeet() + "\n" + building7.getNumBedrooms() + "\n" + building7.getNumBathrooms() + "\n" + building7.isLaundryRoom());
		System.out.println("\n");
		System.out.println(building8.getProjectName() + "\n" + building8.getCompleteAddress() + "\n" + building8.getOccupancyGroup() + "\n" + building8.getSubgroup() + "\n" + building8.getTotalSquareFeet() + "\n" + building8.getNumBedrooms() + "\n" + building8.getNumBathrooms() + "\n" + building8.isLaundryRoom());
		
		System.out.println("\n\n");
		
		Apartment building9 = new Apartment();
		building9.setProjectName("Apartment 1");
		building9.setNumRentableUnits(13);
		building9.setAvgUnitSize(1500.0);
		building9.setOccupancyGroup("Residential");
		building9.setSubgroup("R-4");
		Apartment building10 = new Apartment("Project Building 8", "8320 Davidson Lane  39554 Kansas City, Kansas", "Residential", "R-2", 4000.0, 2, 2, true, 5, 1000.0, false);
		System.out.println(building9.getProjectName() + "\n" + building9.getCompleteAddress() + "\n" + building9.getOccupancyGroup() + "\n" + building9.getSubgroup() + "\n" + building9.getTotalSquareFeet() + "\n" + building9.getNumBedrooms() + "\n" + building9.getNumBathrooms() + "\n" + building9.isLaundryRoom() + "\n" + building9.getNumRentableUnits() + "\n" + building9.getAvgUnitSize() + "\n" + building9.isParkingAvailable());
		System.out.println("\n");
		System.out.println(building10.getProjectName() + "\n" + building10.getCompleteAddress() + "\n" + building10.getOccupancyGroup() + "\n" + building10.getSubgroup() + "\n" + building10.getTotalSquareFeet() + "\n" + building10.getNumBedrooms() + "\n" + building10.getNumBathrooms() + "\n" + building10.isLaundryRoom() + "\n" + building10.getNumRentableUnits() + "\n" + building10.getAvgUnitSize() + "\n" + building10.isParkingAvailable());
		
		System.out.println("\n\n");
		
		SingleFamilyHome building11 = new SingleFamilyHome();
		building11.setProjectName("Family Home 1");
		building11.setGarage(true);
		SingleFamilyHome building12 = new SingleFamilyHome("Project Building 12", "8320 Davidson Lane  39554 Kansas City, Kansas", "Residential", "R-2", 4000.0, 2, 2, true, false);
		System.out.println(building11.getProjectName() + "\n" + building11.getCompleteAddress() + "\n" + building11.getOccupancyGroup() + "\n" + building11.getSubgroup() + "\n" + building11.getTotalSquareFeet() + "\n" + building11.getNumBedrooms() + "\n" + building11.getNumBathrooms() + "\n" + building11.isLaundryRoom() + "\n" + building11.isGarage());
		System.out.println("\n");
		System.out.println(building12.getProjectName() + "\n" + building12.getCompleteAddress() + "\n" + building12.getOccupancyGroup() + "\n" + building12.getSubgroup() + "\n" + building12.getTotalSquareFeet() + "\n" + building12.getNumBedrooms() + "\n" + building12.getNumBathrooms() + "\n" + building12.isLaundryRoom() + "\n" + building12.isGarage());
	}	
}
