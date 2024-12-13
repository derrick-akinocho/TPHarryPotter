package tp.actors;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ActorFactory actorFactory = new ActorFactory();

        System.out.println("---- Liste des prénoms en majuscules ----");
        actorFactory.printFirstNameInUppercase();

        System.out.println("\n---- Années de naissance des acteurs ----");
        actorFactory.printBirthYearOfActors();

        System.out.println("\n---- Acteur le plus jeune ----");
        String youngest = actorFactory.getYoungestActor();
        System.out.println("Le plus jeune : " + youngest);

        System.out.println("\n---- Acteur le plus vieux ----");
        String oldest = actorFactory.getOldestActor();
        System.out.println("Le plus âgé : " + oldest);

        System.out.println("\n---- Dates de naissance au format '3 juillet 2005' ----");
        List<String> longBirthdates = actorFactory.getBirthdatesInLongFormat();
        longBirthdates.forEach(System.out::println);

        System.out.println("\n---- Âge des acteurs ----");
        actorFactory.printAgeOfActors();

        System.out.println("\n---- Prénoms et rôles des acteurs ----");
        actorFactory.printFirstNameAndRoleOfActors();
    }

}
