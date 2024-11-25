package Model;

import java.util.ArrayList;

public class Database {

        private ArrayList<Student> students = new ArrayList<>();
        private ArrayList<Employee> employees = new ArrayList<>();
        private ArrayList<Grade> grades = new ArrayList<>();
        private ArrayList<Course> courses = new ArrayList<>();
        private ArrayList<Class> classes = new ArrayList<>();
        private ArrayList<Department> departments = new ArrayList<>();
        public Database() {}
        public void addStudent(Student student) {
            students.add(student);
        }
        public void addEmployee(Employee employee) {
            employees.add(employee);
        }

        public void addGrade(Grade grade) {
            grades.add(grade);
        }

        public void addCourse(Course course) {
            courses.add(course);
        }

        public void addClass(Class c) {
            classes.add(c);
        }

        public void addDepartment(Department department) {
            departments.add(department);
        }

        // Methods to retrieve data
        public ArrayList<Student> getStudents() {
            return students;
        }

        public ArrayList<Employee> getEmployees() {
            return employees;
        }

        public ArrayList<Grade> getGrades() {
            return grades;
        }

        public ArrayList<Course> getCourses() {
            return courses;
        }

        public ArrayList<Class> getClasses() {
            return classes;
        }

        public ArrayList<Department> getDepartments() {
            return departments;
        }
    }

