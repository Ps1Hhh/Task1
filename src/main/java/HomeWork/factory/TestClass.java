package HomeWork.factory;

public class TestClass {
    public static void main(String[] args) {
        ICoffee espresso = CoffeeFactory.createCoffee("espresso");
        espresso.prepare();

        ICoffee americano = CoffeeFactory.createCoffee("americano");
        americano.prepare();
    }
}
