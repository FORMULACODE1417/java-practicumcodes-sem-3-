import java.util.*;
class student {
    long id;
    String name;
    String department;
    student(long studentId, String nameofstudent, String departmentname){
        id=studentId;
        name = nameofstudent;
        department = departmentname;
       
    }
    void displaydetails(){
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Department: " + department);
    }
}
class ugstudent extends student {
    int semester;
    double cgpa;
    ugstudent(long studentId, String nameofstudent, String departmentname, int semester1, double cgpa1){
        super(studentId, nameofstudent, departmentname);
        semester = semester1;
        cgpa = cgpa1;
    }
    void ugdisplay(){
        System.out.println("-------\nUndergraduate Student Details:-------");
        displaydetails();
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
    }

}
class pgstudent extends student {
    String specilization;
    String researchtopic;
    pgstudent(long studentId, String nameofstudent, String departmentname, String specilization1, String researchtopic1){
        super(studentId, nameofstudent, departmentname);
        specilization = specilization1;
        researchtopic = researchtopic1;
    }
    void pgdisplay(){
        System.out.println("-------\nPostgraduate Student Details:-------");
        displaydetails();
        System.out.println("Specialization: " + specilization);
        System.out.println("Research Topic: " + researchtopic);
    }
}
public class managingstudentype {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student id:");
        long id = sc.nextLong();
        if(id<0){
            System.out.println("Invalid student id");
            return;
        }
        sc.nextLine();
        System.out.println("enter student name: ");
        String name = sc.nextLine();
        if(name.isEmpty()){
            System.out.println("Invalid student name");
            return;
        }
        System.out.println("enter student department: ");
        String department = sc.nextLine();
        if(department.isEmpty()){
            System.out.println("Invalid student department");
            return;
        }
        System.out.println("enter semester: ");
        int semester = sc.nextInt();
        if(semester<1 || semester>8){
            System.out.println("Invalid semester");
            return;
        }
        System.out.println("enter cgpa: ");
        double cgpa = sc.nextDouble();
        if(cgpa<0.0 || cgpa>10.0){
            System.out.println("Invalid cgpa");
            return;
        }
        ugstudent ug = new ugstudent(id, name, department, semester, cgpa);
        ug.ugdisplay();

        System.out.println("\nenter student id:");
        long id1 = sc.nextLong();
        if(id1<0){
            System.out.println("Invalid student id");
            return;
        }
        sc.nextLine();
        System.out.println("enter student name: ");
        String name1 = sc.nextLine();
        if(name1.isEmpty()){
            System.out.println("Invalid student name");
            return;
        }
        System.out.println("enter student department: ");
        String department1 = sc.nextLine();
        if(department1.isEmpty()){
            System.out.println("Invalid student department");
            return;
        }
        System.out.println("enter specialization: ");
        String specialization = sc.nextLine();
        if(specialization.isEmpty()){
            System.out.println("Invalid specialization");
            return;
        }
        System.out.println("enter research topic: ");
        String researchtopic = sc.nextLine();
        if(researchtopic.isEmpty()){
            System.out.println("Invalid research topic");
            return;
        }
        pgstudent pg = new pgstudent(id1, name1, department1, specialization, researchtopic);
        pg.pgdisplay();
    }
}
