package HomeWork.factory;

public class TestClass {
    public static void main(String[] args) {
        // Создаем эспрессо через фабрику
        ICoffee espresso = CoffeeFactory.createCoffee("espresso");
        espresso.prepare();

        // Создаем американо через фабрику
        ICoffee americano = CoffeeFactory.createCoffee("americano");
        americano.prepare();
    }
}
