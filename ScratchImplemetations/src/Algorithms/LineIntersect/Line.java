package Algorithms.LineIntersect;

import java.util.Formatter;

/**
 * Line
 */
public class Line {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        if(p1.getX()==p2.getX()){
            throw new IllegalArgumentException("the two x-values cannot be the same");
        }
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

    public double findSlope() {
        return ((this.p2.getY()-this.p1.getY())/(this.p2.getX()-this.p1.getX()));
    }
    
    public double findYIntercept(){
        return(this.p2.getY()-this.findSlope()*this.p2.getX());
    }

    public String toString() {

        if(this.findYIntercept()>=0){
            return String.format("y = %.2fx + %.2f", this.findSlope(),this.findYIntercept());
        } else {
            return String.format("y = %.2fx - %.2f", this.findSlope(),this.findYIntercept());
        }
    }

    public String intersect(Line other) {
        if (this.equals(other)){
            return "The 2 lines have infinitely many solutions, since they are the same line";
        }

        if (Math.abs((this.findSlope() - other.findSlope())) < 0.00000001 && Math.abs(this.findYIntercept()-other.findYIntercept()) > 0.00000001){
            return "The 2 lines have no solutions, since they are parallel to each other";
        }

        double xCoor = ((other.findYIntercept()-this.findYIntercept())/(this.findSlope()-other.findSlope()));
        double yInt = this.findSlope() * xCoor + this.findYIntercept();

        return String.format("The point of intersection is (%.2f,%.2f)", xCoor, yInt);
    }

    public boolean equals(Object obj) {
        if ((this.getClass()==obj.getClass())) {
            Line l2=(Line) obj;
            if (Math.abs((this.findSlope() - l2.findSlope())) < 0.00000001 && Math.abs(this.findYIntercept()-l2.findYIntercept()) < 0.00000001){
                return true;
            }
        }
        return false;
    }
}