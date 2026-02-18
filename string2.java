import java.util.Scanner;

public class string2 {
    
    void uppercase(Scanner sc)
    {
        System.out.println("enter the string:");
        String s=sc.next();
        System.out.println("Uppercase:" +s.toUpperCase());
    }

     void lowercase(Scanner sc)
    {
        System.out.println("enter the string:");
        String s=sc.next();
        System.out.println("Uppercase:" +s.toLowerCase());
    }
    void concat(Scanner sc)
    {
         System.out.println("enter the first string:");
        String s=sc.next();
         System.out.println("enter the second string:");
        String p=sc.next();
         System.out.println("concated:"+s.concat(p));
        
    }
    void substring(Scanner sc)
    {
       System.out.println("enter the string:");
        String s=sc.next();
        System.out.println("enter the range:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("substring:"+s.substring(a, b));
        
    }
    void length(Scanner sc)
    {
         System.out.println("enter the string:");
        String s=sc.next();
        System.out.println("length:"+s.length());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        string2 obj=new string2();
        obj.uppercase(sc);
        obj.lowercase(sc);
        obj.concat(sc);
        obj.substring(sc);
        obj.length(sc);
    }
}
