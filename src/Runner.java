public class Runner {

    public static void main( String args[]){

        Shape[] shapes = new Shape[6]; //creates an array of shapes and fills it with 1 of each type of shape
        shapes[0] = new Circle(3);
        shapes[1] = new Square(3);
        shapes[2] = new Triangle(3,2);
        shapes[3] = new Sphere(3);
        shapes[4] = new Cube(3);
        shapes[5] = new Tetrahedron(3);

        for (Shape shape:shapes){ //goes through and prints the string representation of the shapes
            System.out.println(shape);
        }

    }
}
