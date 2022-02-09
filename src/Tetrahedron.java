
public class Tetrahedron implements  ThreeDimensionalShape{

    /**
     * stores the side length for use un area and volume
     */
    private double sideLength;

    /**
     * constructor for a tetrahedron
     * @param sideLength the side length of the tetrahedron
     */
    public Tetrahedron(double sideLength){
        this.sideLength =  sideLength;
    }

    /**
     * getter for the side length
     * @return the side length of the tetrahedron
     */
    public double getSideLength() {
        return sideLength;
    }

    /**
     * setter for the side length
     * @param sideLength the new side length of the tetrahedron
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    /**
     * calculates and returns the surface area of the tetrahedron
     * @return the surface area of the tetrahedron
     */
    @Override
    public double getArea() {
        return (Math.pow(3.0,.5) * Math.pow(sideLength,2)); //surface area of a tetrahedron = square root(3) * s^2
    }

    /**
     * calculates and returns the volume of the tetrahedron
     * @return volume of the tetrahedron
     */
    @Override
    public double getVolume() {
        return (Math.pow(sideLength,3) / (6.0 * Math.pow(2.0,.5))); // volume of a tetrahedron = s^3/(6 * square root(2) )
    }

    /**
     * creates a string representation of the tetrahedron with information such as side length, surface area, and volume
     * @return string representation of the tetrahedron
     */
    @Override
    public String toString(){
        return String.format("%s%n%s: %.3f%n%s: %.3f%n%s: %.3f%n",
                            "Tetrahedron",
                             "side length", sideLength,
                             "surface area", getArea(),
                             "volume", getVolume());
    }
}
