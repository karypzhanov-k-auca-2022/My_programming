package notes;

import java.util.List;

public class Client {
    private List<Notes> notesList;
    private Notes note;
    private String name;
    private String phoneNummbe;
    private String email;

    public Client(String name, String phoneNummbe, String email, List<Notes> notesList) {
        this.notesList = notesList;
        this.name = name;
        this.phoneNummbe = phoneNummbe;
        this.email = email;
    }

    public void addNotes(String title, String content, String date, String time) {
        Notes notes = new Notes(title, content, date, time);
        notesList.add(notes);
    }

    public Notes getNote() {
        return note;
    }

    public void setNote(Notes note) {
        this.note = note;
    }

    public List<Notes> getNotesList() {
        return notesList;
    }

    public void setNotesList(List<Notes> notesList) {
        this.notesList = notesList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNummbe() {
        return phoneNummbe;
    }

    public void setPhoneNummbe(String phoneNummbe) {
        this.phoneNummbe = phoneNummbe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addNotes(Notes notes) {
        notesList.add(notes);
    }

    public void showNotes() {
        System.out.println("Client{" + name + "} has the following notes:");
        for (Notes notes : notesList) {
            System.out.println(notes);
        }

    }
}