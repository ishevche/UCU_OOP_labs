import java.util.Scanner;

interface Learnable {

}

class Human {
    public int age;

    Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Human implements Learnable {
    public String name;
    public String gender;

    Student() {
        super(0);
        this.name = "name";
        this.gender = "gender";
    }

    Student(int age, String name, String gender) {
        super(age);
        this.name = name;
        this.gender = gender;
    }

    public String toString() {
        return "Student{age=" + age + ", name='" + name + "', gender='" + gender + "'}";
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

public class Task4 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = sc.nextInt();
        Student st;
        if (choice == 0) {
            st = new Student();
            System.out.println((st instanceof Learnable) && (st instanceof Human));
        } else if (choice == 1) {
            st = new Student(18, "Oleh", "male");
            System.out.println(st);
        } else if (choice == 2) {
            Human hm = new Student();
            System.out.println(hm.getAge());
        }
    }
}