package org.example.java_professional_renewed.json.ex_003_jackson;



import org.example.java_professional_renewed.json.ex_003_jackson.parser.JacksonParser;

import java.io.IOException;

/**
 * Created by Ivan Maksimchuk.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        JacksonParser.parseJson("file:///C:/Users/Maksimchuk%20Ivan/Downloads/currencies.json-master/currencies.json-master/currencies.json");
    }
}
