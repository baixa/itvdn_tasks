package org.example.java_professional_renewed.json.ex_002_gson.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import org.example.java_professional_renewed.json.ex_002_gson.entity.Currency;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by Ivan Maksimchuk.
 */
public class GsonParser {
    public static void parseJson(String url) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();

        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();

        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));

        Currency[] currencyRates = gson.fromJson(jsonReader, Currency[].class);

        for (Currency currencyRate : currencyRates) {
            System.out.println(currencyRate);
        }

        String gsonString = gson.toJson(currencyRates);

        Files.write(Paths.get("C:\\Users\\Maksimchuk Ivan\\IdeaProjects\\itvdn\\src\\main\\resources\\gsonCurrency.json"),
                    gsonString.getBytes(), StandardOpenOption.CREATE);
    }
}
