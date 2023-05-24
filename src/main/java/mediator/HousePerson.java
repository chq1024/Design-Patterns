package mediator;

/**
 * @author bk
 */
public class HousePerson extends Person{

    public HousePerson(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constant(String message) {
        mediator.constact(message,this);
    }

    public void getMessage(String message) {
        System.out.println(message);
    }
}
