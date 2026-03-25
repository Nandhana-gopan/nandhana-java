package graphics;

public class triangle implements shape {
    double base,height;
    public triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    public void area(){
        double area=0.5*base*height;
        System.out.println("area of rectangle is :"+area);
    }
}
