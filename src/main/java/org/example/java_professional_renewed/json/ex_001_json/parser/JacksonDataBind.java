package org.example.java_professional_renewed.json.ex_001_json.parser;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.java_professional_renewed.annotations.ex_001_Annotations.javaDoc.Person;

import java.io.File;
import java.io.IOException;

/**
 * Created by Ivan Maksimchuk.
 */
public class JacksonDataBind {
    public static void parseJson(String path) {
        ObjectMapper objectMapper = new ObjectMapper();

        Person person = null;

        try {
            person = objectMapper.readValue(new File(path), Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(person);
    }
}
