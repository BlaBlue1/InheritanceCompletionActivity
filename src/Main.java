
public class Main {
    public static void main(String []args) {

        Book b = new Book("Danielle Steel", "Neighbors");
        Product p = new Product("Kindle", "Application", 40.00f);
        Software s = new Software("Xerox","Microsoft Word","Microsoft");

        System.out.println(b.toString());
        System.out.println(p.toString());
        System.out.println(s.toString());

    }
}
