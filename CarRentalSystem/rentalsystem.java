package CarRentalSystem;
/*
import java.util.ArrayList;
import java.util.Scanner;

class car{
    private int id;
    private String modal;
    private String brand;
    private double basePricePerDay;
    private boolean isAvalable;
    car(int id,String modal,String brand, double basePricePerDay){
        this.id=id;
        this.modal=modal;
        this.brand=brand;
        this.basePricePerDay=basePricePerDay;
        this.isAvalable=true;
    }
    public int getId(){
        return id;
    }
    public String getModal(){
        return modal;
    }
    public String getBrand(){
        return brand;
    }
    public double getBasePrice(){
        return basePricePerDay;
    }
    public boolean getIsAvalable(){
        return isAvalable;
    }
    public void rent(){
        isAvalable=false;
    }
    public void returncar(){
        isAvalable= true;
    }
    public double calculatePrice(int rentalDays){
        return basePricePerDay + rentalDays;
    }
}
class coustomer{
    int coustomerId;
    String name;
    coustomer(int coustomerId, String name){
        this.coustomerId=coustomerId;
        this.name=name;
    }
    public int getCoustomerId(){
        return coustomerId;
    }
    public String getName(){
        return name;
    }

}
class rental{
    public Car car;
    public Coustomer coustomer;
    public int days;
    rental(Car car,Coustomer coustomer,int days){
        this.car=car;
        this.coustomer=coustomer;
        this.days=days;
    }
    public Car getCar(){
        return car;
    }
    public Coustomer getCoustomer() {
        return coustomer;
    }
    public int getDays(){
        return days;
    }


}
class carRentelSystem{
    private List<Car> cars;
    private List<Coustomer> coustomers;
    private List<Rental> rentals;
    public carRentelSystem(){
        cars= new ArrayList<>();
        coustomers= new ArrayList<>();
        rentals = new ArrayList<>();
    }
    public void addCar(Car car){
        cars.add(car);
    }
    public void addCoustomer(Coustomer coustomer){
        coustomers.add(coustomer);
    }
    public void rentCar(Car car, Coustomer coustomer,int days){
        if(car.isAvalable()){
            car.rent();
            rentals.add(new Rental(car,coustomer,days));
        }else {
            System.out.println("Car is not available for rent. ");
        }
    }
    public void returnCar(Car car){
        car.returnCar();
        Rental rentalToRemove= null;
        for (Rental rental:rentals){
            if (rental.getCar()==car){
                rentalToRemove=rental;
                break;
            }
        }
        if (rentalToRemove!=null){
            rentals.remove(rentalToRemove);
            System.out.println("Car return succesfully. ");
        }else {
            System.out.println("Car was not return. ");
        }
    }
    public void menu(){
        Scanner sc= new Scanner(System.in);
        while (true){
            System.out.println("CAR RENTAL SYSTEM");
            System.out.println("1.Rent a car \n2.Return a car \n3.Exit");
            System.out.println("Enter your choice: ");
            int choice=new sc.nextInt();
            sc.nextLine();//CONSUMER NEWlINE
            if (choice==1){
                System.out.println("\nRENT A CAR ");
                System.out.println("Enter your name: ");
                String customerName= sc.nextLine();
                System.out.println("\n Avalable cars: ");
                for (Car car:cars){
                    if (car.isAvalable()){
                        System.out.println(car.getId()+" "+car.getModel());
                    }
                }
            }



        }
    }


}*/
public class rentalsystem {
    public static void main(String[]args){
//        car c1=new car(234, "thar", "mahindra",2500);
//      System.out.println(c1.getId());


    }
}
