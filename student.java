import java.util.*;
public class student{
    String name;
    int regno;
    int[] marks=new int[6];
    double sgpa;
    public void getdetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        name=sc.nextLine();
        System.out.println("enter regno:");
        regno=sc.nextInt();
        System.out.println("enter marks:");
        for (int i=1;i<6;i++){
            marks[i]=sc.nextInt();
        }
    }
    public void computesgpa(){
        int sum=0;
        for(int mark:marks){
            sum=sum+mark;
        }
        sgpa=sum/6;
    }
    public void showdetails() {
        System.out.println("Name of the Student: " + name);
        System.out.println("Registration number: " + regno);
        System.out.println("Average Marks (SGPA): " + sgpa);
    }

    public static void main(String[] args) {
        student s = new student();
        s.getdetails();
        s.computesgpa();
        s.showdetails();
    }
    
        
    
}
