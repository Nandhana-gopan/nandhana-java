import java.util.Scanner;
interface shapes{
    void area();
    void peri();
}
class circle implements shapes{
    double radius;
    circle(double radius){
        this.radius=radius;
       }
    public void area(){
        double area=3.14*radius*radius;
         System.out.println("area of circle: "+area);
       }
    public void peri(){
        double peri=2*3.14*radius;
        System.out.println("perimeter of the circle: "+peri);
    }

}
class rectangle implements shapes{
    double length;
    double breadth;
    rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void area(){
        double rarea=length*breadth;
        System.out.println("area of the rectangle: "+rarea);
    }
    public void peri(){
        double rperi=2*(length+breadth);
        System.out.println("the perimeter of the rectangle :"+ rperi);
    }
}
public class interfaceshapes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the radius of the circle:");
        double r= sc.nextDouble();
        circle c=new circle(r);
        c.area();
        c.peri();

        System.out.println("enter the lenth:");
        double l=sc.nextDouble();
        System.out.println("enter the breadth:");
        double b=sc.nextDouble();
        rectangle h=new rectangle(l, b);
        h.area();
        h.peri();
        sc.close();
    }
}
