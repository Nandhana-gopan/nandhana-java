public class cpu {
    int price;
    
    class processor
    {
        int no;
        String man;
        processor(int no,String man)
        {
            this.no=no;
            this.man=man;
        }
        void displaypro()
        {
            System.out.println("the no of cores are"+no);
            System.out.println("the no of cores are"+man);

        }
    }
    static class ram
    {
        int memory;
        String man;
        ram(int memory,String man)
        {
             this.memory=memory;
            this.man=man;
        }
        void displayram()
        {
            System.out.println("the memory size is"+memory);
            System.out.println("the no of cores are"+man);

        }

    }
    cpu(int price)
    {
        this.price=price;
    }
    void displaycpu()
    {
        System.out.println("price is "+price);
    }
    public static void main(String[] args) {
        cpu ob1= new cpu(80000);
        ob1.displaycpu();
        cpu.processor p1= ob1.new processor(8,"intel");
        p1.displaypro();
        cpu.ram r1=new cpu.ram(16,"samsung");
        r1.displayram();

    }
}
