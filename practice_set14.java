
// public class practice_set14 {
//     public static int forloop (int i){
//         try {
//             for (int index = 0; index < 10; index++) {
//                 if (index==i) {
//                     System.out.println("equal");
//                     return 0;
//                 }if(index==9){
//                     throw new Exception();
//                 }
//             }
//         } catch (Exception e) {
//             System.out.println(e);
//         } finally{
//             System.out.println("cleared");            
//         }
//         return 1; }
// public static void main(String[] args) {
//     forloop(10);
// }}

import java.util.Scanner;

public class practice_set14 {
    public static int forloop (int i){
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            if (a<18) {
                
            } else {
                
            }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            System.out.println("cleared");            
        }
        return 1; }
public static void main(String[] args) {
    forloop(10);
}}