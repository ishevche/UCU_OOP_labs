package visitor;

public class Main {
    public static void main(String[] args) {
        Signature<Integer> s1 = new Signature<>(System.out::println);
        Signature<Integer> s2 = new Signature<>(x -> System.out.println(x * x));
        Signature<Integer> s3 = new Signature<>(x -> System.out.println(x * x * x));
        Group<Integer> nestedGroup = new Group<>();
        Group<Integer> group = new Group<>();

        nestedGroup.addTask(s1).addTask(s2);
        group.addTask(nestedGroup).addTask(s3);
        group.apply(10);

        group.stamp(new StampingVisitor<>());
        System.out.println(s1.getHeader("groups"));
    }
}
