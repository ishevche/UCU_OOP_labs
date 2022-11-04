import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LexicographicTask {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        while (sc.hasNext()) {
            data.add(sc.next());
        }
        print(data);
    }

    public static void print(List<String> data) {
        data.sort(String::compareTo);
        for (String string: data) {
            System.out.println(string);
        }
    }
}