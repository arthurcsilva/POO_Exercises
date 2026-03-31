import java.util.Scanner;

public class TechLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] bookLists = new Book[5];
        int option, option2;

        bookLists[0] = new Book("Use a cabeça", "Kathy Sierra, Bert Bates e Trisha Gee",2024, "Programming", "A1", true);
        bookLists[1] = new Book("Entendendo Algoritmos", "Aditya Y. Bhargava",2017, "Programming", "A2", false);
        bookLists[2] = new Book("O Codificador Limpo", "Bob Martin",2012, "Programming", "A3", false);
        bookLists[3] = new Book("Arquitetura Limpa", "Robert C. Martin ",2019, "Programming", "A4", true);
        bookLists[4] = new Book("Refatoração", "Martin Fowler",2020, "Programming", "A5", false);

        do {
            System.out.println(Book.showMenu());
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("--- LISTING ALL BOOKS ---");
                    for (int i = 0; i < bookLists.length; i++) {
                        System.out.println("Book [" + i + "]");
                        System.out.println(bookLists[i].showInfo());
                    }
                    break;
                case 2:
                    System.out.println("--- AVAILABLE BOOKS TO BORROW ---");
                    for (int i = 0; i < bookLists.length; i++) {
                        if (!bookLists[i].isBorrowed()){
                            System.out.println("["+ i +"] - " + bookLists[i].getTitle());
                        }
                    }
                    System.out.println("What book do you want borrow?");
                    option2 = sc.nextInt();
                    if (option2 >= 0 && option2 < bookLists.length) {
                        bookLists[option2].setBorrowed(true);
                        System.out.println("Success! Your check out has been scheduled for today.");
                    } else {
                        System.out.println("Error: This book index does not exist!");
                    }
                    Book.delay(2000);
                    break;
                case 3:
                    System.out.println("--- AVAILABLE BOOKS TO RETURN ---");
                    for (int i = 0; i < bookLists.length; i++) {
                        if (bookLists[i].isBorrowed()){
                            System.out.println("["+ i +"] - " + bookLists[i].getTitle());
                        }
                    }
                    System.out.println("What book do you want to return?");
                    option2 = sc.nextInt();
                    if (option2 >= 0 && option2 < bookLists.length) {
                        bookLists[option2].setBorrowed(false);
                        System.out.println("Success! Your returned has been made.");
                        Book.delay(2000);
                    } else {
                        System.out.println("Error: This book index does not exist!");
                    }
                    Book.delay(2000);
                    break;
                case 4:
                    System.out.println("Exiting, See you Later!");
                    break;
                default:
                    System.out.println("Invalid option, Try again.");
            }
        } while (option != 4);

        sc.close();
    }
}
