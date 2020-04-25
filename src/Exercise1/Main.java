package Exercise1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(2, 5);
        Point point2 = new Point(4, 6);

        Point point3 = new Point(2, 5);
        Point Point4 = point1;
        //What is point1.equals(point2) ? Why?
        System.out.println(point1.equals(point2));
        //What is point1 == point2 ? Why?
        System.out.println(point1==point2);
        //What is point1.hashCode()?
        System.out.println(point1.hashCode());

        System.out.println(point1 == point3);
        HashMap<Point, String> map = new LinkedHashMap<>();
        map.put(point1, "Fai");
        map.put(point2, "Ali");

        String s = map.get(point1); // "Fai"



    }

}
