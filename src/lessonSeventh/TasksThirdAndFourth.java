package lessonSeventh;

public class TasksThirdAndFourth {
    //        3) в том же городе Б решили доработать систему с пробками и решили усовершенствовать систему проезда в город,
//            теперь в выходные могут заезжать только легковые автомобили с четными номерами,
//            а в будни все грузовые, а так же машины с нечетными номерами.
//            Напишите программу, которая принимает 3 параметра isWeekend, isLorry, carNumber и
//            пишет можно ли заезжать этой машине

    public void permissionForEnterTheCity() {
        boolean isWeekend = true;
        boolean isLorry = true;
        int carNumber = 999;

        if ((isWeekend && !isLorry && carNumber % 2 == 0) || (!isWeekend && isLorry || carNumber % 2 != 0)) {
            System.out.println("Въезд в город разрешен");
        } else {
            System.out.println("Въезд в город запрещен");
        }


        // 4) Бонусная задача: допишите программу, чтобы она говорила почему нельзя заезжать этой машине, например
//    в выходной день пыталась заехать грузовая машина, ответ - в выходные грузовым нельзя

        if (isWeekend && isLorry) {
            System.out.println("В выходные грузовым машинам въезд в город запрещен");
        }
        if (isWeekend && carNumber % 2 != 0) {
            System.out.println("В выходные машинам с нечетными номерами въезд в город запрещен");
        }
        if (!isWeekend && !isLorry && carNumber % 2 == 0) {
            System.out.println("В будни въезд легковым машинам с четными номерами запрещен");
        }
    }
}
