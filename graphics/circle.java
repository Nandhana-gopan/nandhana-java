package graphics;

public class circle implements shape{
    double r;
    public circle(double r){
        this.r=r;
    }
    public void area(){
        double area=3.14*r*r;
        System.out.println("area of circle is:"+area);
    }
}
