package practice.Factory_Pattern;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "Вегетарианская пицца";
        dough = "Тонкое тесто";
        sauce = "Томатный соус";
        toppings.add("Болгарский перец");
        toppings.add("Грибы");
        toppings.add("Оливки");
        toppings.add("Лук");
    }

}
