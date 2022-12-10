package lessonFifth;

import java.util.Scanner;

public class TaskFirst {
    public static void main(String[] args) {
        //   1.) Написать программу, которая считывает с консоли (Scanner) строку и выводит на консоль ее длину
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        System.out.println(a.length());
    }
}