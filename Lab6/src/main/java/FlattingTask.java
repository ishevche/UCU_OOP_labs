import java.util.*;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class FlattingTask {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        while (sc.hasNext()) {
            data.add(sc.next());
        }
        System.out.println(flattingStrings(data));
    }

    public static List<String> flattingStrings(List<String> data) {
        return data.stream().map(s -> s.chars().mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.toList()))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}