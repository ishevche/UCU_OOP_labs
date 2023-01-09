package singleton;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class User {
    private String name;
    private String email;
    private int age;

    public void save() {
        DBConnection dbConnection = DBConnection.getInstance();
        String query = String.format("insert into user (email, name, age)"
                        + " values ('%s', '%s', %d);", email, name, age);
        dbConnection.executeQuery(query);
    }
}
