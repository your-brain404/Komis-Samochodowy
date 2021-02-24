package Tests;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashMap;

import DB.QueryFormatter.InsertQueryFormatter;

public class InsertQueryFormatterTest {

    @org.junit.Test
    public void getColumnsReturnsValidString() {
        LinkedHashMap<String, String> data = new LinkedHashMap<String, String>();
        data.put("brand", "Toyota");
        data.put("model", "Yaris");
        data.put("price", "123");
        data.put("type", "Coupe");
        assertEquals("brand, model, price, type", InsertQueryFormatter.getColumns(data));
    }

    @org.junit.Test
    public void getColumnsReturnsEmptyStringIfGivenEmptyArray() {
        LinkedHashMap<String, String> data = new LinkedHashMap<String, String>();
        assertEquals("", InsertQueryFormatter.getColumns(data));
    }

    @org.junit.Test
    public void getValuesReturnsValidString() {
        LinkedHashMap<String, String> data = new LinkedHashMap<String, String>();
        data.put("brand", "Toyota");
        data.put("model", "Yaris");
        data.put("price", "123");
        data.put("type", "Coupe");
        assertEquals("'Toyota', 'Yaris', '123', 'Coupe'", InsertQueryFormatter.getValues(data));
    }

    @org.junit.Test
    public void getValuesReturnsEmptyStringIfGivenEmptyArray() {
        LinkedHashMap<String, String> data = new LinkedHashMap<String, String>();
        assertEquals("", InsertQueryFormatter.getValues(data));
    }
}
