import java.util.Scanner;

/**
 * exam_marks_calculator
 */

public class exam_marks_calculator {

    public static void main(String[] args) {
        float arr[]= new float[5];
        float marks = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter exam marks one by one");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Subject "+ (i+1) +": ");
            arr[i]= sc.nextFloat();
            
        }
        for (int j = 0; j < arr.length; j++) {
            marks += arr[j];
        }
            marks=(marks/500)*100;
        System.out.println("Your marks in percentage: " + marks);
        sc.close();
    }
}