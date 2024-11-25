package Model;

public class Class {
    private int ID;
    private String title;
    public Class(int ID, String title) {
        this.ID = ID;
        this.title = title;
    }
    public int getId() {
        return ID;
    }
    public void setId(int ID) {
        this.ID=ID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title=title;
    }
}
