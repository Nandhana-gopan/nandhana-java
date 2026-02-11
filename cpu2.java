public class cpu2 {
   int price;
   
   cpu2(int price)
   {
    this.price=price;
   }
   void displaycpu()
   {
    System.out.println("cpu price:"+price);
   }
   class processor {
    int no;
    String manu;

    processor(int no,String manu)
    {
        this.no=no;
        this.manu=manu;
    }
    void displayproc()
    {
        System.out.println("Number of cores:"+no);
        System.out.println("Manufacturer :"+manu);
    }
   }
   static class Ram {
    int mem;
    String manu;

    Ram(int mem,String manu)
    {
        this.mem=mem;
        this.manu=manu;
    }
    void displayram()
    {
        System.out.println("memory:"+mem);
        System.out.println("Manufacturer:"+manu);
    }
   }
   public static void main(String[] args) 
   {
    cpu2 obj1= new cpu2(20000);
    obj1.displaycpu();
    cpu2.processor obj2=obj1.new processor(2,"intel");
    obj2.displayproc();
    cpu2.Ram obj3=new cpu2.Ram(512, "oracle");
    obj3.displayram();
   }
}
