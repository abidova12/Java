package lessonFifth;

public class FahrenheitConverter {
    int toCelsius(int fahrenheit) {
        return (int) ((fahrenheit - 32) * 1.8);
    }

    int toFahrenheit(int celsius) {
        return (int) (celsius * 1.8 + 32);

    }
}
