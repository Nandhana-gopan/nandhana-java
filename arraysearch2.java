import java.util.Scanner;
public class arraysearch2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to be searched:");
        int ele=sc.nextInt();
        boolean found=false;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==ele)
            {
                System.out.println("element found at position "+count);
                found=true;
                break;
            }
            count++;
        }
        if(found==false)
        {
            System.out.println("element not found");
        }
    }
    
}
