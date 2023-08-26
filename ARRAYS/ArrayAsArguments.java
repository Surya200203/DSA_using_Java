import java.util.*;

public class ArrayAsArguments {

    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] ={94,89,85};
        System.out.println("Marks Before Updation");
        System.out.println("Physics : "+marks[0]);
        System.out.println("Chemistry : "+marks[1]);
        System.out.println("Math : "+marks[2]);

        update(marks);
        System.out.println("Marks After Updation");
        System.out.println("Physics : "+marks[0]);
        System.out.println("Chemistry : "+marks[1]);
        System.out.println("Math : "+marks[2]);
    }

}
