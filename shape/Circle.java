package com.siddiq.shape;

public class Circle {
    int r=0,h=0;
void setRadius(int r){this.r = r;}
void setHeight(int h){this.h = h;}

int getRadius(){return r;}
int getHeight(){return h;}

double getVolume(){ return 3.14*r*r*h;}
double getarea(){return 3.14*r*r;}
    
}
