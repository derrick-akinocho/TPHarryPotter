package tp.actors;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

public class ActorFactory {

    private final List<Actor> actors = Arrays.asList(
                new Actor("Daniel Radcliffe", LocalDate.of(1989, 7, 23), "Harry Potter"),
                new Actor("Emma Watson", LocalDate.of(1990, 4, 15), "Hermione Granger"),
                new Actor("Rupert Grint", LocalDate.of(1988, 8, 24), "Ron Weasley"),
                new Actor("Alan Rickman", LocalDate.of(1946, 2, 21), "Severus Rogue"),
                new Actor("Tom Felton", LocalDate.of(1987, 9, 22), "Drago Malefoy"),
                new Actor("Bonnie Wright", LocalDate.of(1991, 2, 17), "Ginnie Weasley"),
                new Actor("Matthew Lewis", LocalDate.of(1989, 6, 27), "Neville Londubat"),
                new Actor("Michael Gambon", LocalDate.of(1940, 10, 19), "Albus Dumbledore"));

    public void printFirstNameInUppercase() {
        actors.stream()
                .map(actor -> actor.getFullName().split(" ")[0].toUpperCase())
                .forEach(System.out::println);
    }

    public void printBirthYearOfActors() {
        actors.stream()
                .map(actor -> actor.getBirthDate().getYear())
                .forEach(System.out::println);
    }

    public String getYoungestActor() {
        return actors.stream()
                .max((a1, a2) -> a1.getBirthDate().compareTo(a2.getBirthDate()))
                .map(Actor::getFullName).orElse("...");
    }

    public String getOldestActor() {
        return actors.stream()
                .min((a1, a2) -> a1.getBirthDate().compareTo(a2.getBirthDate()))
                .map(Actor::getFullName)
                .orElse("...");
    }

    public List<String> getBirthdatesInLongFormat() {
        return actors.stream()
                .map(actor -> actor.getBirthDate().getDayOfMonth() + " " +
                        actor.getBirthDate().getMonth().toString().toLowerCase() + " " +
                        actor.getBirthDate().getYear())
                .toList();
    }

    public void printAgeOfActors() {
        LocalDate today = LocalDate.now();
        actors.forEach(actor -> {
            int age = Period.between(actor.getBirthDate(), today).getYears();
            System.out.println(actor.getFullName() + " a " + age + " ans");
        });
    }

    public void printFirstNameAndRoleOfActors() {
        actors.forEach(actor -> {
            String firstName = actor.getFullName().split(" ")[0];
            System.out.println(firstName + " = " + actor.getRole());
        });
    }
}
