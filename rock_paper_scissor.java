/**
 * rock_paper_sicssor
 */
import java.util.*;

public class rock_paper_scissor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ROCK PAPER SCISSOR GAME:");
        System.out.println("enter number of rounds:");
        int ro=sc.nextInt();
        int res =0 ;
        while (ro!=0) {
            Random  r = new Random();
            int pc = 1+ r.nextInt(2);
           // System.out.println(pc.nextInt(3));
            System.out.println("enter your chocie:");
            System.out.println("1.rock\n2.paper\n3.scissor");
            int user = sc.nextInt();
            
            switch (user) {
                case 1:
                    if (pc==1) {
                    System.out.println("tie");
                        
                    } else if (pc==2) {
                        System.out.println("you loss");
                        res--;
                        
                    }   else {
                        System.out.println("you win");
                        res++;
                    }
                    break;
                case 2:
                    if (pc==1) {
                        System.out.println("you win");
                        res++;
                        
                    } else if (pc==2) {
                        System.out.println("tie");
                        
                    }   else {
                        System.out.println("you loss");
                        res--;
                    }
                    break;
                case 3:
                    if (pc==1) {
                        System.out.println("you loss");
                        res--;
                        
                    } else if (pc==2) {
                        System.out.println("you win");
                        res++;   
                        
                    }   else {
                        System.out.println("tie");
                    }
                    break;
                default:
                    break;
            }
            ro--;
        }
        System.out.println("\n\nyour score:"+ res );
        if (res<ro) {
            System.out.println("you lost against computer");
        } else {
            System.out.println("you won against computer");
        }
        sc.close();
    }
}