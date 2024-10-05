public class RestOrder {
    public static void main(String[] args){
        Dish order = new MainDish("Beef", 1000);
        System.out.println(order.getDescription() + " Tenge " + order.cost());



    }
}
