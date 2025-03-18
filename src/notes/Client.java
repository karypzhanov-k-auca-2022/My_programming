package notes;

import java.util.List;

public class Client {
    private List<Notes> notesList;
    private String name;
    private String phoneNummbe;
    private String email;

    public Client(String name, String phoneNummbe, String email, List<Notes> notesList) {
        this.notesList = notesList;
        this.name = name;
        this.phoneNummbe = phoneNummbe;
        this.email = email;
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

}
