package bridging;

/**
 * 具体实现类
 * @author bk
 */
public class RefPerson implements RefObj {

    private String gender;

    public RefPerson(String gender) {
        this.gender = gender;
    }

    @Override
    public String printUUID() {
        return gender;
    }
}
