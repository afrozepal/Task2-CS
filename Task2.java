/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package afroze.task2;

import java.util.Scanner;

/**
 *
 * @author afroz
 */
public class Task2 {

    public static void main(String[] args) {
        
           System.out.println("Hey Welcome to Grade Calculator");
        System.out.println("Grades are assigned according to percentages as follows.");
        System.out.println("91-100 : A+");
        System.out.println("81-90 : A");
        System.out.println("71-80 : B+");
        System.out.println("61-70 : B");
        System.out.println("51-60 : C");
        System.out.println("41-50 : D");
        System.out.println("<40 : E");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of subjects and name them: ");
        
       int subject_count = s.nextInt();
       s.nextLine();
        String[] str = new String[subject_count];
        float[] marks = new float[subject_count];
        float sum=0;
        String grade="A";
        
       for(int i=0 ; i<subject_count ; i++)
       {
           str[i]=s.nextLine();
       }
       for(int i=0 ; i<subject_count ; i++)
       {
           System.out.println("Enter marks of " + str[i] + " : ");
           marks[i]=s.nextInt();
           sum+=marks[i];
       }
       float percentage=sum/subject_count;
       
       if(percentage>90)
           grade="A+";
       else if(percentage>80)
           grade="A";
       else if(percentage>70)
           grade="B+";
       else if(percentage>60)
           grade="B";
       else if(percentage>50)
           grade="C";
       else if(percentage>40)
           grade="D";
       else
           grade="E";
       
       System.out.println("Total Marks obtained " + sum);
       System.out.println("Average Percentage obtained " + percentage);
       System.out.println("Grade obtained " + grade);
        
    }
}
