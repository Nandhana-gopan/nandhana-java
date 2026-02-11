import java.util.Scanner;
public class arraysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.err.println("enter the elements of array");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the element to be searched ");
        int ele=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<size;i++)
        {
            if(a[i]==ele)
            {
              System.out.println("element found");
              flag=true;
              break;
            }
        }
        if(flag==false)
        {
            System.out.println("not found");
        }

    }
    
}
