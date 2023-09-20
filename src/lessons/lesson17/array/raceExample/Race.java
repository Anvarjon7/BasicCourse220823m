package lessons.lesson17.array.raceExample;

import lessons.lesson16.raceExample.Car;

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

    public Car calculateRaceResult(){

        return null;
    }



    public void showWinner(Car carWinner){
        System.out.println("Победил автомобиль " + carWinner.getProducer());
    }
}
