// Creating an array

import java.util.*;

public class CreateArray{
    public static void main(String[] args) {

        int marks[] = new int[50];
        int numbers[] = {1,2,3};
        String fruits[] = {"apple","orange","mango"};
        
        Scanner sc = new Scanner(System.in);

        //Input
        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //math


        //Output
        System.out.println("Initial Marks ");
        System.out.println("phy : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("math : "+marks[2]);
        
        //Update
        marks[2]=99;  // updated math marks
        System.out.println("Updated marks ");
        System.out.println("phy : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("math : "+marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage : "+percentage+"%");
     }
}