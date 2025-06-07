package practice.SOLID_practice;

public class Refrigerator implements OnOffDevice {

    @Override
    public void clickOn() {
        System.out.println("RF ON");
    }

    @Override
    public void clickOff() {
        System.out.println("RF OFF");
    }

}
