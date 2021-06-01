package hanshunping;

/**
 * @author naplessunshine
 * @version 1.0.0
 */
public class StaticMethodTest {
    public static void main(String[] args) {
        StaticMethodFather m1 = new StaticMethodSon();
        m1.staticMethod();
        m1.method();

        StaticMethodSon m2 = new StaticMethodSon();
        m2.staticMethod();
        m2.method();
    }
}
