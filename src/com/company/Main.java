package com.company;

public class Main {
    public static void main (String [] args) {
        PointList pointList = new PointList();
        pointList.add(new Point(1,5));
        pointList.add(new Point(2,6));
        pointList.add(new Point(7,8));
        pointList.add(new Point(5,3));
        pointList.add(new Point(7,3));
        pointList.add(new Point(3,5));

        pointList.remove(2);
        pointList.remove(4);
        pointList.remove(1);

        for (int i = 0; i < pointList.size(); i++) {
            System.out.println(pointList.get(i));
            
        }
    }


}
