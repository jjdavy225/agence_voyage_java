public class Utilisateur {
    private String id,nom,prenoms,email,contact;

    Utilisateur(String id, String nom, String prenoms, String email, String contact){
        this.id = id;
        this.nom = nom;
        this.prenoms = prenoms;
        this.email = email;
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenoms() {
        return prenoms;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }
}
