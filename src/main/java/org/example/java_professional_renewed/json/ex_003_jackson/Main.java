package org.example.java_professional_renewed.json.ex_003_jackson;



import org.example.java_professional_renewed.json.ex_003_jackson.parser.JacksonParser;

import java.io.IOException;

/**
 * Created by Ivan Maksimchuk.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        JacksonParser.parseJson("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    }
}
