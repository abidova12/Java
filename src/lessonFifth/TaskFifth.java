package lessonFifth;

public class TaskFifth {
    //5) напишите метод для получения суммы трех чисел
    public static void main(String[] args) {

        String first = "222";
        String second = "333";
        String third = "111";
        System.out.println(sum(first, second, third));
    }

    public static int sum(String first, String second, String third) {
        int number1 = Integer.valueOf(first);
        int number2 = Integer.valueOf(second);
        int number3 = Integer.valueOf(third);
        return number1 + number2 + number3;
    }
}