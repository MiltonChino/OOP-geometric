public class RightTriangle extends GeometricObject {
    private double height, base;
    /** Return the height value*/
    public double getHeight() {
        return this.height;
    }
    /** Return the base value*/
    public double getBase(){
        return this.base;
    }
    /** Set height value*/
    public void setHeight(double height) {
        this.height = height;
    }
    /** Set base value*/
    public void setBase(double base) {
        this.base = base;
    }

    /** Construct a RightTriangle object the radius entered value */
    RightTriangle (int identifier,double x, double y, double height, double base){
        super(identifier, x, y);
        setHeight(height);
        setBase(base);
    }
    /** Construct a Right Triangle object the values s1, s2, s3 entered by the user*/
    RightTriangle (){
        super();
        this.setHeight(1);
        this.setBase(1);
    }
    /** Override method getArea()*/
    public double getArea (){
        final double areaFactor = 2.0;
        return (this.height * this.base) / areaFactor;
    }
    /** Override method toString()*/
    public String toString(){
        return "Triangle " + super.toString();
    }
}
