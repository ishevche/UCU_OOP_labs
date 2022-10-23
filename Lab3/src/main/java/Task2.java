import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        MyMan man = new MyMan(0);
        /*Write code HERE*/
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt(); // <- 93

        System.out.println(man.sayAge()); // prints '0'
        changeAge(man, age);
        System.out.println(man.sayAge()); // prints '93'
        /*or HERE*/
    }

    public static void changeAge(Man a, int age){
        ((MyMan) a).changeAge(age);
    }
}

/* even HERE if you want, THIS IS ALL PLACES WHERE YOU CAN WRITE CODE*/
class MyMan extends Man {
    private int myAge;

    public MyMan(int age) {
        myAge = age;
    }

    @Override
    public int sayAge() {
        return myAge;
    }

    public void changeAge(int newAge) {
        myAge = newAge;
    }
}

class Man {
    /* but not here */
    private int age;

    public Man(){
        age = 0;
    }

    public Man(int age){
        this.age = age;
    }

    public int sayAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                '}';
    }
}
