package Model;
import Model.Database;
import Model.Student;
import Model.Employee;
import Model.Grade;
import Model.Course;
import Model.Class;
import Model.Department;

import java.util.ArrayList;
import java.util.Scanner;

public class CMS {
        public static void main(String[] args) {
            Database db = new Database();
            Scanner scanner = new Scanner(System.in);

            boolean running = true;
            while (running) {
                System.out.println("\nChoose an option:");
                System.out.println("1. Add Student");
                System.out.println("2. Add Employee");
                System.out.println("3. Add Course");
                System.out.println("4. Display Students");
                System.out.println("5. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume the newline character

                switch (choice) {
                    case 1:
                        addStudent(db, scanner);
                        break;
                    case 2:
                        addEmployee(db, scanner);
                        break;
                    case 3:
                        addCourse(db, scanner);
                        break;
                    case 4:
                        displayStudents(db);
                        break;
                    case 5:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }

            scanner.close();
        }

        private static void addStudent(Database db, Scanner scanner) {
            System.out.println("Enter Student ID:");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.println("Enter First Name:");
            String firstName = scanner.nextLine();

            System.out.println("Enter Last Name:");
            String lastName = scanner.nextLine();

            System.out.println("Enter Email:");
            String email = scanner.nextLine();

            System.out.println("Enter Phone Number:");
            String phoneNo = scanner.nextLine();

            System.out.println("Enter Birth Date (yyyy-mm-dd):");
            String birthDate = scanner.nextLine();

            System.out.println("Enter Class ID:");
            int classId = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Create and add the student to the database
            Class studentClass = new Class(classId, "Default Class Title"); // Simplified example
            Student student = new Student(id, firstName, lastName, email, phoneNo, birthDate, studentClass);
            db.addStudent(student);
            System.out.println("Student added successfully.");
        }

        private static void addEmployee(Database db, Scanner scanner) {
            System.out.println("Enter Employee ID:");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.println("Enter First Name:");
            String firstName = scanner.nextLine();

            System.out.println("Enter Last Name:");
            String lastName = scanner.nextLine();

            System.out.println("Enter Email:");
            String email = scanner.nextLine();

            System.out.println("Enter Phone Number:");
            String phoneNo = scanner.nextLine();

            System.out.println("Enter Birth Date (yyyy-mm-dd):");
            String birthDate = scanner.nextLine();

            System.out.println("Enter Salary:");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            System.out.println("Enter Department ID:");
            int deptId = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Create and add the employee to the database
            Department department = new Department(deptId, "Default Department Title"); // Simplified for now
            Employee employee = new Employee(id, firstName, lastName, email, phoneNo, birthDate, salary, department);
            db.addEmployee(employee);

            System.out.println("Employee added successfully.");
        }

        private static void addCourse(Database db, Scanner scanner) {
            System.out.println("Enter Course ID:");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.println("Enter Course Title:");
            String title = scanner.nextLine();

            System.out.println("Enter Class ID:");
            int classId = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.println("Enter Course Description:");
            String description = scanner.nextLine();

            System.out.println("Enter Student Limit:");
            int limit = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.println("Enter Professor ID:");
            int profId = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Create and add the course to the database
            Class courseClass = new Class(classId, "Default Class Title"); // Simplified for now
            Employee professor = new Employee(profId, "Default", "Professor", "prof@example.com", "0000000000", "1970-01-01", 50000, null); // Simplified
            Course course = new Course(id, title, courseClass, description, limit, professor);
            db.addCourse(course);

            System.out.println("Course added successfully.");
        }

        private static void displayStudents(Database db) {
            System.out.println("\nList of Students:");
            for (Student student : db.getStudents()) {
                System.out.println("ID: " + student.getId() + ", Name: " + student.getFname() + " " + student.getLname());
            }
        }
    }

