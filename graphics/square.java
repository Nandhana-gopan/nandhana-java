package graphics;

public class square implements shape{
    double a;
    public square(double a){
        this.a=a;
    }
    public void area()
    {
        double area=a*a;
        System.out.println("area of square is:"+area);
    }
}
