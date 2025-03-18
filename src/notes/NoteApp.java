package notes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NoteApp {
    public static void main(String[] args) {
        Client client1 = new Client("John Doe", "+996 555 123 456", "kairat_k@auca.kg", null);
        Client client2 = new Client("Snayan", "+996 555 423 898", "jjj@gmail.com", null);
        Client client3 = new Client("Kairat", "+996 555 444 942", "kkk@auca.kg", null);

        client1.addNotes("Java", "Java is a programming language", "12.12.2020", "12:00");
        client1.addNotes("Python", "Python is a programming language", "12.12.2020", "12:00");

        client2.addNotes("C++", "C++ is a programming language", "12.12.2020", "12:00");
        client2.addNotes("C#", "C# is a programming language", "12.12.2020", "12:00");

        client3.addNotes("JavaScript", "JavaScript is a programming language", "12.12.2020", "12:00");
        client3.addNotes("TypeScript", "TypeScript is a programming language", "12.12.2020", "12:00");


        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);

        for (Client client : clients) {
            client.showNotes();
        }
    }
}
