import java.util.ArrayList;

public class Pilote extends Utilisateur {
    private static ArrayList<Pilote> lPilotes;

    private String matricule;

    Pilote(String id , String nom, String prenoms, String email, String contact, String matricule){
        super(id, nom, prenoms, email, contact);
        this.matricule = matricule;
        lPilotes.add(this);
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
}
