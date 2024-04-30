public class Task{
    public static void main(String[] args) {
        Book book1 = new Book("The Art of Computer Programming", "Donald Knuth", 1968, 263.07);
        Book book2 = new Book("Clean Code", "Robert Cecil Martin", 2008, 32.19);
        Book book3 = new Book("Working effectively with legacy code", " Michael C. Feathers", 2004, 51.99);
        System.out.println("Book 1:\nTitle: "+book1.title+"\nAuthor: "+book1.author+"\nYear Published: "+book1.yearPublished+"\nPrice: $"+book1.price);
        System.out.println("Book 2:\nTitle: "+book2.title+"\nAuthor: "+book2.author+"\nYear Published: "+book2.yearPublished+"\nPrice: $"+book2.price);
        System.out.println("Book 3:\nTitle: "+book3.title+"\nAuthor: "+book3.author+"\nYear Published: "+book3.yearPublished+"\nPrice: $"+book3.price);
    }
}
class Book{
    String title;
    String author;
    int yearPublished;
    double price;
    Book(String title,String author,int yearPublished,double price){
        this.title = title;
        this.author=author;
        this.yearPublished=yearPublished;
        this.price=price;
    }
}
