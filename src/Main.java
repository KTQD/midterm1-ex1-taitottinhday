public class Main {
    public static void main(String[] args) {

        MP3 mp3 = new MP3("cheer up", "dsadas", "123456", 11.1f, "344", 180);
        System.out.println("MP3 Information:");
        mp3.showInfo();

        Book book = new Book("caycamngot", "asdsad", "789012", 29.99f, "fdssd", 300, "Fiction");
        System.out.println("\nBook Information:");
        book.showInfo();
       

    }
}
