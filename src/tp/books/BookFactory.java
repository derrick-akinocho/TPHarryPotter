package tp.books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookFactory {

    private final List<Book> books = Arrays.asList(
            new Book(1, "Harry Potter à l'Ecole des Sorciers", "Que cache la trappe du troisième étage ?"),
            new Book(2, "Harry Potter et la Chambre des Secrets", "Harry résoudra-t-il le mystère de la chambre des secrets ?"),
            new Book(3, "Harry Potter et le Prisonnier d'Azkaban", "Qui est Sirius Black ?"),
            new Book(4, "Harry Potter et la coupe de feu", "Qui gagnera le tournoi des trois sorciers ?"),
            new Book(5, "Harry Potter et l'ordre du Phénix", "Harry et ses amis réussiront-ils à sauver Sirius Black ?"),
            new Book(6, "Harry Potter et le prince de sang mêlé", "Qui est le prince de sang-mêlé ?"),
            new Book(7, "Harry Potter et les reliques de la mort", "Harry parviendra-t-il à retrouver tous les horcruxes et à les détruire ?"));


    public void printBookTitles() {
        for (Book book : books) {
            System.out.println("Titre : " + book.getTitle());
        }
    }

    public void printOnlyTome1AndTome7() {
        books.stream().filter(book -> book.getTomeN() == 1 || book.getTomeN() == 7)
                .forEach(book -> System.out.println(book.getTitle()));
    }

    public String getTitlesInAString() {
        return String.join(" | ", books.stream().map(Book::getTitle).toList());
    }

    public int getTomeNumSum() {
        return books.stream().mapToInt(Book::getTomeN).sum();
    }

    public List<String> getSomeDescriptions(String word) {
        word = word.toLowerCase();
        String finalWord = word;
        return books.stream()
                .map(Book::getDescription)
                .filter(description -> description.toLowerCase().contains(finalWord))
                .toList();
    }

    public int[] getTitleSizes() {
        return books.stream().mapToInt(book -> book.getTitle().length()).toArray();
    }

    public void printLongestTitles(int[] sizes) {
        int maxSize = Arrays.stream(sizes).max().orElse(0);
        books.stream().filter(book -> book.getTitle().length() == maxSize)
                .forEach(book -> System.out.println(book.getTitle()));
    }

    public void printShortestTitles(int[] sizes) {
        int minSize = Arrays.stream(sizes).min().orElse(0);
        books.stream()
                .filter(book -> book.getTitle().length() == minSize)
                .forEach(book -> System.out.println(book.getTitle()));
    }

}
