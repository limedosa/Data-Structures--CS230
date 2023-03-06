public class Point {
    private double x;
    private double y;
    private final double TOLERANCE = 0.01;

    // Constructor without parameters
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Two-parameter constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x coordinate
    public double getX() {
        return this.x;
    }

    // Setter for x coordinate
    public void setX(double x) {
        this.x = x;
    }

    // Getter for y coordinate
    public double getY() {
        return this.y;
    }

    // Setter for y coordinate
    public void setY(double y) {
        this.y = y;
    }

    // toString method
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    // Instance method to find distance between two points
    public double findDistance(Point otherPoint) {
        double xDiff = this.x - otherPoint.getX();
        double yDiff = this.y - otherPoint.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // ------Instance method to check if two points are equidistant to this point
    public boolean areEquidistant(Point p1, Point p2) {
        double dist1 = findDistance(p1);
        double dist2 = findDistance(p2);
        return Math.abs(dist1 - dist2) < TOLERANCE;
    }

    // Main method for testing
    public static void main(String[] args) {
        Point p1 = new Point(1.0, 1.0);
        Point p2 = new Point(2.0, 2.0);
        Point p3 = new Point(3.0, 3.0);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);

        System.out.println("Distance between p1 and p2: " + p1.findDistance(p2));
        System.out.println("Distance between p2 and p3: " + p2.findDistance(p3));
        System.out.println("Distance between p1 and p3: " + p1.findDistance(p3));

        System.out.println("p1 and p2 are equidistant to p3: " + p3.areEquidistant(p1, p2));
    }
}

