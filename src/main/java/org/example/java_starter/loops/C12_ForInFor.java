package org.example.java_starter.loops;

public class C12_ForInFor {
    // Цикл for вложенный в цикл for. ( Построение квадрата из звездочек - * )

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            // Выводим одну строку из 9 звездочек.
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // Переход на новую строку.
            System.out.println();
        }
    }
}
