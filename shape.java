//written in notepad


  class Rectangle{

    int h=0,l=0,b=0;
    void setHeight(int h){this.h = h;}
    void setBreadth(int b){this.b = b;}
    void setLength(int l){this.l = l;}
    
    int getHeight(){return h;}
    int getBreadth(){return b;}
    int getLength(){return l;}
    
    double getVolume(){ return h*l*b;}
    double getarea(){return l*b;}

} 


 class Square{
int l=0;
void setLength(int l){this.l = l;}

int getLength(){return l;}

double getVolume(){ return l*l*l;}
double getarea(){return l*l;}

}


class Circle{
int r=0,h=0;
void setRadius(int r){this.r = r;}
void setHeight(int h){this.h = h;}

int getRadius(){return r;}
int getHeight(){return h;}

double getVolume(){ return 3.14*r*r*h;}
double getarea(){return 3.14*r*r;}
}


class Cylinder{
int r=0,h=0;
void setRadius(int r){this.r = r;}
void setHeight(int h){this.h = h;}

int getRadius(){return r;}
int getHeight(){return h;}

double getVolume(){ return 3.14*r*r*h;}
double getarea(){return 2*3.14*r*h+2*3.14*r*r;}
}


class Sphere{
int r=0;
void setRadius(int r){this.r = r;}

int getRadius(){return r;}

double getVolume(){ return 4/3*3.14*r*r*r;}
double getarea(){return 4*3.14*r*r;}
}