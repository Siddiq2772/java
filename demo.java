import java.util.Scanner;

/**
 * demo
 */
// String str = "shadab";
// // String str2 = new String();
// char arr[]= new char[7];
// for (int i = str.length() - 1; i >=0; i--) {
//     arr[6-i] = str.charAt(i);
// }

// for (int i = 0; i < arr.length; i++) {
//     System.out.print(arr[i]);
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int a, b;
        // System.out.println("Enter a and b");
        // a = sc.nextInt();
        // b = sc.nextInt();

            
        // System.out.println("Before");
        // System.out.println("Value of a: "+ a);
        // System.out.println("Value of b: "+ b);
        // a = a + b; // a= 13
        // b = a - b; // b = 8
        // a = a - b; // a = 5

        // System.out.println("After");
        // System.out.println("Value of a: "+ a);
        // System.out.println("Value of b: "+ b);

     int num = 57;
     int prime=0;
     for(int i=2;i<=num;i++)
     {
        if(num%i==0)
        {
            prime++;
        }
     }
     if(prime==1)
     {
        System.out.println("prime");
     }
     else
     {
        System.out.println("not prime");
     }
     
    
     
    
    }
}