
public class Constructor {
    
    public static void main(String[] args) {
        Student s1 = new Student("Sanket Suryavanshi",21,36);
        s1.getStudentDetails();

        Student s2 = new Student("Sneha Suryavanshi",17,21);
        s2.getStudentDetails();

        Student s3 = new Student("Adesh Suryavanshi",11,5);
        s3.getStudentDetails();
    }
}

class Student{
    String name;
    int age;
    int rollNo;

    //Constructor
    Student(String name , int age, int rollNo){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
    }

    void getStudentDetails(){
        System.out.print("Name of Student : ");
        System.out.println(this.name);
        System.out.print("Age of Student : ");
        System.out.println(this.age);
        System.out.print("Roll Number of Student : ");
        System.out.println(this.rollNo);
        System.out.println();
    }
}
