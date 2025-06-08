package practice.Factory_Pattern;

public class Test1 {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();

        PizzaStory story = new PizzaStory(factory);
        Pizza cheesePizza = story.orderPizza("cheese");
        System.out.println("Заказанная пицца: " + cheesePizza.getName());
    }
}
