package practice.SOLID_practice;

public class RemoteContol {
    private OnOffDevice device;

    public RemoteContol(OnOffDevice device) {
        this.device = device;
    }

    public void pressOnButton(){
        device.clickOn();
    }

    public void pressOffButton(){
        device.clickOff();
    }
}
