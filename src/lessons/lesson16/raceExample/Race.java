package lessons.lesson16.raceExample;

public class Race {
    private String raceName;
    private double distance;
    public Race(String raceName, double distance) {
        this.raceName = raceName;
        this.distance = distance;
    }
    public double raceResultCalculate(Car ourCar){
      double raceResult = distance / ourCar.getMaxSpeed();
      return raceResult;
    }
}
