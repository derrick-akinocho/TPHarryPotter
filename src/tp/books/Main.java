package tp.books;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        BookFactory bookFactory = new BookFactory();

        System.out.println("---- les titres des livres ----");
        bookFactory.printBookTitles();

        System.out.println("\n---- Titres des tomes ----");
        bookFactory.printOnlyTome1AndTome7();

        System.out.println("\n---- Titres des livres séparés par | ----");
        String titlesInString = bookFactory.getTitlesInAString();
        System.out.println(titlesInString);

        System.out.println("\n---- Somme des numéros des tomes ----");
        int sumTomes = bookFactory.getTomeNumSum();
        System.out.println("Somme : " + sumTomes);

        System.out.println("\n---- Descriptions contenant le mot 'secrets' ----");
        String word1 = "secrets";
        List<String> descriptions1 = bookFactory.getSomeDescriptions(word1);
        descriptions1.forEach(System.out::println);

        System.out.println("\n---- Descriptions contenant le mot 'SECRETS' ----");
        String word2 = "SECRETS";
        List<String> descriptions2 = bookFactory.getSomeDescriptions(word2);
        descriptions2.forEach(System.out::println);

        System.out.println("\n---- Descriptions contenant le mot 'HARRY' ----");
        String word3 = "HARRY";
        List<String> descriptions3 = bookFactory.getSomeDescriptions(word3);
        descriptions3.forEach(System.out::println);

        System.out.println("\n---- Tailles des titres des livres ----");
        int[] titleSizes = bookFactory.getTitleSizes();

        for (int size : titleSizes) {
            System.out.print( " - " + size);
        }

        System.out.println("\n---- Titre(s) le(s) plus long(s) ----");
        bookFactory.printLongestTitles(titleSizes);

        System.out.println("\n---- Titre le plus court ----");
        bookFactory.printShortestTitles(titleSizes);
    }

}
