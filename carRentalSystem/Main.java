// import java.util.ArrayList;
// import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car{
    private String carID;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailable;
    
    public Car(String carID,String brand,String model,double basePricePerDay){
        this.carID=carID;
        this.brand=brand;
        this.model=model;
        this.basePricePerDay=basePricePerDay;
        this.isAvailable=true;
    }

    public String getCarID() {
        return carID;
    }
    public String getbrand(){
        return brand;
    }
    public String getmodel(){
        return model;
    }
    public double getbasePricePerDay(){
        return basePricePerDay;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public double calculatePrice(int rentalDays){
        return basePricePerDay*rentalDays;
    }
    public void rent(){
        isAvailable =false;
    }
    public void returnCar(){
        isAvailable=true;
    }
    
}
class Customer{
    private String customerId;
    private String name;
   

    public Customer(String customerId, String name ){
        this.customerId=customerId;
        this.name=name;
       
    }
    public String getCustomerId(){
        return customerId;
    }
    public String getName(){
        return name;
    }
   
    
}
class Rental{
    private Car car;
    private Customer customer;
    private int days;

    public Rental(Car car, Customer customer,int days){
        this.customer=customer;
        this.car =car; 
        this.days=days;
    }
    public Car getCar(){
        return car;
    }
    public Customer getCustomer(){
        return customer;
    }
    public int getDays(){
        return days;
    }
}
class CarRentalSystem{
    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;

    public CarRentalSystem(){
        cars=new ArrayList<>();
        customers= new ArrayList<>();
        rentals= new ArrayList<>();
    }
    public void addCar(Car car){
        cars.add(car);
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void rentCar(Car car,Customer customer,int days){
        if (car.isAvailable()) {
            car.rent();
            rentals.add(new Rental(car, customer, days));

        }
        else{
            System.out.println("car is not Available for rent!");
        }
    }
    public void returnCar(Car car){
        Rental rentalToRemove= null;
        for (Rental rental : rentals) {
            if (rental.getCar() == car) {
                rentalToRemove= rental;
                break;
            }
        }
        if (rentalToRemove !=null) {
            rentals.remove(rentalToRemove);
            System.out.println("Car is returned Successfully!");
        }
        else{
            System.out.println("Car was not rented!");
        }
    }

    public void menu(){
        Scanner scanner =new Scanner(System.in);


        while (true) {
            System.out.println("===== Car Rental System=====");
            System.out.println("1. Rent a Car");
            System.out.println("2.Return a Car");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");

            int choice = scanner.nextInt();
            scanner.nextLine();//consume newline
            if (choice==1) {
                System.out.println("\n Rent a Car\n");
                System.out.println("Enter your name:");
                String customerName= scanner.nextLine();

                System.out.println("\n Availabe Cars\n");
                for (Car car : cars) {
                    if (car.isAvailable()) {
                        System.out.println(car.getCarID()+" - "+car.getbrand()+ " " +car.getmodel());
                    }

                }
                System.out.println("\n enter the car ID that you want to rent!\n");
                String carId= scanner.nextLine();

                System.out.println("Enter the number of days for the rental!");
                int rentalDays= scanner.nextInt();
                scanner.nextLine();

                Customer newCustomer =new Customer("CUS" +(customers.size()+1),customerName);
                addCustomer(newCustomer);

                Car selectedCar=null;
                for (Car car : cars) {
                    if (car.getCarID().equals(carId)&& car.isAvailable()) {
                        selectedCar=car;
                        break;
                    }

                }
                if (selectedCar!=null) {
                    double totalPrice=selectedCar.calculatePrice(rentalDays);
                    System.out.println("\n =====Rental Informations=====\n");
                    System.out.println("Customer ID: "+newCustomer.getCustomerId());
                    System.out.println("Customer Name: "+newCustomer.getName());
                    System.out.println("Car"+selectedCar.getbrand()+" "+selectedCar.getmodel());
                    System.out.println("Rental Days: "+rentalDays);
                    System.out.printf("Total Price: $%.2f%n",totalPrice);

                    System.out.print("\nConfirm Rental (Y/N)");
                    String confirm =scanner.nextLine();
                    if (confirm.equalsIgnoreCase("Y")) {
                        rentCar(selectedCar, newCustomer, rentalDays);
                        System.out.println("\nCar Rented successfully!");


                    }
                    else{
                        System.out.println("\nRental Cancelled!");
                    }
                }
                else{
                    System.out.println("\nInvalid car selection or car not avaialable for Rent!");
                }


            }
            else if(choice==2){
                System.out.println("\n ====Return a Car====\n");
                System.out.println("Enter the car ID you want to return.");
                String carId =scanner.nextLine();

                Car carToReturn=null;
                for (Car car : cars) {
                    if (car.getCarID().equals(carId)&& !car.isAvailable()) {
                        carToReturn=car;
                        break;
                    }
                }
                if (carToReturn !=null) {
                    Customer customer=null;
                    for (Rental rental: rentals) {
                        if (rental.getCar()==carToReturn) {
                            customer =rental.getCustomer();
                            break;
                        }

                    }
                    if (customer !=null) {
                        returnCar(carToReturn);
                        System.out.println("Car returned successfully! "+customer.getName());
                    }
                    else{
                        System.out.println("Car was not returned or rental informations is missing! ");
                    }
                }
            }
            else if (choice==3) {
                break;
            }
            else{
                System.out.println("Invalid choice Please Enter the valid choice");
            }
        }
        System.out.println("Thank you for using the Car Rental System!");
    }

}


public class Main {

    public static void main(String[] args) {
        CarRentalSystem rentalSystem=new CarRentalSystem();
        Car car1= new Car("C001", "Toyota","Canry" , 1500);
        Car car2 =new Car("C002", "Suzuki", "Xli", 1200);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        
        rentalSystem.menu();
    }
}