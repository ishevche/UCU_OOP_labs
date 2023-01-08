import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task1.Gender;
import task1.User;

public class BuilderTest {
    @Test
    public void testIvan() {
        User ivan = User.builder().name("Ivan").age(18).age(19).gender(Gender.MALE).weight(80).height(180).occupation("Student").build();
        Assertions.assertEquals(ivan.getName(), "Ivan");
        Assertions.assertEquals(ivan.getAge(), 19);
        Assertions.assertEquals(ivan.getGender(), Gender.MALE);
        Assertions.assertEquals(ivan.getWeight(), 80);
        Assertions.assertEquals(ivan.getHeight(), 180);
        Assertions.assertEquals(ivan.getOccupations().size(), 1);
        Assertions.assertEquals(ivan.getOccupations().get(0), "Student");
    }

    @Test
    public void testPetro() {
        User petro = User.builder().name("Petro").gender(Gender.MALE).age(27).build();
        Assertions.assertEquals(petro.getName(), "Petro");
        Assertions.assertEquals(petro.getAge(), 27);
        Assertions.assertEquals(petro.getGender(), Gender.MALE);
        Assertions.assertEquals(petro.getWeight(), 0);
        Assertions.assertEquals(petro.getHeight(), 0);
        Assertions.assertEquals(petro.getOccupations().size(), 0);
    }

    @Test
    public void testAlice() {
        User alice = User.builder().name("Alice").gender(Gender.FEMALE).age(21).occupation("Student").occupation("Worker").build();
        Assertions.assertEquals(alice.getName(), "Alice");
        Assertions.assertEquals(alice.getAge(), 21);
        Assertions.assertEquals(alice.getGender(), Gender.FEMALE);
        Assertions.assertEquals(alice.getWeight(), 0);
        Assertions.assertEquals(alice.getHeight(), 0);
        Assertions.assertEquals(alice.getOccupations().size(), 2);
        Assertions.assertEquals(alice.getOccupations().get(0), "Student");
        Assertions.assertEquals(alice.getOccupations().get(1), "Worker");
    }

    @Test
    public void testSomeone() {
        User someone = User.builder().build();
        Assertions.assertNull(someone.getName());
        Assertions.assertEquals(someone.getAge(), 0);
        Assertions.assertNull(someone.getGender());
        Assertions.assertEquals(someone.getWeight(), 0);
        Assertions.assertEquals(someone.getHeight(), 0);
        Assertions.assertEquals(someone.getOccupations().size(), 0);
    }
}