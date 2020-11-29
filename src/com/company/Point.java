package com.company;

import java.util.Objects;

public class Point {
    private double x;
    private double y;
    private String s;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point (" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != Point.class) return false;
        Point p = (Point) obj;
        return p.x == x && p.y == y && Objects.equals(s,p.s) ;
    }


    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
