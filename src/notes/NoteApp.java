package notes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class NoteApp {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Client> clients = new ArrayList<>();

    public static void main(String[] args) {

        Client client1 = new Client("John Doe", "+996 555 123 456", "kairat_k@auca.kg", new ArrayList<>());
        Client client2 = new Client("Snayan", "+996 555 423 898", "jjj@gmail.com", new ArrayList<>());
        Client client3 = new Client("Kairat", "+996 555 444 942", "kkk@auca.kg", new ArrayList<>());
        // Kubat
        // add clients to the list
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
    
        System.out.println("Добро пожаловать в приложение заметок!");
        showMainMenu();
    }

    private static void showMainMenu() {
        while (true) {
            System.out.println("\n==== ГЛАВНОЕ МЕНЮ ====");
            System.out.println("1. Войти как клиент");
            System.out.println("2. Зарегистрировать нового клиента");
            System.out.println("3. Выход из приложения");
            System.out.print("Выберите действие: ");

            int choice = getIntInput();

            switch (choice) {
                case 1:
                    loginClient();
                    break;
                case 2:
                    registerClient();
                    break;
                case 3:
                    System.out.println("Спасибо за использование приложения. До свидания!");
                    return;
                default:
                    System.out.println("Неверный вариант. Попробуйте снова.");
            }
        }
    }

    private static void loginClient() {
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        for (Client client : clients) {
            if (client.getName().equalsIgnoreCase(name)) {
                System.out.println("Добро пожаловать, " + client.getName() + "!");
                showClientMenu(client);
                return;
            }
        }

        System.out.println("Клиент не найден. Хотите зарегистрироваться? (да/нет)");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да")) {
            registerClient();
        }
    }

    private static void registerClient() {
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите ваш номер телефона: ");
        String phone = scanner.nextLine();

        System.out.print("Введите ваш email: ");
        String email = scanner.nextLine();

        Client newClient = new Client(name, phone, email, new ArrayList<>());
        clients.add(newClient);

        System.out.println("Регистрация успешна! Добро пожаловать, " + name + "!");
        showClientMenu(newClient);
    }

    private static void showClientMenu(Client client) {
        while (true) {
            System.out.println("\n==== МЕНЮ КЛИЕНТА ====");
            System.out.println("1. Создать новую заметку");
            System.out.println("2. Просмотреть все заметки");
            System.out.println("3. Просмотреть детали заметки");
            System.out.println("4. Удалить заметку");
            System.out.println("5. Вернуться в главное меню");
            System.out.print("Выберите действие: ");

            int choice = getIntInput();

            switch (choice) {
                case 1:
                    createNote(client);
                    break;
                case 2:
                    viewAllNotes(client);
                    break;
                case 3:
                    viewNoteDetails(client);
                    break;
                case 4:
                    deleteNote(client);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Неверный вариант. Попробуйте снова.");
            }
        }
    }

    private static void createNote(Client client) {
        System.out.println("\n==== СОЗДАНИЕ НОВОЙ ЗАМЕТКИ ====");
        System.out.print("Введите заголовок заметки: ");
        String title = scanner.nextLine();

        System.out.println("Введите содержание заметки (введите 'КОНЕЦ' на новой строке для завершения):");
        StringBuilder contentBuilder = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).equals("КОНЕЦ")) {
            contentBuilder.append(line).append("\n");
        }
        String content = contentBuilder.toString().trim();

        // Получаем текущую дату и время
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Date now = new Date();
        String date = dateFormat.format(now);
        String time = timeFormat.format(now);

        client.addNotes(title, content, date, time);
        System.out.println("Заметка успешно создана!");
    }

    private static void viewAllNotes(Client client) {
        System.out.println("\n==== ВАШИ ЗАМЕТКИ ====");
        List<Notes> notes = client.getNotesList();

        if (notes.isEmpty()) {
            System.out.println("У вас пока нет заметок.");
            return;
        }

        for (int i = 0; i < notes.size(); i++) {
            Notes note = notes.get(i);
            System.out.println((i + 1) + ". " + note.getTitle() + " (" + note.getDate() + ")");
        }
    }

    private static void viewNoteDetails(Client client) {
        List<Notes> notes = client.getNotesList();
        if (notes.isEmpty()) {
            System.out.println("У вас пока нет заметок.");
            return;
        }

        viewAllNotes(client);
        System.out.print("Введите номер заметки для просмотра: ");
        int noteIndex = getIntInput() - 1;

        if (noteIndex >= 0 && noteIndex < notes.size()) {
            Notes note = notes.get(noteIndex);
            System.out.println("\n==== ДЕТАЛИ ЗАМЕТКИ ====");
            System.out.println("Заголовок: " + note.getTitle());
            System.out.println("Дата: " + note.getDate() + " " + note.getTime());
            System.out.println("Содержание:\n" + note.getContent());
        } else {
            System.out.println("Неверный номер заметки.");
        }
    }

    private static void deleteNote(Client client) {
        List<Notes> notes = client.getNotesList();
        if (notes.isEmpty()) {
            System.out.println("У вас пока нет заметок.");
            return;
        }

        viewAllNotes(client);
        System.out.print("Введите номер заметки для удаления: ");
        int noteIndex = getIntInput() - 1;

        if (noteIndex >= 0 && noteIndex < notes.size()) {
            Notes removedNote = notes.remove(noteIndex);
            System.out.println("Заметка '" + removedNote.getTitle() + "' успешно удалена!");
        } else {
            System.out.println("Неверный номер заметки.");
        }
    }

    private static int getIntInput() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static String getStringInput() {
        try {
            return scanner.nextLine();
        } catch (NumberFormatException e) {
            return "";
        }
    }
}