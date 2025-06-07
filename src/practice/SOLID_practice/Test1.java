package practice.SOLID_practice;

import Problems.code_wars.queue_problem;

public class Test1 {
    public static void main(String[] args) {
        // TV
        OnOffDevice tv = new Television();
        RemoteContol remote = new RemoteContol(tv);
        remote.pressOnButton();
        remote.pressOffButton();

        // refrigerator 
        OnOffDevice holodilnik = new Refrigerator();
        RemoteContol remote2 = new RemoteContol(holodilnik);

        remote2.pressOnButton();
        remote2.pressOffButton();
    }
}
