package HomeWork.singletone;

public class TestClass {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.classLogg(new TestClass(), "Some info");
    }
}
