package graphics;

public class rectangle implements shape{
    double l;
    double b;
    public rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    public void area() {
        double a= l*b;
        System.out.println("area of rectangle is:"+a);
    }
}
