public class Book extends Item {
  3 usages
  private String author;
  3 usages
  private int numberOfPages;
  3 usages
  private String genre;
  1 usages
  public Book(String name, String description, String ID, float price, String author, int numberOfPages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }
  no usages
  public String getAuthor() {
        return author;
  }
  no usages
  public void setAuthor(String author) {
        this.author = author;
    }
  no usages
  public int getNumberOfPages() {
        return numberOfPages;
    }
  no usages
 public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
  no usages
   public String getGenre() {
        return genre;
    }
  no usages
  public void setGenre(String genre) {
        this.genre = genre;
    }
}
