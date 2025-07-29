public class Tester6 {
public static void main(String[] args) {
Book book = new Book(1, "The Alchemist", 500, "97806",
"HarperCollins");
System.out.println(book.printDetail());
System.out.println("-----------------------");
CD cd = new CD(2, "Shotto", 300, "Warfaze", 50, "Hard Rock");
System.out.println(cd.printDetail());
}
}