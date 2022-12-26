package lessonEighthEighth;


import java.util.Scanner;

public class TaskFirstSecondThird {
    public static void main(String[] args) {


//    1) В первом подъезде квартиры с 1 по 20. Во втором с 21 по 48. В третьем с 49 по 90.
//    Пользователь вводит номер квартиры. Программа должна указать в каком подъезде находится данная квартира.
        System.out.println("Введите номер квартиры:");
        Scanner scanner = new Scanner(System.in);
        int flat = scanner.nextInt();

        if (flat < 1 && flat > 90) {
            System.out.println("Номер квартиры введен не корректно");
        } else if (flat < 21) {
            System.out.println("Квартира " + flat + " находится в 1-ом подъезде");
        } else if (flat < 49) {
            System.out.println("Квартира " + flat + " находится во 2-ом подъезде");
        } else
            System.out.println("Квартира " + flat + " находится в 3-ом подъезде");


//        2) Переменная num может принимать 4 значения: 1, 2, 3 или 4. Если она имеет значение '1',
//                то в переменную result запишем 'зима', если имеет значение '2' – 'весна' и так далее.

        int num = 4;
        int result = num;
        switch (result) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Весна");
                break;
            case 3:
                System.out.println("Лето");
                break;
            case 4:
                System.out.println("Осень");
        }

//        3)  В переменной month лежит какое-то число из интервала от 1 до 12.
//        Определите в какую пору года попадает этот месяц (зима, лето, весна, осень).

        int month = 12;
        switch (month) {
            case 1, 2, 3:
                System.out.println("Зима");
            case 4, 5, 6:
                System.out.println("Весна");
            case 7, 8, 9:
                System.out.println("Лето");
            case 10, 11, 12:
                System.out.println("Осень");
        }
    }
}





