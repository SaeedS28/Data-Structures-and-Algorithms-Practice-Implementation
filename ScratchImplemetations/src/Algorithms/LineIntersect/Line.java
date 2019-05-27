package Algorithms.LineIntersect;

import java.util.Formatter;

/**
 * Line
 */
public class Line {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.setP1(p1);
        this.setP2(p2);
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public double findSlope(){
        if (this.p1.getX()==this.p2.getX()) {
            throw new IllegalArgumentException("The two x-values are the same. Division by zero");
        }
        return ((this.p2.getY()-this.p1.getY())/(this.p2.getX()-this.p1.getX()));
    }
    
    public double findYIntercept(){
        return(this.p2.getY()-this.findSlope()*this.p2.getX());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Formatter fmt = new Formatter(sb);

        if(findYIntercept()>=0){
            fmt.format("y = %.2fx + %.2f", this.findSlope(),this.findYIntercept());
        } else {
            fmt.format("y = 0.2fx - %.2f", this.findSlope(),this.findYIntercept());
        }
        return fmt.toString(); 
        //fmt.close();
    }
}