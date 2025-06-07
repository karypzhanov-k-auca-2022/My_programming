package practice.SOLID_practice;

public class Test1 {
    public static void main(String[] args) {
        // TV
        OnOffDevice tv = new Television();
        RemoteContol remote = new RemoteContol(tv);

        remote.pressOnButton();
        remote.pressOffButton();
    }
}
