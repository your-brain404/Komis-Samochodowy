
import java.util.HashMap;

import com.mysql.cj.xdevapi.PreparableStatement;

import DB.DB;

public class App {
    public static void main(String[] args) throws Exception {
        DB db = new DB();
        HashMap<String, String> car = new HashMap<String, String>();
        car.put("brand", "Ford");
        car.put("model", "Mustang");
        car.put("Type", "Coupe");
        car.put("price", "200000");

        db.insert("cars", car);
    }

}
