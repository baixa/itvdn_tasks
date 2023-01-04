package org.example.java_professional_renewed.json.ex_003_jackson.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.java_professional_renewed.json.ex_003_jackson.entity.Currency;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by Ivan Maksimchuk.
 */
public class JacksonParser {
    public static void parseJson(String url) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Currency[] currencyRates = objectMapper.readValue(new URL(url), Currency[].class);

        for (Currency currencyRate : currencyRates) {
            System.out.println(currencyRate);
        }

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter()
                                        .writeValueAsString(currencyRates);

        Files.write(Paths.get("C:\\Users\\Maksimchuk Ivan\\IdeaProjects\\itvdn\\src\\main\\resources\\jacksonCurrency.json"),
                jsonString.getBytes(), StandardOpenOption.CREATE);
    }
}
