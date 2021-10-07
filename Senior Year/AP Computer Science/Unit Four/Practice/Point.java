public class Point {
    
    private int x;
    private int y;
    
    public Point() {
        
        x = y = 0;
    }
    
    public Point(int x, int y) {
        
        this.x = x;
        this.y = y;
    }
    
    public Point(Point other) {
        
        this.x = other.getX();
        this.y = other.getY();
    }
    
    public int getX() {
        
        return x;
    }
    
    public int getY() {
        
        return y;
    }
    
    public void setX(int x) {
        
        this.x = x;
    }
    
    public void setY(int y) {
        
        this.y = y;
    }

    public double distance(Point other) {
        
        return Math.sqrt((x - other.getX()) * (x - other.getX()) +
                         (y - other.getY()) * (y - other.getY()));
    }

    public String getIdentifier() {

        return super.toString();
    }

    @Override
    public boolean equals(Object anotherPoint) {

        Point other = (Point) anotherPoint;

        return this.x == other.getX() &&
               this.y == other.getY();
    }
    
    @Override
    public String toString() {
        
        return "Point (" + x + ", " + y + ")";
    }
}
