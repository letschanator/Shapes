
public class Triangle implements TwoDimensionalShape{

    /**
     * stores the base length of the triangle for use in area
     */
    private double base;

    /**
     * stores the height of the triangle for use in area
     */
    private double height;

    /**
     * constructor for the triangle
     * @param base base length of the triangle
     * @param height height of the triangle
     */
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    /**
     * getter for the base length
     * @return base length of the triangle
     */
    public double getBase() {
        return base;
    }

    /**
     * setter for the base length
     * @param base the new base length of the triangle
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * getter for the height
     * @return height of the triangle
     */
    public double getHeight() {
        return height;
    }

    /**
     * setter for the height
     * @param height the new height of the triangle
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * calculates and returns the area of the triangle
     * @return area of the triangle
     */
    @Override
    public double getArea() {
        return (.5 * base * height); //area of a triangle = 1/2 * base * height
    }

    /**
     * creates a string representation of the triangle with information such as base length, height, and area
     * @return
     */
    @Override
    public String toString(){
        return String.format("%s%n%s: %.3f%n%s: %.3f%n%s: %.3f%n",
                "Triangle",
                "base", base,
                "height",height,
                "area", getArea());
    }
}
