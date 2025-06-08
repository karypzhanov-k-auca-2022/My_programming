package practice.Factory_Pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Готовим " + name);
        System.out.println("Раскатываем тесто: " + dough);
        System.out.println("Добавляем соус: " + sauce);
        System.out.println("Добавляем начинку:");
        for (String topping : toppings) {
            System.out.println(" - " + topping);
        }
    }

    public void bake() {
        System.out.println("Выпекаем 25 минут при 350 градусах");
    }

    public void cut() {
        System.out.println("Нарезаем пиццу на диагональные куски");
    }

    public void box() {
        System.out.println("Упаковываем пиццу в фирменную коробку");
    }

    public String getName() {
        return name;
    }
}
