package org.example.algorithms.itvdn;

/**
 * Если основная программа вызывает методы по очереди, то их сложности складываются: O(n^2 )+O(n^3)=O(n^3).
 */
public class AdditionProcedure {

    public static void main(String[] args) {
        doSlowly(1, 1, 1);
        doFastly(2, 2);

        System.out.println("Done!");
    }

    /**
     * Method growth rate is O(n<sup>2</sup>)
     *
     * @param firstNum First loop counter
     * @param secondNum Second loop counter
     */
    private static void doFastly(int firstNum, int secondNum) {
        int sum = 0;

        for (int i = 0; i < firstNum; i++) {
            for (int j = 0; j < secondNum; j++) {
                sum += 1;
            }
        }

        System.out.printf("Sum = %d", sum);
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
