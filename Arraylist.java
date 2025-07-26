//my arraylistlist with localdate,localtime and a method to print carspecs
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Arraylist {
    static ArrayList<String> car = new ArrayList<>();
    static ArrayList<String> tires = new ArrayList<>();
    static ArrayList<Float> eng = new ArrayList<>();

    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
        System.out.println(dt);

        LocalTime obj = LocalTime.now();
        System.out.println(obj);

        System.out.println("Car types we have are SUV, hatchbacks, and sedan:");
        System.out.println("Please enter car type:");

        Scanner s1 = new Scanner(System.in);

        
        car.add("suv");
        car.add("hatchback");
        car.add("sedan");
        car.add("mpv");

      
        tires.add("big");
        tires.add("medium");
        tires.add("small");

        
        eng.add(50.0f);
        eng.add(5000f);
        eng.add(500f);

        String type = s1.nextLine().toLowerCase();
        printCarSpecs(type);

        LocalTime obj1 = LocalTime.now();
        System.out.println(obj1);
    }

    public static void printCarSpecs(String type) {
        if (type.equals(car.get(0))) {
            System.out.println("Tire size = " + tires.get(0) + " | Engine power = " + eng.get(0));
        } else if (type.equals(car.get(1))) {
            System.out.println("Tire size = " + tires.get(1) + " | Engine power = " + eng.get(1));
        } else if (type.equals(car.get(2))) {
            System.out.println("Tire size = " + tires.get(2) + " | Engine power = " + eng.get(2));
        } else {
            System.out.println("Not available");
        }
    }
}
