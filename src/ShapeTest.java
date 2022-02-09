
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @Test
    void testCircleConstructor(){
        Circle c = new Circle(3);
        assertEquals(3,c.getRadius());
    }

    @Test
    void testSquareConstructor(){
        Square s = new Square(3);
        assertEquals(3,s.getSideLength());
    }

    @Test
    void testTriangleConstructor(){
        Triangle t = new Triangle(3,2);
        assertEquals(3,t.getBase());
        assertEquals(2,t.getHeight());
    }

    @Test
    void testSphereConstructor(){
        Sphere s = new Sphere(3);
        assertEquals(3,s.getRadius());
    }

    @Test
    void testCubeConstructor(){
        Cube c = new Cube(3);
        assertEquals(3,c.getSideLength());
    }

    @Test
    void testTetrahedronConstructor(){
        Tetrahedron t = new Tetrahedron(3);
        assertEquals(3,t.getSideLength());
    }

    @Test
    void testCircleSetRadiusValid(){
        Circle c = new Circle(3);
        c.setRadius(4);
        assertEquals(4,c.getRadius());
    }

    @Test
    void testSquareSetSideLengthValid(){
        Square s = new Square(3);
        s.setSideLength(4);
        assertEquals(4,s.getSideLength());
    }

    @Test
    void testTriangleSetBaseValid(){
        Triangle t = new Triangle(3,2);
        t.setBase(4);
        assertEquals(4,t.getBase());
    }

    @Test
    void testTriangleSetHeightValid(){
        Triangle t = new Triangle(3,2);
        t.setHeight(4);
        assertEquals(4,t.getHeight());
    }

    @Test
    void testSphereSetRadiusValid(){
        Sphere s = new Sphere(3);
        s.setRadius(4);
        assertEquals(4,s.getRadius());
    }

    @Test
    void testCubeSetSideLengthValid(){
        Cube c = new Cube(3);
        c.setSideLength(4);
        assertEquals(4,c.getSideLength());
    }

    @Test
    void testTetrahedronSetSideLengthValid(){
        Tetrahedron t = new Tetrahedron(3);
        t.setSideLength(4);
        assertEquals(4,t.getSideLength());
    }

    @Test
    void testCircleArea(){
        Circle c = new Circle(3);
        double area = 9.0*Math.PI;
        assertEquals(area,c.getArea());
    }

    @Test
    void testSquareArea(){
        Square s = new Square(3);
        assertEquals(9.0,s.getArea());
    }

    @Test
    void testTriangleArea(){
       Triangle t = new Triangle(3,2);
       assertEquals(3.0,t.getArea());
    }

    @Test
    void testSphereArea(){
        Sphere s = new Sphere(3);
        double area = 9.0 * 4.0 * Math.PI;
        assertEquals(area,s.getArea());
    }

    @Test
    void testSphereVolume(){
        Sphere s = new Sphere(3);
        double volume = Math.round((4.0/3.0 * Math.pow(3.0,3) * Math.PI)*10000.0)/10000.0;
        assertEquals(volume,Math.round(s.getVolume()*10000.0)/10000.0); //round both answers because otherwise is false when it is essentially the same
    }

    @Test
    void testCubeArea(){
        Cube c = new Cube(3);
        assertEquals(54.0,c.getArea());
    }

    @Test
    void testCubeVolume(){
        Cube c = new Cube(3);
        assertEquals(27.0,c.getVolume());
    }

    @Test
    void testTetrahedronArea(){
        Tetrahedron t = new Tetrahedron(3);
        double area = 9 * Math.pow(3.0,.5);
        assertEquals(area,t.getArea());
    }

    @Test
    void  testTetrahedronVolume(){
        Tetrahedron t = new Tetrahedron(3);
        double volume = 27.0 / (6.0 * Math.pow(2.0,.5));
        assertEquals(volume,t.getVolume());
    }
}
