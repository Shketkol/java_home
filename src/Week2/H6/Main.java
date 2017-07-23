package Week2.H6;

/**
 * Created by nick on 21.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Shelf shel = new Shelf();

        Book books_obj1 = new Book("125", "2", "Test", "title",
                "2015-41", "125.00",
                "MOSKOV", "2016", "tv");
        Book books_obj2 = new Book("125", "2", "Test56", "title56",
                "2015-41", "125.00",
                "MOSKOV", "2016", "tv");

        shel.add_book(books_obj1);
        shel.add_book(books_obj2);
        System.out.println(shel.count_books());

        System.out.println(shel.search_field("title"));

        System.out.println(shel.search_all("2016"));

        shel.delete_book("title");
        System.out.println(shel.count_books());

    }
}

