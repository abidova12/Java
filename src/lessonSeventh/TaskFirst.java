package lessonSeventh;

import java.util.Scanner;

public class TaskFirst {
//    пользователь вводит с консоли с помощью сканера 3 числа, после чего находится
//    максимальное число среди этих трех чисел (используйте if/else if /else и операции сравнения)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberFirst = scanner.nextInt();
        int numberSecond = scanner.nextInt();
        int numberThird = scanner.nextInt();

        if (numberFirst > numberSecond && numberFirst > numberThird) {
            System.out.println(numberFirst);
        } else if (numberFirst < numberSecond && numberSecond > numberThird) {
            System.out.println(numberSecond);
        } else {
            System.out.println(numberThird);
        }
    }
}
