package practice.Factory_Pattern;

public class PizzaStory {
    SimplePizzaFactory factory;

    public PizzaStory(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String pizzaType) {
        Pizza pizza = factory.createPizza(pizzaType);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
