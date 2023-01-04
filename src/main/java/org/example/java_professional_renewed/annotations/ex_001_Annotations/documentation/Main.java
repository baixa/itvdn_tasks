package org.example.java_professional_renewed.annotations.ex_001_Annotations.documentation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author M. Ivan
 */
public class Main {
    // Аннотация @Documented - документирует в JavaDoc
    @Documented
    @Target(ElementType.METHOD)
    @interface ClassPreamble {
        String author();
        String date();
        int currentRevision() default 1;
        String lastModified() default "N/A";
        String lastModifiedBy() default "N/A";
        String[] reviewers();
    }

    // Тело аннотации содержит описание элементов аннотации
    @ClassPreamble(
            author = "Ivan",
            date = "24/06/2018",
            currentRevision = 5,
            lastModified = "24/06/2018",
            lastModifiedBy = "Ivan Maksimchuk",
            reviewers = {"Ivan", "Alex", "Bob"}
    )
    public static void main(String[] args) {
    }
}

