package Model;

public class Student {
    private int ID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;
    private String birthDate;
    private Class c;
    public Student(int ID, String firstName, String lastName, String email, String phoneNo, String birthDate, Class c) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.birthDate = birthDate;
        this.c = c;
    }
    public int getId() {
        return ID;
    }
    public void setId(int ID) {
        this.ID=ID;
    }
    public String getFname() {
        return firstName;
    }
    public void setFName(String firstName) {
        this.firstName=firstName;
    }
    public String getLname() {
        return lastName;
    }
    public void setLName(String lastName) {
        this.lastName=lastName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public String getPhone(){
        return phoneNo;
    }
    public void setPhone(String phoneNo) {
        this.phoneNo=phoneNo;
    }
    public String getBirth(){
        return birthDate;
    }
    public void setBirth(String birthDate) {
        this.birthDate=birthDate;
    }
    public Class setClass() {
        return c;
    }
    public void getClass(Class c) {
        this.c=c;
    }
}
