package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import model.BankAutomat;

import java.util.List;

public class JsonConverter {

    private final Gson gson;

    public JsonConverter() {

        gson = new GsonBuilder().create();
    }

    public String convertToJson(List<BankAutomat> bankAutomatList) {

        JsonArray jarray = gson.toJsonTree(bankAutomatList).getAsJsonArray();
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("bankAutomats", jarray);

        return jsonObject.toString();
    }
}
