package lessonFifth;

public class TaskSecond {
      /*2) Написать метод который будет возвращать результат склейки двух строк.
    например:
    вызывается метод со строками  "I love " и "Java"
    после этого метод вернет I love Java */


    public static void main(String[] args) {
        System.out.println(combain("I love ", "Java"));
    }
    public static String combain(String first, String second) {
        return first + second;
    }
}
