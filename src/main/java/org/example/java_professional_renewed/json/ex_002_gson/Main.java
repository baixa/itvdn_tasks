package org.example.java_professional_renewed.json.ex_002_gson;

import org.example.java_professional_renewed.json.ex_002_gson.parser.GsonParser;

import java.io.IOException;

/**
 * Created by Ivan Maksimchuk.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        GsonParser.parseJson("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    }
}
