package Week2.H6;

/**
 * Created by nick on 21.07.2017.
 */
public class Book {
    public String count_pages;
    public String count_charter;
    public String author;
    public String title;
    public String isbn;
    public String price;
    public String publication;
    public String publication_year;
    public String binding;

    Book(String count_pages, String count_charter, String author, String title,
         String isbn, String price,
         String publication, String publication_year, String binding){
        this.count_pages = count_pages;
        this.count_charter = count_charter;
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.publication = publication;
        this.publication_year = publication_year;
        this.binding = binding;
    }
}
