package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.HashMap;

import DB.QueryFormatter.InsertQueryFormatter;
import DB.QueryFormatter.UpdateQueryFormatter;

public final class DB {
    String host = "localhost:3306", database = "testdb", userName = "root", password = "";
    Connection connection;

    public DB() throws Exception {
        this.setConnection();
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

    public void update(String table, HashMap<String, String> data, int id) throws Exception {
        String values = UpdateQueryFormatter.getValues(data);
        try {
            PreparedStatement statement = this.connection
                    .prepareStatement("UPDATE " + table + " SET " + values + " WHERE id = " + id);
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Update Completed.");
        }
    }

    public void delete(String table, int id) throws Exception {
        try {
            PreparedStatement statement = this.connection
                    .prepareStatement("DELETE FROM " + table + " WHERE id = " + id);
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Delete Completed.");
        }
    }

    public void insert(String table, HashMap<String, String> data) throws Exception {
        String columns = InsertQueryFormatter.getColumns(data);
        String values = InsertQueryFormatter.getValues(data);
        try {
            PreparedStatement statement = this.connection
                    .prepareStatement("INSERT INTO " + table + " (" + columns + ") VALUES (" + values + ")");
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Insert Completed.");
        }
    }

}
