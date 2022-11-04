import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(fizzBuzzIt(sc.nextInt()));
    }

    public static List<String> fizzBuzzIt(int n) {
        return IntStream.range(1, n + 1).mapToObj(num -> {
            String ans = "";
            if (num % 3 != 0 && num % 5 != 0) {
                ans = String.valueOf(num);
            } else if (num % 3 == 0 && num % 5 != 0) {
                ans = "Fizz";
            } else if (num % 3 != 0) {
                ans = "Buzz";
            } else {
                ans = "Fizz Buzz";
            }
            return ans.toString();
        }).collect(Collectors.toList());
    }
}