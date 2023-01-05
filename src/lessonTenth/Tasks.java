package lessonTenth;

import java.util.Random;
import java.util.Scanner;

public class Tasks {


    public static void main(String[] args) {

        System.out.println("TASK FIRST");
//    1) Необходимо, чтоб программа выводила на экран вот такую последовательность:
//            7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int i = 1; i <= 14; i++) {
            System.out.print(i * 7 + " ");
        }

        System.out.println("    \n  \nTASK SECOND");
//      2) Организовать беспрерывный ввод чисел с клавиатуры, пока пользователь не введёт 0.
//    После ввода нуля, показать на экран количество чисел, которые были введены, их общую сумму и среднее арифметическое.
//    Подсказка: необходимо объявить переменную-счетчик, которая будет считать количество введенных чисел, и переменную,
//    которая будет накапливать общую сумму чисел.

        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        int sum = 0;
        double average;
        System.out.println("Введите числа: ");

        do {
            number = scanner.nextInt();
            count++;
            sum += number;
            average = (double) sum / count;
        } while (number != 0);

        System.out.println("Количество введенных чисел: " + count);
        System.out.println("Сумма введенных чисел: " + sum);
        System.out.println("Среднее арифметическое введенных чисел: " + Math.round(average * 100.0) / 100.0);


        System.out.println("    \n  \nTASK THIRD");
//      3) Необходимо суммировать все нечётные целые числа в диапазоне, который введёт пользователь с клавиатуры.
//    Например от 10 до 100
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите первое число диапазона: ");
        int first = scanner1.nextInt();
        System.out.println("Введите последнее число диапазона: ");
        int last = scanner1.nextInt();
        int sum1 = 0;

        for (int i = first; i <= last; i++) {
            if (i % 2 != 0) {
                sum1 += i;
            }
        }
        System.out.println("Сумма нечетных чисел в данном числовом диапазоне: " + sum1);


        System.out.println("    \n  \nTASK FOURTH");
//     4)Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.
        Random random = new Random();
        int num = random.nextInt(100, 999);

        int firstNum = num / 100;
        int secondNum = num / 10 % 10;
        int thirdNum = num % 10;

        if (firstNum > secondNum && firstNum > thirdNum) {
            System.out.println("В числе " + num + " наибольшая цифра " + firstNum);
        } else if (secondNum > firstNum && secondNum > thirdNum) {
            System.out.println("В числе " + num + " наибольшая цифра " + secondNum);
        } else System.out.println("В числе " + num + " наибольшая цифра " + thirdNum);


        System.out.println("    \n  \nTASK FIFTH");
//      5) Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
//            (заранее не известно сколько цифр будет в числе)
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите любое число: ");
        int index = scanner.nextInt();
        int sum2 = 0;

        while (index != 0) {
            sum2 += (index % 10);
            index /= 10;
        }
        System.out.println("Сумма цифр, составляющих данное число: " + sum2);
    }
}
