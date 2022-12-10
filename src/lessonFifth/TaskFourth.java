package lessonFifth;

public class TaskFourth {
    public static void main(String[] args) {

        //4) напишите класс с методами для конвертации градусы цельсия в фаренгейты
// и метод для конвертации фаренгейтов в цельсия

        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        System.out.println(fahrenheitConverter.toCelsius(40));
        System.out.println(fahrenheitConverter.toFahrenheit(25));
    }
}
