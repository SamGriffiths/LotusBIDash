/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotusbidashboard;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Jamie
 */
public class SalesDataParser {
    public ObservableList<SalesData> parseJSONData(String json) {
        Type listType = new TypeToken<ArrayList<SalesData>>() {}.getType();
        List<SalesData> dataList = new Gson().fromJson(json, listType);

        return FXCollections.observableArrayList(dataList);
    }
}
