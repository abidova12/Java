package lessonSeventh;

import java.util.Random;

public class TaskSecond {
    public static void main(String[] args) {
//    Итак: требуется написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
//    сколько полных часов осталось до конца рабочего дня.

        Random random = new Random();
        int n = random.nextInt(0, 28800);
        boolean canConvertSecondsIntoHours = random.nextBoolean();
        int hours = n / 60 / 60;
        int minutes = n / 60 % 60;


        if (canConvertSecondsIntoHours == true) {
            System.out.println("До конца рабочего дня: " + n + " секунд(-ы)");
        } else
            System.out.println("До конца рабочего дня: " + hours + " часов " + minutes + " минут(-ы)");
    }
}
