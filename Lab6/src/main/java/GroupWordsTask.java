import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GroupWordsTask {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        while (sc.hasNext()) {
            data.add(sc.next());
        }
        System.out.println(groupIt(data));
    }

    public static Map<String, Integer> groupIt(List<String> data) {
        return data.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0))).entrySet().stream()
                .collect(Collectors.toMap(
                        ch -> String.valueOf(ch.getKey()),
                        x -> x.getValue().stream().map(
                                s -> (int) s.chars()
                                        .filter(ch -> ch == x.getKey()).count()
                        ).collect(Collectors.toList()).stream().mapToInt(i -> i).sum())
                );
    }
}
