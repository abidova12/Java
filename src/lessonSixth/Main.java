package lessonSixth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*  1) Введите с консоли два числа и выведите больше ли второе число чем первое */
        System.out.println("Введите два числа:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        {
            if (m >= n) {
                System.out.println("Второе число больше первого");
            } else {
                System.out.println("Первое число больше второго");
            }
        }


//2) Создайте метод, который принимает 2 числа и возвращает больше или равно первое число по сравнению со вторым
        boolean result = twoNumbers(111, 222);
        System.out.println(result);
        System.out.println(twoStrings("замок", "борьба"));
    }

    public static boolean twoNumbers(int first, int second) {
        return first >= second;
    }


    //3) создайте метод который будет принимать 2 строки и писать возвращать строку, которая составляется склеиванем первой половины первого слова и второй половины второго слова
    public static String twoStrings(String first1, String second1) {
        String c = first1.substring(0, first1.length() / 2);
        String d = second1.substring(0, second1.length() / 2);
        return c + d;
    }
}




