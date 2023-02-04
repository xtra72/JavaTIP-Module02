package org.nhnacademy.ballworld;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return  x;
    }

    public double getY() {
        return  y;
    }

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }
}