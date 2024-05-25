package Java;

import java.util.*;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.concurrent.atomic.AtomicReference;
public class Mains {
    public static void main(String[] args) {
        String jsonStr = "{\"menu\": {\"id\": \"file\",\"value\": \"File\",\"popup\": {\"menuitem\": [{\"value\": \"New\", \"onclick\": \"CreateDoc()\"},{\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},{\"value\": \"Save\", \"onclick\": \"SaveDoc()\"}]}}}";

        JSONObject jsonObject = new JSONObject(jsonStr);
        JSONObject menu = jsonObject.getJSONObject("menu");
        JSONObject popup = menu.getJSONObject("popup");
        JSONArray menuItems = popup.getJSONArray("menuitem");

        // Using AtomicReference to store values atomically
        AtomicReference<StringBuilder> atomicStringBuilder = new AtomicReference<>(new StringBuilder());

        // Using lambda expression to traverse and save each menu item
        menuItems.forEach(item -> {
            JSONObject menuItem = (JSONObject) item;
            StringBuilder stringBuilder = atomicStringBuilder.get();
            String value = menuItem.getString("value");
            String onclick = menuItem.getString("onclick");
            stringBuilder.append("Value: ").append(value).append(", OnClick: ").append(onclick).append("\n");
        });

        // Printing the values stored in the atomic string
        System.out.println(atomicStringBuilder.get().toString());
    }
    }

