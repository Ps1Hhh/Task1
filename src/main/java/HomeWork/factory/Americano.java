package HomeWork.factory;

public class Americano implements ICoffee {
    @Override
    public void prepare() {
        System.out.println("Preparing an Americano...");
    }
}
