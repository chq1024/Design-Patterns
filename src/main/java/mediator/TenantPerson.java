package mediator;

/**
 * @author bk
 */
public class TenantPerson extends Person{

    public TenantPerson(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String msg) {
        mediator.constact(msg,this);
    }

    public void getMessage(String msg) {
        System.out.println(msg);
    }
}
