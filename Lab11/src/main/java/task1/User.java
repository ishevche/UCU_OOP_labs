package task1;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder @Getter @Setter
public class User extends Human {
    private String email;
    private String data;
}