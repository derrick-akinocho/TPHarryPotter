package tp.movies;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        MovieFactory movieFactory = new MovieFactory();

        System.out.println("---- Descriptions mélangées ----");
        movieFactory.printDescriptionInDesorder();

        System.out.println("\n---- Film réalisé par David Yates ----");
        String movieByChris = movieFactory.getMovieTitleByDirector("David Yates");
        System.out.println("Film : " + movieByChris);

        System.out.println("\n---- Films sortis une année paire ----");
        List<String> evenYearMovies = movieFactory.getMovieTitleWithReleaseYearPair();
        evenYearMovies.forEach(System.out::println);

        System.out.println("\n---- Films sortis une année impaire ----");
        List<String> oddYearMovies = movieFactory.getMovieTitleWithReleaseYearOdd();
        oddYearMovies.forEach(System.out::println);

        System.out.println("\n---- Films avec 'secrets' dans la description ----");
        movieFactory.printMoviesByPartOfDescription("secrets");

        System.out.println("\n---- 3 premiers mots des descriptions ----");
        List<String> firstThreeWords = movieFactory.get3FirstWordsDescription();
        firstThreeWords.forEach(System.out::println);
    }

}
