public class Car {
    
    private static int car_count = 0;
    
    private int year;
    private String make;
    private String model;
    private String color;
    private int wheel_size;
    private int wheels;
    private boolean spare_tire;
    private String additonal_notes;
    
    public Car(int year, String make, String model, String color, int wheel_size, int wheels, boolean spare_tire, String additonal_notes) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.wheel_size = wheel_size;
        this.wheels = wheels;
        this.spare_tire = spare_tire;
        this.additonal_notes = additonal_notes;
        
        car_count++;
    }
    
    public String get_description(){
        return String.format("%d %s %s (Color: %s) \n -Wheel Size: %d in. \n -Number of Wheels: %d \n -Spare Tire: %s \n Additonal Notes: %s \n\n",
                            this.year, this.make, this.model, this.color, this.wheel_size, this.wheels, this.spare_tire ? "Yes" : "No", this.additonal_notes);
    }
    public static String get_car_count(){
        return String.format("Total Car Inventory = %d", car_count);
    }    
}
