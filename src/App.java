
import com.mysql.cj.xdevapi.PreparableStatement;

public class App {
    public static void main(String[] args) throws Exception {
        post();
    }

    public static void createTable() throws Exception {
        try {
            Connection conn = getConnection();
            PreparedStatement create = conn.prepareStatement(
                    "CREATE TABLE IF NOT EXISTS iamalive(id int NOT NULL AUTO_INCREMENT, first varchar(255), last varchar(255), PRIMARY KEY (id))");
            create.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Function complete.");
        }
    }

    public static void post() throws Exception {
        final String var1 = "John";
        final String var2 = "Miller";

        try {
            Connection conn = getConnection();
            PreparedStatement posted = conn
                    .prepareStatement("INSERT INTO iamalive (first, last) VALUES ('" + var1 + "', '" + var2 + "')");
            posted.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Insert Completed.");
        }
    }

}
