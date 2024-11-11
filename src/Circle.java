public class Circle extends GeometricObject {
    private double radius;
    /** Return the radius value*/
    public double getRadius() {
        return this.radius;
    }
    /** Set the radius value*/
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /** Construct a Circle object the radius value entered*/
    Circle (int identifier,double x, double y, double radius){
        super(identifier, x, y);
        setRadius(radius);
    }
    /** Construct a Circle object the radius value entered*/
    Circle (){
        super();
        this.setRadius(1);
    }
    /** Override method getArea()*/
    public double getArea (){
        final double areaFactor = Math.PI;
        return areaFactor * getRadius() * getRadius();
    }
    /** Override method toString()*/
    public String toString(){
        return "Circle   " + super.toString();
    }
}
