package practice.Factory_Pattern;

public class PepperoniPizza  extends Pizza {
    public PepperoniPizza() {
        name = "Пепперони пицца";
        dough = "Толстое тесто";
        sauce = "Томатный соус";
        toppings.add("Пепперони");
        toppings.add("Сыр Моцарелла");
    }

}
