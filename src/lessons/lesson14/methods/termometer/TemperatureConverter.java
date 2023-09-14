package lessons.lesson14.methods.termometer;

public class TemperatureConverter {

    public double fromCelsiusToFahrenheit(double celsiusTemp){
        double fahrTemp = celsiusTemp * 1.8 + 32;
        return fahrTemp;
    }

    public double fromFahrenheitToCelsius(double fahrTemp){
        double celsiusTemp = (fahrTemp - 32) / 1.8;
        return celsiusTemp;
    }

    public double fromCelsiusTokelvin(double temp){
        return temp - 273;
    }


}
