import java.util.Scanner;

public class java_proctice_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //question 2
        /* 
        float arr[]= new float[3];
        float  marks = 0;
        System.out.println(" enter marks of three subject:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("for subject "+(i+1)+":");
            arr[i]=sc.nextInt();
            marks += arr[i];
        }
        marks = marks/3;
        if (marks>40 && arr[0]>33 && arr[1]>33 && arr[2]>33) {
            System.out.println("you passed");
        } else {
            System.out.println("you falied");
        } 
            */


        // question 3
          /*  System.out.print("enter your anual salary: ");
            double salary = sc.nextDouble();
            double tax;
            if (salary>250000 && salary <500000) {
                tax = salary*0.05;
                
            } 
            else if(salary>500000 && salary<1000000){
                tax = salary*0.2;
            }
            else if(salary>1000000){
                tax = salary*0.3;
            }
            else {
                tax =0;
            }
            System.out.println("tax amount: "+tax);*/

        // question 5
        //  System.out.print("enter year:");
        //  int year = sc.nextInt();
        //  float rem = year%4;
        //  if (rem==0.0){
        //     System.out.println("it is a leap year");
        //  }else{
        //     System.out.println("it is not a leap year");
        //  }

        //question 6
        // System.out.print("enter website url:");
        // String url = sc.nextLine();
        // if (url.endsWith(".com")) {
        //     System.out.println("commercial website");
        // } else if (url.endsWith(".gov")) {
        //     System.out.println("goverment website");
            
        // } else if (url.endsWith(".in")) {
        //     System.out.println("indian website");
        // } else {
            
        // }
        sc.close();
    }
    
}
