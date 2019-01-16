import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> l;
        Point p = new Point(3, 4);
        Point p2 = new Point(3, 4);
        Point p3 = new Point (5, 6);
        System.out.println(p.equals(p2));
        System.out.println(p.equals(p3));

        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        //        Point p = new Point(3,4);
//        Set<Point> set = new HashSet<>();
//        set.add(p);
//
//        Point p2 = new Point(3,4);
//        System.out.println(set.contains(p)); //true
//        System.out.println(set.contains(p2)); //false
//
//        p.translate(2,2);
//        System.out.println(set.contains(p)); //true
//        System.out.println(set.contains(new Point(5,6))); //false

//        Point3D p3d = new Point3D(1, 2, 3);
//        System.out.println(p3d instanceof Point);
//        System.out.println(p3d instanceof Point3D);
//
//        Object o1 = new Point(5, -3);
//        Object o2 = "hello there";
//
//        Point p2 = new Point(5, -3);
//        System.out.println(p2.equals(o1));
//        p2.equals(o2);
//
////
//        Point p = (Point) o1;
//        System.out.println(o1);
//        System.out.println(p);
//        ((Point) o1).translate(10, 20);
//        System.out.println(o1);
//        //        Point p1 = new Point(5,3);
//        Point p2 = new Point(5,3);
//        Point p3 = p2;

    }

    public static void example(Object o){
        if(o!= null){
            System.out.println(o);
        }
    }
}
