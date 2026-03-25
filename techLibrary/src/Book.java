public class Book {
    private String title;
    private String author;
    private int yearPub;
    private String category;
    private String position;
    private boolean borrow;

    public Book(String title, String author, int yearPub, String category, String position, boolean borrow) {
        this.title = title;
        this.author = author;
        this.yearPub = yearPub;
        this.category = category;
        this.position = position;
        this.borrow = borrow;
    }

    public String showInfo() {
        return "Title: " + this.title + ".\n" +
                "Author: " + this.author + ".\n" +
                "Publication: " + this.yearPub + ".\n" +
                "Category: " + this.category + ".\n" +
                "Position: " + this.position + ".\n" +
                "Borrowed: " + (this.borrow ? "Yes" : "No") + ".\n";
    }

    public String availableBooks() {
        if (this.borrow) {
            return "This book isn't avaiable to borrow. \n" +
                    "Would you like me to put your name on the waiting list?";
        } else {
            return "This book is avaible to borrow. \n" +
                    "Would you like to borrow this book?";
        }
    }

    public static String showMenu() {
            return "----- WELCOME TO ARARAS TECH LIBRARY -----\n" +
                    "Please choose one option below:\n" +
                    "[1] Show me all the books on catalog\n" +
                    "[2] Borrow a book\n" +
                    "[3] Return a book\n" +
                    "[4] Exit\n" +
                    "Option: ";
    }
}
