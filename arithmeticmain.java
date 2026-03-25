import arithmetic.*;
public class arithmeticmain {
    public static void main(String[] args) {
        
    
        addition  r=new addition(5,5);
        subtraction t=new subtraction(6,7 );
        multiplication s= new multiplication(4,6);
        division c=new division(12,6);

        r.operation();
        t.operation();
        s.operation();
        c.operation();
    }

    
}
