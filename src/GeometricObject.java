public abstract class  GeometricObject {
    private int identifier;
    private double x;
    private double y;
    /** Construct a default GeometricObject */
    protected GeometricObject() {
        this.identifier = 0;
        this.x = 0.0;
        this.y = 0.0;
    }
    /** Construct a geometric object with the specified identifier*/
    protected GeometricObject(int identifier, double x, double y) {
        this.identifier = identifier;
        this.x = x;
        this.y = y;
    }
    /** Return the identifier */
    public int getIdentifier() {
        return this.identifier;
    }
    /** Set a new identifier */
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }
    /** Return the x coordinate */
    public double getX() {
        return this.x;
    }
    /** Set x coordinate */
    public void setX(double x) {
        this.x = x;
    }
    /** Return the y coordinate */
    public double getY() {
        return this.y;
    }
    /** Set y coordinate */
    public void setY(double y) {
        this.y = y;
    }
    /** Abstract method getArea */
    public abstract double getArea();
    /** Return a string representation of this object */
    @Override
    public String toString() {
        return String.format(" %3d (%1.0f,%1.0f)", getIdentifier(), getX(), getY()) + String.format("%11.2f",getArea());
    }
}