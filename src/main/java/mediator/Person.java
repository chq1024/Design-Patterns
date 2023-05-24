package mediator;

/**
 * @author bk
 */
public class Person {

    private String name;
    public Mediator mediator;

    public Person(String name,Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
