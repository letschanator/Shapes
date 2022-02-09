
public class Square implements TwoDimensionalShape{

    /**
     * stores the side length of the square for use in area
     */
    private double sideLength;

    /**
     * constructor for a square
     * @param sideLength the side length of the square
     */
    public Square(double sideLength){
        this.sideLength = sideLength;
    }

    /**
     * getter for the side length
     * @return the side length of the square
     */
    public double getSideLength() {
        return sideLength;
    }

    /**
     * setter for the side length
     * @param sideLength the new side length of the square
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    /**
     * calculates and returns the area of the square
     * @return the area of the square
     */
    @Override
    public double getArea() {
        return (Math.pow(sideLength,2));
    }

    /**
     * creates a string representation of the square with information such as side length and area
     * @return a string g representation of the square
     */
    @Override
    public String toString(){
        return String.format("%s%n%s: %.3f%n%s: %.3f%n",
                "Square",
                "side length", sideLength,
                "area", getArea());
    }
}
