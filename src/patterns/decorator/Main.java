package patterns.decorator;

public class Main {

    public static void main(String[] args) {
        BasePizza pizza = new VegDelight();
        System.out.println(pizza.cost());
        pizza = new ExtraCheese(pizza);
        System.out.println(pizza.cost());
        pizza = new Mushroom(pizza);
        System.out.println(pizza.cost());

    }
}
