
class student{
    int regNo;
    String name;
    String department;
     void studentdisplay(){
        System.out.println("Student ID: "+regNo);
        System.out.println("Name of the student: "+name);
        System.out.println("Student department: "+department);
    }
}
class ugstudent extends student{
    int semester;
    double cgpa;
    void displayUG(){
        studentdisplay();
        System.out.println("Semester: "+semester);
        System.out.println("cgpa: "+cgpa);
    }
}
class pgStudent extends student{
    String specalization;
    String researchTopic;
    void displayPg(){
        studentdisplay();
        System.out.println("Specalization: "+specalization);
        System.out.println("researchTopic "+researchTopic);
    }
}
public class mst{
    public static void main(String[]args){
        ugstudent ug=new ugstudent();
        ug.regNo=2511;
        ug.name="manikanta";
        ug.department="CSE";
        ug.semester=2;
        ug.cgpa=9.6;

        ug.displayUG();

        pgStudent pg=new pgStudent();
        pg.regNo=2511;
        pg.name="manikanta";
        pg.department="CSE";
        pg.specalization="Artificial Intelligence";
        pg.researchTopic="Machine Learning";
        pg.displayPg();
    }
}