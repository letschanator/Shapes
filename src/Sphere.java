
public class Sphere implements ThreeDimensionalShape{

    /**
     * stores the radius for use in area and volume
     */
    private double radius;

    /**
     * constructor for a sphere
     * @param radius thge radius of the sphere
     */
    public Sphere(double radius){
        this.radius = radius;
    }

    /**
     * getter for the radius of the sphere
     * @return the radius of the sphere
     */
    public double getRadius() {
        return radius;
    }

    /**
     * setter fot he radius of the sphere
     * @param radius the new radius of the sphere
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * calculates and returns the surface area of the sphere
     * @return surface area of the sphere
     */
    @Override
    public double getArea() {
        return (4.0 * Math.PI * Math.pow(radius,2));  // surface area of a sphere = 4 * PI * r^2
    }

    /**
     * calculates and returns the volume of the sphere
     * @return volume of the sphere
     */
    @Override
    public double getVolume() {
        return (4.0/3.0 * Math.PI * Math.pow(radius,3)); //volume of a sphere is 4/3 * PI * r^3
    }

    /**
     * creates a string representation of a sphere with information such as radius, surface area, and volume
     * @return
     */
    @Override
    public String toString(){
        return String.format("%s%n%s: %.3f%n%s: %.3f%n%s: %.3f%n",
                "Sphere",
                "radius", radius,
                "surface area", getArea(),
                "volume", getVolume());
    }
}
