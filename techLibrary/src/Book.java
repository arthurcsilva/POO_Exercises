public class Book {
    private String title;
    private String author;
    private int yearPub;
    private String category;
    private String position;
    private boolean borrow;

    public void setBorrowed(boolean borrow) {
        this.borrow = borrow;
    }

    public Book(String title, String author, int yearPub, String category, String position, boolean borrow) {
        this.title = title;
        this.author = author;
        this.yearPub = yearPub;
        this.category = category;
        this.position = position;
        this.borrow = borrow;
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

    public String showInfo() {
        return  "Title: " + this.title + ".\n" +
                "Author: " + this.author + ".\n" +
                "Publication: " + this.yearPub + ".\n" +
                "Category: " + this.category + ".\n" +
                "Position: " + this.position + ".\n" +
                "Borrowed: " + (this.borrow ? "Yes" : "No") + ".\n";
    }

    public static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("Error on timer.");
        }
    }

    //getters
    public boolean isBorrowed() {
        return borrow;
    }

    public String getTitle () {
        return title;
    }

}
