import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MapTask {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        while (sc.hasNext()) {
            data.add(sc.next());
        }
        System.out.println(mapping(data));
    }

    public static List<Integer> mapping(List<String> data) {
        return data.stream().filter(s -> {
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException ignored) {
                return false;
            }
        }).map(Integer::parseInt).collect(Collectors.toList());
    }
}