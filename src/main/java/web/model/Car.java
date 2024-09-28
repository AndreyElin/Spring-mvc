package web.model;

public class Car {
    private int id;
    private int price;
    private String model;

    public Car(int id, int price, String model) {
        this.id = id;
        this.price = price;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
