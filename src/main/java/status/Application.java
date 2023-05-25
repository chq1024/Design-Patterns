package status;

/**
 * @author bk
 */
public class Application {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStatus(new ApplyStatus());
        context.agree();
        context.delete();
    }
}
