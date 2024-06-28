import java.util.Scanner;
//tower of hanio project

public class towerofhanio {
int arr[][]= new int[3][3],top[]=new int[3],vpop;

towerofhanio(){
    for (int i = 2; i >= 0; i--) {
        arr[0][i]=3-i;
        top[i]=-1;}
        top[0]=2;
}
public void print(){
    for (int i = 2; i >= 0; i--) {
        System.out.print("  ["+arr[0][i]+"]  ["+arr[1][i]+"]  ["+arr[2][i]+"]");
        System.out.println();
    }
}
public void pop(int a)  { 
  a-=1;
  try {
    vpop=arr[a][top[a]];
    arr[a][top[a]]=0;
    top[a]--;
    
  } catch (Exception e) {
    System.out.println("invalid choice!! try again");
  }
 
}
public void push(int a){
    a-=1;
    try {
        top[a]++;
    arr[a][top[a]]=vpop;
    } catch (Exception e) {
        System.out.println("invalid choice!! try again");
    }
    
    
  }
public static void main(String[] args) {
    towerofhanio t = new towerofhanio();
    Scanner sc = new Scanner(System.in);
    while (t.top[2]!=2) {
        t.print();        
        System.out.print("Enter to pop form: ");
        t.pop(sc.nextInt());
        System.out.print("Enter to push to: ");
        t.push(sc.nextInt());        
        
    }
    t.print();
    sc.close();
}
    
}