public class java_practice_set7 {
    static void tabelof(int num){
            for (int i = 1; i < 10; i++) 
                System.out.println(num +" * "+i+" = "+(num*i));
            
    }

    static int sumof(int num){
        if(num==1)
            return 1;
        else
            return num + sumof(num-1);
        
    }
       
    static int fibo(int num){
        if (num<=1) 
            return num;
        return fibo(num-1)+fibo(num-2);
            
        }

    static float avg(int arr[]){
        float sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }

    static float convertToF(float cel){
        return (float)(cel*1.8)+32;
    }
    
    public static void main(String[] args) {
       // tabelof(5);

      // System.out.println(sumof(3));

    //   for (int i = 0; i <=3; i++) {
    //     System.out.println(fibo(i));
    //   }
        

    // int arr[]= {1,2,3,4};
    // System.out.println(avg(arr));

    //System.out.println(convertToF(1));

    }
    
}
