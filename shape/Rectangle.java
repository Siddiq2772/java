package com.siddiq.shape;

public class Rectangle {
    
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
