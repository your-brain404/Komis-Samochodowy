
import java.util.LinkedHashMap;

import com.mysql.cj.xdevapi.PreparableStatement;

import DB.DB;

public class App {
    public static void main(String[] args) throws Exception {
        DB db = new DB();
        LinkedHashMap<String, String> car = new LinkedHashMap<String, String>();
        car.put("brand", "Ford");
        car.put("model", "Mustang");
        car.put("Type", "Coupe");
        car.put("price", "200000");

        db.insert("cars", car);
    }

}
