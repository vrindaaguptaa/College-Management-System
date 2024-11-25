package Model;

public class Employee {
    private int ID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;
    private String birthDate;
    private double salary;
    private Department department;

    public Employee(int ID, String firstName, String lastName,String email, String phoneNo, String birthDate, double salary, Department department) {
        this.ID=ID;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.phoneNo=phoneNo;
        this.birthDate=birthDate;
        this.salary=salary;
        this.department=department;

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
    public double getSalary() {
        return salary;
    }
    public void setSalary(double Salary) {
        this.salary=salary;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department=department;
    }
};