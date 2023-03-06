
/**
 * 
 *
 * @author (Linda Dominguez)
 * @version (2/17/22)
 */
public class Point
{
    private double x;
    private final double TOLERANCE = 0.01;
    private double y;
 
    // instance variables - replace the example below with your own

    /**
     * this makes up a point object
     */
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    /**
     * sets coordinates on point object
     */
    public Point (double x, double y){
        // this.(x,y) = (x,y);
        this.x = x;
        this.y = y;
        // return (x,y)->
    }
    // public static void main(String args[]){
    // String inside = "";
    // System.out.println("("+this.x+","+this.y+")");
    // }
    /**
     * String gives detailed information about location of a point
     */
    public String toString() {
        return "Point located at : (" + this.x + ", " + this.y + ")";
    }

    /**
     * gets y value with this.
     */
    public double getY(){
        return this.y;

    }
    /**
     * gets x value with this.
     */
    public double getX(){
        return this.x;
    }
    /**
     * sets y value with this.
     */
    public void setY​(double newY){
        this.y=y;}
    /**
     * sets y value with this.
     */
    public void setX​(double newX){
        this.x=x;}
    /**
     * takes a new point as param
     * returns the distance between x and y
    */
    public double findDistance(Point newPoint) {
        double distanceX = this.x - newPoint.getX();
        double distanceY = this.y - newPoint.getY();
        double distanceDiff = Math.pow((distanceX * distanceX + distanceY * distanceY), .5);

        return distanceDiff;
    }

    /**
     * Takes x and y as params 
     * returns if they're equal
     */
    public boolean areEquidistant(Point x, Point y) {
        // double TOLERANCE = 0.01;
        double dist1 = findDistance(x);
        double dist2 = findDistance(y);
        return Math.abs(dist1 - dist2) < TOLERANCE;
    }
    /**
     * Tests the class point-- makes new poinrs and retuns
     * if they're equidistant and how far they are.
     */
    public static void main(String[] args){
        Point case1 = new Point(4.0, 3.0);
        Point case2 = new Point(1.0, 1.0);
        Point case3 = new Point(7.7, 7.8);
        
        System.out.println("case1: " + case1 + "expects:False");
        System.out.println("case2: " + case2+ "expects:False");
        System.out.println("case3: " + case3 + "expects:True");
    }

    
    }
