import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Step 1: Define the interface
interface RentalService {
    void addCar(Car car);
    void addCustomer(Customer customer);
    void rentCar(Car car, Customer customer, int days);
    void returnCar(Car car);
    void displayMenu();
}

class Car {
    private String carID;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailable;

    public Car(String carID, String brand, String model, double basePricePerDay) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = true;
    }

    public String getCarID() {
        return carID;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getBasePricePerDay() {
        return basePricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rent() {
        isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }

    public double calculatePrice(int rentalDays) {
        return basePricePerDay * rentalDays;
    }
}

class Customer {
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}

class Rental {
    private Car car;
    private Customer customer;
    private int days;

    public Rental(Car car, Customer customer, int days) {
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }
}

// Step 2: Implement the interface in the CarRentalSystem class
class CarRentalSystem implements RentalService {
    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;

    public CarRentalSystem() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void rentCar(Car car, Customer customer, int days) {
        if (car.isAvailable()) {
            car.rent();
            rentals.add(new Rental(car, customer, days));
            System.out.println("Car rented successfully!");
        } else {
            System.out.println("Sorry, the car is not available.");
        }
    }

    @Override
    public void returnCar(Car car) {
        Rental rentalToRemove = null;
        for (Rental rental : rentals) {
            if (rental.getCar().equals(car)) {
                rentalToRemove = rental;
                break;
            }
        }

        if (rentalToRemove != null) {
            rentals.remove(rentalToRemove);
            car.returnCar();
            System.out.println("Car returned successfully!");
        } else {
            System.out.println("Error: The car was not found in rentals.");
        }
    }

    @Override
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n========= Car Rental System =========");
            System.out.println("1. View Available Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewAvailableCars();
                    break;
                case 2:
                    rentCarMenu(scanner);
                    break;
                case 3:
                    returnCarMenu(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the Car Rental System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }

    private void viewAvailableCars() {
        System.out.println("\nAvailable Cars:");
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(car.getCarID() + " - " + car.getBrand() + " " + car.getModel() + " ($" + car.getBasePricePerDay() + " per day)");
            }
        }
    }

    private void rentCarMenu(Scanner scanner) {
        System.out.println("\n==== Rent a Car ====");
        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();
        Customer customer = new Customer("CUS" + (customers.size() + 1), customerName);
        addCustomer(customer);

        viewAvailableCars();
        System.out.print("Enter the Car ID you wish to rent: ");
        String carID = scanner.nextLine();

        Car selectedCar = null;
        for (Car car : cars) {
            if (car.getCarID().equals(carID) && car.isAvailable()) {
                selectedCar = car;
                break;
            }
        }

        if (selectedCar != null) {
            System.out.print("Enter the number of days for rental: ");
            int rentalDays = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            double totalPrice = selectedCar.calculatePrice(rentalDays);
            System.out.println("\nRental Details:");
            System.out.println("Customer: " + customer.getName());
            System.out.println("Car: " + selectedCar.getBrand() + " " + selectedCar.getModel());
            System.out.println("Rental Days: " + rentalDays);
            System.out.printf("Total Price: $%.2f%n", totalPrice);

            System.out.print("Confirm rental? (Y/N): ");
            String confirm = scanner.nextLine();
            if (confirm.equalsIgnoreCase("Y")) {
                rentCar(selectedCar, customer, rentalDays);
            } else {
                System.out.println("Rental cancelled.");
            }
        } else {
            System.out.println("Car not found or is unavailable for rent.");
        }
    }

    private void returnCarMenu(Scanner scanner) {
        System.out.println("\n==== Return a Car ====");
        System.out.print("Enter the Car ID to return: ");
        String carID = scanner.nextLine();

        Car carToReturn = null;
        for (Car car : cars) {
            if (car.getCarID().equals(carID) && !car.isAvailable()) {
                carToReturn = car;
                break;
            }
        }

        if (carToReturn != null) {
            returnCar(carToReturn);
        } else {
            System.out.println("Invalid Car ID or the car is not rented.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CarRentalSystem rentalSystem = new CarRentalSystem();

        // Adding some cars to the system
        rentalSystem.addCar(new Car("C001", "Toyota", "Camry", 1500));
        rentalSystem.addCar(new Car("C002", "Honda", "Civic", 1200));
        rentalSystem.addCar(new Car("C003", "Ford", "Mustang", 2000));

        // Start the system with a user-friendly menu
        rentalSystem.displayMenu();
    }
}
