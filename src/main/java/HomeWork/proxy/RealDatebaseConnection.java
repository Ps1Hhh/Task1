package HomeWork.proxy;

public class RealDatebaseConnection implements IDatabaseConnection {
    private String databaseName;

    public RealDatebaseConnection(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void connect() {
        System.out.println("Connected to database: " + databaseName);
    }
}
