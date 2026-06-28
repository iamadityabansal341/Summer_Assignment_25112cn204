import java.util.Scanner;

class q1{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int bookId;
        String bookName;
        String author;
        System.out.print("Book ID: ");
        bookId =sc.nextInt();
        sc.nextLine();
        System.out.print("book name: ");
        bookName =sc.nextLine();
        System.out.print("author mame: ");
        author = sc.nextLine();
        System.out.println("book ID: "+bookId);
        System.out.println("book name: "+bookName);
        System.out.println("author: "+author);
    }
}