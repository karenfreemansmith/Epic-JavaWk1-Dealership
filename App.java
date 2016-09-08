import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console c = System.console();

    Vehicle hatchback = new Vehicle(1994, "Subaru", "Legacy", 170000, 4000);
    Vehicle suv = new Vehicle(2002, "Ford", "Explorer", 100000, 7000);
    Vehicle sedan = new Vehicle(2015,  "Toyota", "Camry", 30000, 50000);
    Vehicle truck = new Vehicle(1999, "Ford", "Ranger", 100000, 4000);
    Vehicle crossover = new Vehicle(1998, "Toyota", "Rav-4", 200000, 3500);

    List<Vehicle> allVehicles = new ArrayList<Vehicle>();
    allVehicles.add(hatchback);
    allVehicles.add(suv);
    allVehicles.add(sedan);
    allVehicles.add(truck);
    allVehicles.add(crossover);

    System.out.println("Welcome to our car dealership. What would you like to do?");
    System.out.println("Enter one of the following options: All Vehicles, Search Price, Add Vehicle, or Quit");
    String navigationChoice = c.readLine();
    while(!navigationChoice.equals("Quit")) {
      if(navigationChoice.equals("All Vehicles")) {
        for(Vehicle v:allVehicles) {
          System.out.println("-------------------");
          System.out.println(v.getYear());
          System.out.println(v.getBrand());
          System.out.println(v.getModel());
          System.out.println(v.getMiles());
          System.out.println(v.getPrice());
        }
      } else if (navigationChoice.equals("Search Price")) {
        System.out.println("What is your maximum budget for a vehicle?");
        int userMaxBudget = Integer.parseInt(c.readLine());
        System.out.println("Well, then, here is a list of the vehicles you can afford: ");
        for(Vehicle v:allVehicles) {
          if(v.worthBuying(userMaxBudget)) {
            System.out.println("-------------------");
            System.out.println(v.getYear());
            System.out.println(v.getBrand());
            System.out.println(v.getModel());
            System.out.println(v.getMiles());
            System.out.println(v.getPrice());
          }
        }
      } else if(navigationChoice.equals("Add Vehicle")) {
        System.out.println("Great, let's add a vehicle! What year is your vehicle?");
        int userVehicleYear = Integer.parseInt(c.readLine());
        System.out.println("Great! What make or brand is the vehicle?");
        String userVehicleBrand = c.readLine();
        System.out.println("Got it! What model is it?");
        String userVehicleModel = c.readLine();
        System.out.println("And how many miles does it have on it?");
        int userVehicleMiles = Integer.parseInt(c.readLine());
        System.out.println("Finally, what's its price?");
        int userVehiclePrice = Integer.parseInt(c.readLine());
        Vehicle yourListing = new Vehicle(userVehicleYear, userVehicleBrand, userVehicleModel, userVehicleMiles, userVehiclePrice);
        allVehicles.add(yourListing);
        System.out.println("-------------------");
        System.out.println("Thank you! Here is a sample of your listing:");
        System.out.println("-------------------");
        System.out.println(yourListing.getYear());
        System.out.println(yourListing.getBrand());
        System.out.println(yourListing.getModel());
        System.out.println(yourListing.getMiles());
        System.out.println(yourListing.getPrice());
        System.out.println("-------------------");
      } else {
        System.out.println("I'm sorry, I didn't understand that input, please check your spelling.");
      }
      System.out.println("Enter one of the following options: All Vehicles, Search Price, Add Vehicle, or Quit");
      navigationChoice = c.readLine();
    }
  }
}
