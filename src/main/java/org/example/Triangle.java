package org.example;

import static java.lang.Math.sqrt;

public class Triangle {

    int a;
    int b;
    int c;
    double p;
    double s;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public double areaOfTriangle (Triangle o){
        if (a <= 0 || b <= 0 || c <= 0)
            System.out.println("В треугольнике должны быть только положительные длины сторон");
        p = (a + b + c) / 2;
        s = sqrt(p * (p - a) * (p - b) * (p - c));
        if (s <= 0)
            System.out.println("Невозможно подсчитать площать треугольника");
        if (s > 0)
            System.out.println("Плащадь треугольника равна: " + s);
        return s;
    }

    public double areaOfTriangle (int a, int b, int c){
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("В треугольнике должны быть только положительные длины сторон");
        }
        p = (a + b + c) / 2;
        s = sqrt(p * (p - a) * (p - b) * (p - c));
        if (s <= 0)
            System.out.println("Невозможно подсчитать площать треугольника");
        else
            System.out.println("Плащадь треугольника равна: " + s);
        return s;
    }

    public boolean itsTriangle(){
        return a > 0 && b > 0 && c > 0;
    }

    public boolean canColculateArea(Triangle obj){
        if (obj.areaOfTriangle(obj) > 0)
            return true;
        else return false;
    }

}
