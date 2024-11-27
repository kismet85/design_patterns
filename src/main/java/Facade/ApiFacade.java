package Facade;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiFacade {

    public String getAttributeValue(String urlString, String attributeName) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            String json;
            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                json = content.toString();
            } finally {
                con.disconnect();
            }

            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(json);

            String[] keys = attributeName.split("\\.");
            Object value = jsonObject;
            for (String key : keys) {
                value = ((JSONObject) value).get(key);
                if (value == null) {
                    return "Attribute not found.";
                }
            }

            return value.toString();

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return "Invalid attribute.";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error reading the URL.";
        } catch (ParseException e) {
            e.printStackTrace();
            return "Error parsing JSON response.";
        }
    }
}