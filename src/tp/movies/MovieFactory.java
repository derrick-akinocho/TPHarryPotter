package tp.movies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MovieFactory {

    private final List<Movie> movies = Arrays.asList(
            new Movie("Harry Potter à l'école des sorciers", 2001, "Chris Columbus",
                    "Le début du destin magique d'un garçon pas comme les autres"),
            new Movie("Harry Potter et la chambre des secrets", 2002, "Chris Columbus",
                    "Dans les entrails de Poudlard, le mal se réveille"),
            new Movie("Harry Potter et le prisonnier d'Azkaban", 2004, "Alfonso Cuarón",
                    "Les secrets du passé gissent. Tout ce qui a été imaginé sera transformé"),
            new Movie("Harry Potter et la coupe de feu", 2005, "Mike Newell",
                    "Des heures sombres et difficiles s'annoncent"),
            new Movie("Harry Potter et l'ordre du Phénix", 2007, "David Yates",
                    "La rébellion commence à Poudlard"),
            new Movie("Harry Potter et le prince de sang-mêlé", 2009, "David Yates",
                    "De sombres secrets dévoilés pour faire face à la bataille finale"));


    public void printDescriptionInDesorder() {
        movies.stream()
                .map(movie -> List.of(movie.getDescription().split(" ")))
                .forEach(words -> {
                    List<String> desorders = new ArrayList<>(words);
                    java.util.Collections.shuffle(desorders);
                    System.out.println(String.join(" ", desorders));
                });
    }

    public String getMovieTitleByDirector(String director) {
        List<String> titles = movies.stream()
                .filter(movie -> movie.getDirector().equalsIgnoreCase(director))
                .map(Movie::getTitle)
                .toList();

        return titles.isEmpty()
                ? "Le réalisateur introuvable"
                : String.join(", ", titles);
    }

    public List<String> getMovieTitleWithReleaseYearPair() {
        return movies.stream()
                .filter(movie -> movie.getReleaseYear() % 2 == 0)
                .map(Movie::getTitle)
                .collect(Collectors.toList());
    }

    public List<String> getMovieTitleWithReleaseYearOdd() {
        return movies.stream()
                .filter(movie -> movie.getReleaseYear() % 2 != 0)
                .map(Movie::getTitle)
                .collect(Collectors.toList());
    }

    public void printMoviesByPartOfDescription(String part) {
        movies.stream()
                .filter(movie -> movie.getDescription().toLowerCase().contains(part.toLowerCase()))
                .map(Movie::getTitle)
                .forEach(System.out::println);
    }

    public List<String> get3FirstWordsDescription() {
        return movies.stream()
                .map(movie -> {
                    String[] words = movie.getDescription().split(" ");
                    return String.join(" ", words[0], words[1], words[2]);
                })
                .collect(Collectors.toList());
    }

}
