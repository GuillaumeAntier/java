import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws CustomException, VoitureDejaPresenteException, PersonneDejaPresenteException, PersonneNonPresenteException, TooOldException {

        Car car1 = new Car("1234", "Renault");
        Car car2 = new Car("1234", "Mercedes");
        Car car3 = new Car("5678", "Renault");

        System.out.println(car1.equals(car2));

        Set <Car> carSet = new HashSet<>();
        carSet.add(car1);
        carSet.add(car2);

        System.out.println(ajouterVoiture(car3, carSet));

        Person person1 = new Student("Jean", 26, "jean.daniel@gmail.com");
        Person person2 = new Person("Jean", 25, "jean.dupont@gmail.com");
        Person person3 = new Student("Jea", 25, "jean.daniel@gmail.com");

        AnnuaireService annuaireService = new AnnuaireService();
        annuaireService.ajouterPersonne(person1);
        annuaireService.ajouterPersonne(person2);
        annuaireService.supprimerPersonne(person3);

        System.out.println(annuaireService.toString());
    }

    public static Set<Car> ajouterVoiture(Car car, Set<Car> cars) throws VoitureDejaPresenteException {
        if (cars.contains(car)) {
            throw new VoitureDejaPresenteException("La voiture est déjà présente dans la liste");
        }
        cars.add(car);
        return cars;
    }

    public static Set<Person> ajouterPersonne(Person person, Set<Person> persons) throws PersonneDejaPresenteException {
        if (persons.contains(person)) {
            throw new PersonneDejaPresenteException("La personne est déjà présente dans la liste");
        }
        persons.add(person);
        return persons;
    }
}