package Tests;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashMap;

import DB.QueryFormatter.UpdateQueryFormatter;

public class UpdateQueryFormatterTest {
    @org.junit.Test
    public void getValuesReturnsValidString() {
        LinkedHashMap<String, String> data = new LinkedHashMap<String, String>();
        data.put("brand", "Toyota");
        data.put("model", "Yaris");
        data.put("price", "123");
        data.put("type", "Coupe");
        assertEquals("brand = 'Toyota', model = 'Yaris', price = '123', type = 'Coupe'",
                UpdateQueryFormatter.getValues(data));
    }

    @org.junit.Test
    public void getValuesReturnsEmptyStringIfGivenEmptyArray() {
        LinkedHashMap<String, String> data = new LinkedHashMap<String, String>();
        assertEquals("", UpdateQueryFormatter.getValues(data));
    }
}
