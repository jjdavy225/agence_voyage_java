import java.util.ArrayList;

public class Client extends Utilisateur{

    private static ArrayList<Client> lClients;

    Client(String id , String nom, String prenoms, String email, String contact){
        super(id, nom, prenoms, email, contact);
        lClients.add(this);
    }


}
