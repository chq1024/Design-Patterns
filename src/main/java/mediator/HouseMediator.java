package mediator;

/**
 * @author bk
 */
public class HouseMediator extends Mediator {


    private TenantPerson subPerson;

    private HousePerson pubPerson;


    public void setSubPerson(TenantPerson person) {
        this.subPerson = person;
    }

    public void setPubPerson(HousePerson person) {
        this.pubPerson =  person;
    }


    @Override
    public void constact(String msg, Person person) {
        if (person == subPerson) {
            subPerson.getMessage(msg);
        } else {
            pubPerson.getMessage(msg);
        }
    }
}
