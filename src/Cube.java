
public class Cube implements ThreeDimensionalShape{

    /**
     * stores the side length of the cube for use in volume and area
     */
    private double sideLength;

    /**
     * constructor for a cube
     * @param sideLength the side length of the cube
     */
    public Cube(double sideLength){
        this.sideLength = sideLength;
    }

    /**
     * getter for side length
     * @return the side length of the cube
     */
    public double getSideLength() {
        return sideLength;
    }

    /**
     * setter for side length
     * @param sideLength the side length of the cube
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    /**
     * calculates and returns the surface area of the cube
     * @return surface area of the cube
     */
    @Override
    public double getArea() {
        return (6.0 * Math.pow(sideLength,2));  // surface area of a cube = 6 * s^2
    }

    /**
     * calculates and returns the volume of the cube
     * @return the volume of the cube
     */
    @Override
    public double getVolume() {
        return (Math.pow(sideLength,3)); // volume of a cube = s^3
    }

    /**
     * creates a string representation of a cube with information such as side length, surface area and volume
     * @return string representation of a cube
     */
    @Override
    public String toString(){
        return String.format("%s%n%s: %.3f%n%s: %.3f%n%s: %.3f%n",
                "Cube",
                "side length", sideLength,
                "surface area", getArea(),
                "volume", getVolume());
    }
}
