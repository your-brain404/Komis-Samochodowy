package DB.QueryFormatter;

import java.util.LinkedHashMap;

public class UpdateQueryFormatter {
    public static String getValues(LinkedHashMap<String, String> data) {
        String values = "";
        int i = 0;
        for (String key : data.keySet()) {
            values += key + " = '" + data.get(key) + "'";
            if (i != data.keySet().size() - 1)
                values += ", ";
            i++;
        }
        return values;
    }
}
