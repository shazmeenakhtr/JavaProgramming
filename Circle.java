public class Circle {
    double x, y, radius;

    Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Point: (" + x + ", " + y + ")");
        System.out.println("Area: " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        Circle c = new Circle(2, 3, 5);
        c.display();
    }
}