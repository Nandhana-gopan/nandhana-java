import java.util.Scanner;
class pub {
    String publishername;

    pub(String publishername){
        this.publishername=publishername;
    }
    
}
class book extends pub {
    String booktitle;
    String authorname;

    book(String booktitle,String authorname,String publishername){

        super(publishername);
        this.booktitle=booktitle;
        this.authorname=authorname;

    }
}
class literature extends book {
    literature(String publishername,String booktitle,String authorname){
        super(booktitle, authorname, publishername);
    }
    void display() {
        System.out.println("Category:Literature");
        System.out.println("publisher: "+publishername);
        System.out.println("Booktitle: "+booktitle);
        System.out.println("Author: "+authorname);
    }
}
class fiction extends book {
    fiction(String publishername,String booktitle,String authorname){
        super(booktitle,authorname,publishername);
    }
    void display(){
         System.out.println("Category:Fiction");
        System.out.println("publisher: "+publishername);
        System.out.println("Booktitle: "+booktitle);
        System.out.println("Author: "+authorname);
    }
}
public class publisher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the category:");
        String category=sc.nextLine();
        System.out.println("enter the publisher name:");
        String pub=sc.nextLine();
        System.out.println("enter the book name:");
        String book=sc.nextLine();
        System.out.println("enter the author name:");
        String author=sc.nextLine();

        if(category.equalsIgnoreCase("literature")){
            literature l = new literature(pub,book,author);
            l.display();
        }
        else if(category.equalsIgnoreCase("fiction")){
            fiction f=new fiction(pub, book, author);
            f.display();
        }
        else {
            System.out.println("invalid category");
        }
        sc.close();

    }
}
