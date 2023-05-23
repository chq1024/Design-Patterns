package builder.example1;

/**
 * @author bk
 */
public class Application {


    public static void main(String[] args) {
        Person person = new Person.Builder().setName("chuhq").setNickName("beikei").build();
    }
}
