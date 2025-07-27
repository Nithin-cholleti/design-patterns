package DecoratorPattern;


public class Main {
    public static void main(String[] args) {
        Pizza pizza = new VegPizza();
        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());
    }
}
