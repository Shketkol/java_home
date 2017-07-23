package Week2.H6;

import java.util.ArrayList;

/**
 * Created by nick on 21.07.2017.
 */
public class Shelf {

    public ArrayList<Book> books = new ArrayList<Book>();

    public void add_book(Book b){
        books.add(b);
    };

    public int count_books(){
        return books.size();
    };

    public Object search_field(String search){
        ArrayList<String> books_search = new ArrayList<String>();
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).title.equals(search)){
                books_search.add(books.get(i).title);
            }
        }
        return books_search;
    };

    public Object search_all(String search){
        ArrayList<String> books_search = new ArrayList<String>();
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).count_pages.equals(search)){
                if(books_search.contains(books.get(i).title) == false){
                    books_search.add(books.get(i).title);
                }
            }
            if(books.get(i).count_charter.equals(search)){
                if(books_search.contains(books.get(i).title) == false){
                    books_search.add(books.get(i).title);
                }
            }
            if(books.get(i).author.equals(search)){
                if(books_search.contains(books.get(i).title) == false){
                    books_search.add(books.get(i).title);
                }
            }
            if(books.get(i).title.equals(search)){
                if(books_search.contains(books.get(i).title) == false){
                    books_search.add(books.get(i).title);
                }
            }
            if(books.get(i).isbn.equals(search)){
                if(books_search.contains(books.get(i).title) == false){
                    books_search.add(books.get(i).title);
                }
            }
            if(books.get(i).price.equals(search)){
                if(books_search.contains(books.get(i).title) == false){
                    books_search.add(books.get(i).title);
                }
            }
            if(books.get(i).publication.equals(search)){
                if(books_search.contains(books.get(i).title) == false){
                    books_search.add(books.get(i).title);
                }
            }
            if(books.get(i).publication_year.equals(search)){
                if(books_search.contains(books.get(i).title) == false){
                    books_search.add(books.get(i).title);
                }
            }
            if(books.get(i).binding.equals(search)){
                if(books_search.contains(books.get(i).title) == false){
                    books_search.add(books.get(i).title);
                }
            }
        }
        return books_search;
    };

    public void delete_book(String t){
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).title.equals(t)){
                books.remove(i);
            }
        }
    }

}
