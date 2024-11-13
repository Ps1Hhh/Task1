package HomeWork.proxy;

public class DatabaseProxy implements IDatabaseConnection{
    private String databaseName;
    private RealDatebaseConnection realDatebaseConnection;

    public DatabaseProxy(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void connect(){
        String fullUrl = "jdbc:mysql://localhost:3306/" + databaseName;
        if(realDatebaseConnection == null){
            realDatebaseConnection = new RealDatebaseConnection(fullUrl);
        }

        System.out.println("Proxy: Redirecting to real connection...");
        realDatebaseConnection.connect();
    }
}
