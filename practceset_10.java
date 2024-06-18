/**
 * practceset_10
 */
//Q.1
/*
 class circle{
    int radius;
    circle(){
        System.out.println("in circle");
    }
 }
 class cylinder extends circle{
    cylinder(){
        System.out.println("in cylinder");
    }
 }
public class practceset_10 {

    public static void main(String[] args) {
       
        cylinder c = new cylinder();
    }
}
    */


//Q.2
/*class rectangle{
    int width,length;
    rectangle(){
        System.out.println("i have four size");
    }

    rectangle(int w, int l){
        setWidth(w);
        setLength(l);
        System.out.println("area is : "+getWidth()*getLength());
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

class cuboid extends rectangle{
    int height;
    
    public cuboid() {
     System.out.println("i have six sides");
    }

    public cuboid(int w, int l, int height) {
        setWidth(w);
        setLength(l);
        setHeight(height);
        System.out.println("area is : "+width*height*length);
        
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}


public class practceset_10 {

   public static void main(String[] args) {
    rectangle r = new rectangle();
    rectangle r1 = new rectangle(4,5);

    cuboid c1 = new cuboid();
    cuboid c = new cuboid(3, 4, 5);


   } 
} */

