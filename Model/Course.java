package Model;
import java.util.ArrayList;
public class Course {
    private int ID;
    private String title;
    private Class c;
    private String description;
    private int limit;
    private ArrayList<Student> students;
    private Employee prof;
    public Course() {}
    public Course(int ID, String title, Class c, String description, int limit, Employee prof) {
        this.ID = ID;
        this.title = title;
        this.c = c;
        this.description = description;
        this.limit = limit;
        this.prof = prof;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID=ID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title=title;
    }
    public Class setCurrentClass() {
        return c;
    }
    public void getClass(Class c) {
        this.c=c;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description=description;
    }
    public int getLimit() {
        return limit;
    }
    public void setLimit(int limit) {
        this.limit=limit;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students=students;
    }
    public Employee getEmployee() {
        return prof;
    }
    public void setEmployee(Employee prof) {
        this.prof=prof;
    }

}
