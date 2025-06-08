package practice.Factory_Pattern;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Сырная пицца";
        dough = "Тонкое тесто";
        sauce = "Томатный соус Маринара";
        toppings.add("Сыр Моцарелла");
        toppings.add("Сыр Пармезан");
    }

}
