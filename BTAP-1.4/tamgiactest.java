import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class tamgiactest {
    @Test
    public void testEquilateralTriangle() {
        int side1 = 5;
        int side2 = 5;
        int side3 = 5;

        String triangleType = tamgiac.classifyTriangle(side1, side2, side3);
        Assertions.assertEquals("Equilateral", triangleType);
    }

    @Test
    public void testIsoscelesTriangle() {
        int side1 = 5;
        int side2 = 5;
        int side3 = 8;

        String triangleType = tamgiac.classifyTriangle(side1, side2, side3);
        Assertions.assertEquals("Isosceles", triangleType);
    }

    @Test
    public void testScaleneTriangle() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;

        String triangleType = tamgiac.classifyTriangle(side1, side2, side3);
        Assertions.assertEquals("Scalene", triangleType);
    }

    @Test
    public void testNotATriangle() {
        int side1 = 1;
        int side2 = 2;
        int side3 = 3;

        String triangleType = tamgiac.classifyTriangle(side1, side2, side3);
        Assertions.assertEquals("NotATriangle", triangleType);
    }

    @Test
    public void testRightTriangle() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;

        String triangleType = tamgiac.classifyTriangle(side1, side2, side3);
        Assertions.assertEquals("Right", triangleType);
    }
}