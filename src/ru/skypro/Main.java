package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);

        for (int i : arr) {
            sum += i; // sum = sum + i
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
//        System.out.println(Arrays.toString(arr));

    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }

        }
        System.out.println("Минимальные затраты за день: " + min);
        System.out.println("Максимальные затраты за день: " + max);
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (float) result / arr.length + " рублей");
//        {
//        int[] nums = {2, 3, 4};
//        int result = 0;
//        for (int m : nums) {
//            result += m;
//        }
//        System.out.println("Значение среднего арифметического равно: " + result / nums.length);
//    }

    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);

        }
        System.out.println();
//        char[] chars = {71, 79, 68};
//        for (int i = chars.length - 1; i >= 0; i--) {
//            if (i == 0) {
//                System.out.println(chars[i]);
//            } else {
//                System.out.print(chars[i] + ", ");
//            }
//        }
    }
// Далее задачи с субботней консультации, честно списал которые. Посмотрел видео,
// вроде разобрался как должно работать
    public static void task5() {

        int matrix[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int d = 0; d < 3; d++) {
                matrix[i][d] = 1;
                System.out.print(matrix[i][d] + " ");
            }
            System.out.println();
        }

    }

    public static void task6() {

        int matrix[][] = new int[3][3];

        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int d = 0; d < 3; d++) {
                matrix[i][d] = value;
                value++;
                System.out.print(matrix[i][d] + " ");
            }
            System.out.println();
        }

    }
}
