public class tamgiac {
    public static String classifyTriangle(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return "NotATriangle";
        }

        if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        }

        if (side1 == side2 || side2 == side3 || side1 == side3) {
            return "Isosceles";
        }

        if (side1 != side2 && side2 != side3 && side1 != side3) {
            return "Scalene";
        }

        return "NotATriangle";
    }
}