package mediator;

/** 中介模式: 中介,发布者,订阅者
 * 发布者,订阅者实例化的时候把中介传入,在中介类中区分发布者和订阅者应该做的事
 * 然后发布者触发,订阅者触发,就能实现通过中介的交流
 * @author bk
 */
public class Application {

    public static void main(String[] args) {
        HouseMediator mediator = new HouseMediator();
        TenantPerson tenantPerson = new TenantPerson("tenant",mediator);
        HousePerson housePerson = new HousePerson("house",mediator);
        mediator.setSubPerson(tenantPerson);
        mediator.setPubPerson(housePerson);

        tenantPerson.constact("hello,house");
        housePerson.constant("hello,tenant");
    }
}
