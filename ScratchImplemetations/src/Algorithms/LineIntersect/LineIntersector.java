package Algorithms.LineIntersect;

/**
 * LineIntersector
 */
public class LineIntersector {

    public static void main(String[] args) {

        // Line 1
        Point L11=new Point(1,2);
        Point L12=new Point(10,12);
        Line line1= new Line(L11, L12);

        // Line 2
        Point L21=new Point(3,28);
        Point L22=new Point(10,12);
        Line line2= new Line(L21, L22);

        System.out.println(line1.toString());
        System.out.println(line2.toString());
        System.out.println(line1.intersect(line2));

        // Line 3
        Point L31= new Point(3,1);
        Point L32= new Point(5,5);
        Line line3= new Line(L31, L32);

        // Line 4
        Point L41= new Point(-1,1);
        Point L42= new Point(1,5);
        Line line4= new Line(L41, L42);

        System.out.println(line3.toString());
        System.out.println(line4.toString());
        System.out.println(line4.intersect(line3));
    }
    
}
