/**9
 * Java_practice_set11
 */

 /**
  * InnerJava_practice_set11
  */
 interface pen {
    void write();
    void refil();
 }

 interface BasicAnimal{
    void eat();
    void sleep();
 }

 interface TvRemote{
    void onoff();
 }
 interface SmartTvRemote extends TvRemote{
    void voiceAssistant();
 }

 class FountainPen implements pen{
    public void write(){
        System.out.println("wrting");
    }
    public void refil(){
        System.out.println("refilling");
    }

    public void changeNib(){
        System.out.println("changing nib");
    }
 }

 class Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eating");
    }
   public void sleep(){
    System.out.println("sleeping");
   }
   void Bite(){
        System.out.println("biting");
   }

   void jump(){
        System.out.println("jumping");
   }
 }

 class Human extends Monkey {
    void lern(){
        System.out.println("lernig");
    }
 }

 class Tv implements TvRemote{
    public void onoff(){
        System.out.println("turnig on/off");
    }
 }
public class Java_practice_set11 extends FountainPen {
    public static void main(String[] args) {
        FountainPen p = new FountainPen();
            p.changeNib();
            p.write();
            p.refil();
            
        
        BasicAnimal h = new Human();
             h.eat();
            h.sleep();
             //h.lern();  --> throws error


        Tv t = new Tv();
            t.onoff();


    }    
}