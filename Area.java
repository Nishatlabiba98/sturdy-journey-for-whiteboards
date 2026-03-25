public class Area {
    public double doubledCalculateArea(double length, double breadth) {
        return 2 * length * breadth;
    }

    public static void main(String[] args) {
        Area area = new Area();
        double length = 5.0;
        double breadth = 3.0;
        double result = area.doubledCalculateArea(length, breadth);
        System.out.println("The doubled area is: " + result);
    }
}

