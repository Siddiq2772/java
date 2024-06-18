public class java_practice_set_6 {
    public static void main(String[] args) {
        //Q.1 
        /*float arr[] = {1.0f,2.0f,3.0f,4.0f,5.0f};
        float sum=0;
        for (float f : arr) {
            sum+=f;
        }
        System.out.println(sum);*/


        //Q,2
       /*  int num=4,arr[] = {1,2,3,4,5};
        for (int i : arr) {
            if (i==num) 
                System.out.println("found "+i);
        }
                */
        
        //Q. 3
        /*int avg=0,arr[] ={90,80,40};
        for (int i : arr) 
            avg +=i;
         
        avg=avg/3;
        System.out.println(avg);*/


        //Q.4
        /*int arr1[][]={{1,2},{3,4},{5,6}};
        int arr2[][]={{1,2},{3,4},{5,6}};

        for (int i = 0; i < arr1.length; i++) 
            for (int j = 0; j < arr1[i].length; j++) 
                arr1[i][j]+=arr2[i][j];  
                
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++)
                System.out.print(arr1[i][j]+"\t");
                System.out.println();}*/


       //Q.5
       /*int arr[] = {1,2,3,4,5};
       int arr2[]= new int[arr.length];
    for (int i = 0; i < arr.length; i++) 
        arr2[arr.length - i-1]= arr[i];
    
    for (int i : arr2) {
        System.out.println(i);
    }*/

    //Q.6
   /*  int arr[] = {1,2,3,4,5};
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) 
        if (max<arr[i]) 
            max=arr[i];
        
    System.out.println(max);*/

    //Q.7
   /* int arr[] = {1,2,3,4,5};
        int i;
    for ( i = 0; i < 4; i++) 
        if (arr[i]>arr[i+1]) {
            System.out.println("not sorted");
            break;
        }        
        if (i == 4) 
            System.out.println("sorted");
     */
        
        
        
     

    }
    
}
