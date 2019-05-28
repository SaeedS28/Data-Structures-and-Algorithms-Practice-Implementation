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

        System.out.println(line1.toString());

        // Line 2
        Point L21=new Point(3,28);
        Point L22=new Point(10,12);
        Line line2= new Line(L21, L22);

        System.out.println(line2.toString());
        System.out.println(line1.intersect(line2));
    }
    
}
