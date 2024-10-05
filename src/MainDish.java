public class MainDish implements Dish {

    private String name;
    private Double price;


    public MainDish(String name, double price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String getDescription() {
        return name;
    }


    @Override
    public double cost() {
        return price;
    }
}