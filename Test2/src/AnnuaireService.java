import java.util.HashSet;
import java.util.Set;

public class AnnuaireService {

    public Set<Person> annuaire = new HashSet<Person>();

    public Set<Person> ajouterPersonne(Person person) {
        try {
            for (Person p : annuaire) {
                if (p.equals(person)) {
                    throw new PersonneDejaPresenteException("La personne est déjà présente dans l'annuaire");
                }
            }
            annuaire.add(person);
        } catch (PersonneDejaPresenteException e) {
            e.printStackTrace();
        }
        return annuaire;
    }

    public Set<Person> supprimerPersonne(Person person) {
        try {
            for (Person p : annuaire) {
                if (p.equals(person)) {
                    annuaire.remove(person);
                    return annuaire;
                }
            }
            throw new PersonneNonPresenteException("La personne n'est pas présente dans l'annuaire");
        } catch (PersonneNonPresenteException e) {
            e.printStackTrace();
        }
        return annuaire;
    }

    public String toString() {
        String res = "";
        for (Person p : annuaire) {
            if (p.getIsStudent()) {
                res = res + (p.getName() + " est un étudiant de " + p.getAge() + " ans et son email est " + p.getEmail() + "\n");
            } else {
                res = res + (p.getName() + " est une personne non étudiante de " + p.getAge() + " ans et son email est " + p.getEmail() + "\n");
            }
        }
        return res;
    }


}
