package HomeWork.proxy;

public class TestClass {
    public static void main(String[] args) {
        IDatabaseConnection proxy = new DatabaseProxy("myDatabase");

        proxy.connect();
    }
}
