public class BookDB {


    public Book getBook(String SKU) {
        Book b;
        if (SKU.equalsIgnoreCase("Java1001")) {
            b = new Book("Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50);
        } else if (SKU.equalsIgnoreCase("Java1002")) {
            b = new Book("Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 20.00);
        } else if (SKU.equalsIgnoreCase("Orcl1003")) {
            b = new Book("OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky", "Everything you need to know in one place", 45.00);
        } else if (SKU.equalsIgnoreCase("Python1004")) {
            b = new Book("Automate the Boring Stuff with Python", "Al Sweigart", "Fun with Python", 10.50);
        } else if (SKU.equalsIgnoreCase("Zombie1005")) {
            b = new Book("The Maker's Guide to the Zombie Apocalypse", "Simon Monk", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50);
        } else if (SKU.equalsIgnoreCase("Rasp1006")) {
            b = new Book("Raspberry Pi Projects for the Evil Genius", "Donald Norris", "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75);
        } else {
            b = new Book("n/a", "n/a", "product not found in our databases");
        }
        return b;
    }
}
