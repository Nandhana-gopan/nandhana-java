import java.util.Scanner;

public class string {

    void upper(Scanner sc) {
        System.out.print("Enter the lowercase string : ");
        String s = sc.next();
        System.out.println("Uppercase: " + s.toUpperCase());
    }
    void lower(Scanner sc) {
        System.out.print("Enter the uppercase string: ");
        String s = sc.next();
        System.out.println("lowercase: " + s.toLowerCase());
    }
    void con(Scanner sc) {
        System.out.print("Enter the string1 to concatenate: ");
        String s = sc.next();
        System.out.print("Enter the string2 to concatenate: ");
        String s1 = sc.next();
        System.out.println("concatenated string: " + s.concat(s1));
    }
    void len(Scanner sc) {
        System.out.print("Enter the string to find length: ");
        String s = sc.next();
        System.out.println("length of the string is " + s.length());
    }
    void sub(Scanner sc) {
        System.out.print("Enter the string to find substring: ");
        String s = sc.next();
        System.out.print("Enter the range to be extracted");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("substring is " + s.substring(a,b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        string obj = new string();
        obj.upper(sc);
        obj.lower(sc);
        obj.con(sc);
        obj.len(sc);
        obj.sub(sc);
        sc.close();

    }
}
