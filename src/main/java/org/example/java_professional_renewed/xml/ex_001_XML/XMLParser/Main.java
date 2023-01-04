package org.example.java_professional_renewed.xml.ex_001_XML.XMLParser;

import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // Считываем файл.xml
        XMLParser xml = new XMLParser("C:\\Users\\Maksimchuk Ivan\\IdeaProjects\\itvdn\\" +
                "src\\main\\java\\org\\example\\java_professional_renewed\\xml\\ex_001_XML\\XMLParser\\2.xml");

        // Указываем путь, что будем считывать с файла xml
        String value = xml.get("catalog/book/author");
        System.out.println(value);
    }
}
