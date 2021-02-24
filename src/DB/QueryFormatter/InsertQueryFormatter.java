package DB.QueryFormatter;

import java.util.LinkedHashMap;

public class InsertQueryFormatter {
    public static String getColumns(LinkedHashMap<String, String> data) {
        String columns = "";
        int i = 0;
        for (String key : data.keySet()) {
            columns += key;
            if (i != data.keySet().size() - 1)
                columns += ", ";
            i++;
        }
        return columns;
    }

    public static String getValues(LinkedHashMap<String, String> data) {
        String values = "";
        int i = 0;
        for (String key : data.values()) {
            values += "'" + key + "'";
            if (i != data.values().size() - 1)
                values += ", ";
            i++;
        }
        return values;
    }
}
