import java.util.*;

/**
 * guess_the_number
 */

 class game{
    int r_num,u_num;
    int noOfGuesses;  
    Scanner  sc = new Scanner(System.in);
    game(){
        Random r = new Random();
        r_num=r.nextInt(10);             
    }
    void takeUserInput(int num){u_num=num;}
    boolean isCorrectNumber(){return r_num==u_num;}
    void  setGuess(int num){noOfGuesses=num;}
    int getGuess(){return noOfGuesses;}
    void guessTheNum(){
        System.out.println("enter number of Guesses");
        setGuess(sc.nextInt());
        for (int i = 0; i <getGuess(); i++) {
            System.out.println("enter your guess");
            takeUserInput(sc.nextInt());
            if (isCorrectNumber()) {
                System.out.println("match successful you won!!");
                break;}
             else if(r_num<u_num) 
                System.out.println("too large!! try again");
            else
                System.out.println("too small!! try again");
            

            if (i==getGuess()-1) 
                System.out.println("you loss");
        }

    }
 }
public class guess_the_number {

    public static void main(String[] args) {
        game g = new game();
        g.guessTheNum();
        
    }
}