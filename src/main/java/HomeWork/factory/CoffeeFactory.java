package HomeWork.factory;

public class CoffeeFactory {
    public static ICoffee createCoffee(String type){
        switch (type.toLowerCase()){
            case "espresso":
                return new Espresso();
            case "americano":
                return new Americano();
                default:
                    throw new IllegalArgumentException("Unknown coffe type: " + type);
        }
    }
}
