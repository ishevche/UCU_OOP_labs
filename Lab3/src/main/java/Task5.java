import java.util.Scanner;

public class Task5 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()) {
            String word = sc.next();
            for (int i = word.length() - 1; i > -1; --i) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
