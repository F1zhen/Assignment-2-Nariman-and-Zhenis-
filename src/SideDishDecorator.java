public class SideDishDecorator extends DishDecorator {
    private String sideDish;
    private double price;

    public SideDishDecorator(Dish dish, String sideDish, double price) {
        super(dish);
        this.sideDish = sideDish;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return dish.getDescription() + ", " + sideDish;
    }

    @Override
    public double cost() {
        return dish.cost() + price;
    }
}
