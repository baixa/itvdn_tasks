package org.example.java_professional_renewed.json.ex_002_gson;

import org.example.java_professional_renewed.json.ex_002_gson.parser.GsonParser;

import java.io.IOException;

/**
 * Created by Ivan Maksimchuk.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        GsonParser.parseJson("file:///C:/Users/Maksimchuk%20Ivan/Downloads/currencies.json-master/currencies.json-master/currencies.json");
    }
}
