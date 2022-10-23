import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class House {
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private double area;
    private double numberOfFloors;

    House(int numberOfBedrooms, int numberOfBathrooms, double area, double numberOfFloors) {
        this.area = area;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", area=" + area +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    public static House createFromText(String text) {
        // Implement static factory method
        Matcher area = Pattern.compile("([\\d,]+)\\s+[sS]q[.\\s]*[Ff]t").matcher(text);
        Matcher beds = Pattern.compile("(\\d+)\\s+[Bb]ed").matcher(text);
        Matcher bath = Pattern.compile("(\\d+)\\s+[Bb]ath").matcher(text);
        area.find();
        beds.find();
        bath.find();
        String area_str = area.group(1).replaceAll(",", "");
        String beds_str = beds.group(1);
        String bath_str = bath.group(1);
        double area_val = Double.parseDouble(area_str);
        return new House(Integer.parseInt(beds_str),
                Integer.parseInt(bath_str),
                area_val,
                area_val > 2800 ? 2.5 : 1);
    }
}


public class Task3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String text = sc.nextLine();
        System.out.println(House.createFromText(text));
    }
}
