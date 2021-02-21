package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public final class DB {
    String host, database, userName, password;
    Connection connection;

    public DB(String host, String database, String userName, String password) throws Exception {
        this.host = host;
        this.database = database;
        this.userName = userName;
        this.password = password;
        this.setConnection();
    }

    public void insert() throws Exception {

    }

    public void setConnection() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://" + this.host + "/" + this.database;
            this.connection = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Connected to database");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
