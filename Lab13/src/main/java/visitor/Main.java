package visitor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Signature<Integer> signatureOne =
                new Signature<>(System.out::println);
        Signature<Integer> signatureTwo =
                new Signature<>(x -> System.out.println(x * x));
        Signature<Integer> signatureThree =
                new Signature<>(x -> System.out.println(x * x * x));
        Group<Integer> nestedGroup = new Group<>();
        Group<Integer> group = new Group<>();

        nestedGroup.addTask(signatureOne).addTask(signatureTwo);
        group.addTask(nestedGroup).addTask(signatureThree);
        group.apply(new Scanner(System.in).nextInt());

        group.stamp(new StampingVisitor<>());
        System.out.println(signatureOne.getHeader("groups"));
    }
}
