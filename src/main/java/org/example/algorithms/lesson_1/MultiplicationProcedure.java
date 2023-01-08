package org.example.algorithms.lesson_1;

/**
 * Если один метод вызывает другой, то необходимо более тщательно оценить сложность последнего.
 * Если в нем выполняется определённое число простых инструкций, то на оценку сложности это практически не влияет.
 * Если же метод вызывается внутри цикла, то влияние может быть намного больше.
 *
 * В качестве примера рассмотрим два метода: doSlowly со сложностью O(n^3) и doFastly со сложностью O(n^2).
 *
 * Если во внутренних циклах процедуры Fast происходит вызов процедуры Slow, то сложности процедур перемножаются.
 * В данном случае сложность алгоритма составляет O(n^2 )*O(n^3 )=O(n^5)
 */
public class MultiplicationProcedure {

    public static void main(String[] args) {
        doFastly(1, 1);

        System.out.println("Done!");
    }

    /**
     * Method growth rate is O(n<sup>5</sup>)
     *
     * @param firstNum First loop counter
     * @param secondNum Second loop counter
     */
    private static void doFastly(int firstNum, int secondNum) {
        for (int i = 0; i < firstNum; i++) {
            for (int j = 0; j < secondNum; j++) {
                doSlowly(5, 6, 7);
            }
        }
    }

    /**
     * Method growth rate is O(n<sup>3</sup>)
     *
     * @param firstNum First loop counter
     * @param secondNum Second loop counter
     * @param thirdNum Third loop counter
     */
    private static void doSlowly(int firstNum, int secondNum, int thirdNum) {
        int sum = 0;

        for (int i = 0; i < firstNum; i++) {
            for (int j = 0; j < secondNum; j++) {
                for (int k = 0; k < thirdNum; k++) {
                    sum += 1;
                }
            }
        }

        System.out.printf("Sum = %d", sum);
    }
}
