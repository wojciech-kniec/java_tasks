package tasks_level_2;

public class Phone {
    private String brand;
    private int priceInUSD;
    private String color;

    public Phone() {
    }

    public Phone(String brand, int priceInUSD, String color) {
        this.brand = brand;
        this.priceInUSD = priceInUSD;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPriceInUSD() {
        return priceInUSD;
    }

    public void setPriceInUSD(int priceInUSD) {
        this.priceInUSD = priceInUSD;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
