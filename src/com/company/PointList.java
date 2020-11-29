package com.company;

import java.util.Arrays;

public class PointList {
    private Point[] points = new Point[4];
    private int length = 0;

    public void add (Point p) {
        if (length >= points.length) {
            int newCapacity = (points.length * 3)/2;
            points = Arrays.copyOf(points, newCapacity);
        }
        points[length] = p;
        length = length+1;
    }

    public Point get(int i) {
        checkExistsIndex(i);
        return points[i];
    }

     public void set (int i, Point p) {
        checkExistsIndex(i);
        this.points[i]=p;
     }

     public void remove (int index) {
        checkExistsIndex(index);
         length = length-1;
         for (int  i = index;  i < length;  i++) {
             points[i] = points[i+1];
         }
         for (int i = length; i < points.length; i++) {
             points[i]=null;
         }
     }

     private void checkExistsIndex (int index) {
         if (index>= points.length || index<0) {
             throw new IndexOutOfBoundsException();
         }
     }

    public int size() {
        return length;
    }


}
