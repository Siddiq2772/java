
class Q1 extends Thread{
    String msg;
    Q1(String msg){
        this.msg=msg;
    }
    @Override
    public void run() {
        while (true) {
            
            System.out.println(msg+":"+this.getPriority());
            System.out.println(this.getState());
            System.out.println(currentThread().getState());
            try {
                sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class pracatice_set13 {
public static void main(String[] args) {
    Q1 t1 = new Q1("good moring");
    Q1 t2 = new Q1("welcome");
    t1.start();
    t2.start();
    t1.setPriority(Q1.MAX_PRIORITY);
    t2.setPriority(Q1.MIN_PRIORITY);




    
}
    
}