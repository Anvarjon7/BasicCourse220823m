package lessons.lesson16.practice.scenario1;

public class Phone {
    private String manufacture;
    private String model;
    private String color;
    private double price;

    public Phone(String manufacture, String model, String color, double price) {
        this.manufacture = manufacture;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
