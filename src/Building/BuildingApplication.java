package Building;

public class BuildingApplication {
	public static void main(String[] args) {		
		Building building1 = new Building();
		Building building2 = new Building("Project Building 2", "8320 Davidson Lane  39554 Kansas City, Kansas", "Educational", "E", 10000.0);
		building1.displayData();
		System.out.println("\n");
		building2.displayData();
		building1.setProjectName("House 1");
		building2.setProjectName("School 1");
		System.out.println(building1.displayData());
		System.out.println("\n");
		System.out.println(building2.displayData());
		System.out.println("\n\n");
		
		Business building3 = new Business();
		building3.setProjectName("Business 1");
		building3.setOccupancyGroup("Business");
		building3.setSubgroup("B");
		Business building4 = new Business("Project Building 4", "8320 Davidson Lane  39554 Kansas City, Kansas", "Business", "B", 10000.0, 3);
		System.out.println(building3.displayData());
		System.out.println("\n");
		System.out.println(building4.displayData());
		System.out.println("\n\n");
		
		Mall building5 = new Mall();
		building5.setProjectName("Mall 1");
		building5.setOccupancyGroup("Business");
		building5.setSubgroup("B");
		Mall building6 = new Mall("Project Building 6", "8320 Davidson Lane  39554 Kansas City, Kansas", "Business", "B", 10000.0, 3, 2, 15, 2500.0);
		System.out.println(building5.displayData());
		System.out.println("\n");
		System.out.println(building6.displayData());
		System.out.println("\n\n");
		
		Residential building7 = new Residential();
		building7.setProjectName("Residential 1");
		building7.setLaundryRoom(false);
		building7.setOccupancyGroup("Residential");
		building7.setSubgroup("R-4");
		Residential building8 = new Residential("Project Building 8", "8320 Davidson Lane  39554 Kansas City, Kansas", "Residential", "R-2", 4000.0, 2, 2, true);
		System.out.println(building7.displayData());
		System.out.println("\n");
		System.out.println(building8.displayData());		
		System.out.println("\n\n");
		
		Apartment building9 = new Apartment();
		building9.setProjectName("Apartment 1");
		building9.setNumRentableUnits(13);
		building9.setAvgUnitSize(1500.0);
		building9.setOccupancyGroup("Residential");
		building9.setSubgroup("R-4");
		Apartment building10 = new Apartment("Project Building 8", "8320 Davidson Lane  39554 Kansas City, Kansas", "Residential", "R-2", 4000.0, 2, 2, true, 5, 1000.0, false);
		System.out.println(building9.displayData());
		System.out.println("\n");
		System.out.println(building10.displayData());			
		System.out.println("\n\n");
		
		SingleFamilyHome building11 = new SingleFamilyHome();
		building11.setProjectName("Family Home 1");
		building11.setGarage(true);
		SingleFamilyHome building12 = new SingleFamilyHome("Project Building 12", "8320 Davidson Lane  39554 Kansas City, Kansas", "Residential", "R-2", 4000.0, 2, 2, true, false);
		System.out.println(building11.displayData());
		System.out.println("\n");
		System.out.println(building12.displayData());	
	}	
}
