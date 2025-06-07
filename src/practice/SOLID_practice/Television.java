package practice.SOLID_practice;

public class Television implements OnOffDevice {

    @Override
    public void clickOn() {
        System.out.println("TV On");
    }

    @Override
    public void clickOff() {
        System.out.println("TV Off");
    }

}
