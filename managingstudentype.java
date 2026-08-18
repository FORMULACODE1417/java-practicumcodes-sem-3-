class student {
    long id;
    String name;
    String department;
    student(long studentId, String nameofstudent, String departmentname){
        id = studentId;
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
        this.cgpa = cgpa1;
    }
    void ugdisplay(){
        System.out.println("\nUndergraduate Student Details:");
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
        System.out.println("\nPostgraduate Student Details:");
        displaydetails();
        System.out.println("Specialization: " + specilization);
        System.out.println("Research Topic: " + researchtopic);
    }
}
public class managingstudentype {
    public static void main(String[] args) {
        ugstudent ug = new ugstudent(101211, "mani", "Computer Science", 3, 8.5);
        ug.ugdisplay();
        pgstudent pg = new pgstudent(201, "manikanta","cse","core","oops");
        pg.pgdisplay();
    }
}