
public class Circle implements TwoDimensionalShape {

    /**
     * stores the radius for calculation in area
     */
    private double radius;

    /**
     * constructor for a circle
     * @param radius the radius of the circle
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * getter for the radius
     * @return radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * setter for the radius
     * @param radius new radius of the circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * calculates and returns the area of the circle
     * @return area of the circle
     */
    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius,2));  //area of a circle = PI * r^2
    }

    /**
     * converts circle into a string with information including the radius and area
     * @return a string representation of a circle
     */
    @Override
    public String toString(){
        return String.format("%s%n%s: %.3f%n%s: %.3f%n",
                              "Circle",
                              "radius", radius,
                              "area", getArea());
    }
}
