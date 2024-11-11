public class Square extends GeometricObject {
    private double side;
    /** Return the height value*/
    public double getSide() {
        return this.side;
    }
    /** Set side value*/
    public void setSide(double side) {
        this.side = side;
    }
    /** Construct a Square object the entered side value */
    Square (int identifier,double x, double y, double side){
        super(identifier, x, y);
        setSide(side);
    }
    /** Construct a Square object with a default side value */
    Square (){
        super();
        this.setSide(1);
    }
    /** Override method getArea()*/
    public double getArea (){
        return getSide() * getSide();
    }
    /** Override method toString()*/
    public String toString(){
        return "Square   " + super.toString();
    }
}
