public class Main {
  public static void main(String[] args) {
    
    Car car1 = new Car(2020, "Honda", "Civic", "Red", 16, 4, true, "Spare tire out of air, Minor cosmetic scratches on hood");
    System.out.println(car1.get_description());
        
    Car car2 = new Car(2026, "Kia", "Seltos", "Teal", 18, 4, false, "Spare tire was used, needs to be replaced");
    System.out.println(car2.get_description());
    
    System.out.println(Car.get_car_count());
  }     
}
