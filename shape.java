import java.util.Scanner;

class AreaCalculator {

    double area(double radius) {
        return 3.14159 * radius * radius;
    }

    double area(double length, double width) {
        return length * width;
    }

    double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AreaCalculator obj = new AreaCalculator();

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + obj.area(r));

        
        System.out.print("\nEnter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();
        System.out.println("Area of Rectangle: " + obj.area(l, w));

        
        System.out.print("\nEnter base of triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double h = sc.nextDouble();
        System.out.println("Area of Triangle: " + obj.area(b, h, true));

        sc.close();
    }
}
