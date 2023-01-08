package strategy;

import lombok.Getter;
import lombok.Setter;

public class Client {
    private static int count = 0;
    @Getter
    private final int id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int age;
    @Getter @Setter
    private Gender sex;
    @Getter @Setter
    private String email;

    Client(String name, int age, Gender sex, String email) {
        this.id = count++;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }
}
